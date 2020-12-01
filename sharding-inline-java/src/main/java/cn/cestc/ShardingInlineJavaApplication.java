package cn.cestc;

import org.apache.shardingsphere.shardingjdbc.spring.boot.SpringBootConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @className: ShardingInlineJavaApplication
 * @description:
 * @author: sh.Liu
 * @date: 2020-11-15 10:57
 */
@SpringBootApplication(exclude = {SpringBootConfiguration.class})
public class ShardingInlineJavaApplication {
    public static void main(String[] args) {
        SpringApplication.run(ShardingInlineJavaApplication.class, args);
    }
}
