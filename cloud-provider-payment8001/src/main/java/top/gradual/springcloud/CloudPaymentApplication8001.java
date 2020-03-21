package top.gradual.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Description: 启动类
 * @Author: gradual
 * @Date: 2020-03-19 10:33 下午
 */
@EnableEurekaClient
@EnableDiscoveryClient
@SpringBootApplication
public class CloudPaymentApplication8001 {

    public static void main(String[] args) {
        SpringApplication.run(CloudPaymentApplication8001.class, args);
    }

}

