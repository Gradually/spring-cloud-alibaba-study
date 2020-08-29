package top.gradual.gateway.filter;

import java.time.LocalDateTime;

import lombok.extern.apachecommons.CommonsLog;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.core.Ordered;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

/**
 * @Description: 自定义全局过滤器
 * @Author: gradual
 * @Date: 2020-08-29 3:30 下午
 */
@Component
public class MyLogGatewayFilter implements GlobalFilter, Ordered {

    private final static Logger LOGGER = LoggerFactory.getLogger(MyLogGatewayFilter.class);

    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
        LOGGER.info("logs -> {}", LocalDateTime.now());
        String username = exchange.getRequest().getQueryParams().getFirst("username");
        LOGGER.info("username -> {}", username);
        if (StringUtils.isEmpty(username)) {
            LOGGER.error("username is null");
            exchange.getResponse().setStatusCode(HttpStatus.BAD_REQUEST);
            return exchange.getResponse().setComplete();
        }
        return chain.filter(exchange);
    }

    @Override
    public int getOrder() {
        return 0;
    }
}
