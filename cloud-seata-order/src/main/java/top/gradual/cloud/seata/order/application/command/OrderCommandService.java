package top.gradual.cloud.seata.order.application.command;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.gradual.cloud.seata.order.domain.order.OrderRepository;

/**
 * @Description: 订单指令服务
 * @Author: gradual
 * @Date: 2020-08-29 10:03 下午
 */
@Service
public class OrderCommandService {

    @Autowired
    private OrderRepository orderRepository;


}
