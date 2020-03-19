package top.gradual.springcloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Description: 启动类
 * @Author: gradual
 * @Date: 2020-03-19 10:33 下午
 */
@SpringBootApplication
public class CloudPaymentApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudPaymentApplication.class, args);
    }
}
