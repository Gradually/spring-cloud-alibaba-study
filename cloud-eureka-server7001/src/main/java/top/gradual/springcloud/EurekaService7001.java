package top.gradual.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Description:
 * @Author: gradual
 * @Date: 2020-03-21 5:04 下午
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaService7001 {

    public static void main(String[] args) {
        SpringApplication.run(EurekaService7001.class, args);
    }

}
