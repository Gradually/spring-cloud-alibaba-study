package top.gradual.springcloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Description: 启动类
 * @Author: gradual
 * @Date: 2020-03-19 10:33 下午
 */
@EnableEurekaClient
@SpringBootApplication
public class CloudPaymentApplication8002 {

    public static void main(String[] args) {
        SpringApplication.run(CloudPaymentApplication8002.class, args);
    }
}
