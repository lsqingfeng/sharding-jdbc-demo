package cn.cestc;

import org.apache.shardingsphere.shardingjdbc.spring.boot.SpringBootConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @className: ShardingStandardJavaApplication
 * @description:
 * @author: sh.Liu
 * @date: 2020-11-15 11:00
 */
@SpringBootApplication(exclude = {SpringBootConfiguration.class})
public class ShardingStandardJavaApplication {
    public static void main(String[] args) {
        SpringApplication.run(ShardingStandardJavaApplication.class, args);
    }
}
