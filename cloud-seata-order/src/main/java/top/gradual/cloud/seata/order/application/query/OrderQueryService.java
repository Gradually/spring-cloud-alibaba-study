package top.gradual.cloud.seata.order.application.query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.gradual.cloud.seata.order.domain.order.Order;
import top.gradual.cloud.seata.order.domain.order.OrderRepository;

/**
 * @Description: 订单查询服务
 * @Author: gradual
 * @Date: 2020-08-29 10:04 下午
 */
@Service
public class OrderQueryService {

    @Autowired
    private OrderRepository orderRepository;

    /**
     * @description: 获取订单信息
     *
     * @date: 2020/8/29 10:06 下午
     * @author: gradual
     *
     * @param id
     * @return: top.gradual.cloud.seata.order.domain.order.Order
     */
    public Order getById(Long id) {
        return orderRepository.findById(id).orElseThrow(() -> new RuntimeException("order not exist"));
    }
}
