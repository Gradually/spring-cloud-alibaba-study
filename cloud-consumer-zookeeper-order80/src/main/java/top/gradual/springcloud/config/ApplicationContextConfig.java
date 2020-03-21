package top.gradual.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @Description:
 * @Author: gradual
 * @Date: 2020-03-21 3:57 下午
 */
@Configuration
public class ApplicationContextConfig {

    @Bean
    //开启Ribbon负载均衡
    @LoadBalanced
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
