package top.gradual.springcloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Description: 启动类
 * @Author: gradual
 * @Date: 2020-03-19 10:33 下午
 */
//使用consul或者zookeeper作为注册中心时只需要这个就可以注册,不再需要EnableEureka这类的注解
@EnableDiscoveryClient
@SpringBootApplication
public class CloudPaymentApplication8003 {

    public static void main(String[] args) {
        SpringApplication.run(CloudPaymentApplication8003.class, args);
    }
}
