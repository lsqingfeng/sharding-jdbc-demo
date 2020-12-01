package cn.cestc.standard.algorithm;

import org.apache.shardingsphere.api.sharding.standard.PreciseShardingAlgorithm;
import org.apache.shardingsphere.api.sharding.standard.PreciseShardingValue;
import org.springframework.stereotype.Component;

import java.util.Collection;

/**
 * @className: DatabasePreciseShardingAlgorithm
 * @description:
 * @author: sh.Liu
 * @date: 2020-11-15 21:56
 */
@Component
public class DatabasePreciseShardingAlgorithm implements PreciseShardingAlgorithm<Long> {
    @Override
    public String doSharding(Collection<String> collection, PreciseShardingValue<Long> preciseShardingValue) {
        // 这个字段就是  sharding-column: user_id
        Long curValue = preciseShardingValue.getValue();
        String curBase = "";
        if (curValue % 2 == 0) {
            curBase =  "ds0";
        }else{
            curBase = "ds1";
        }
        return curBase;
    }
}