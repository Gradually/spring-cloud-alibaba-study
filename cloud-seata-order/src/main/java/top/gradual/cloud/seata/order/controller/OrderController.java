package top.gradual.cloud.seata.order.controller;

import org.aspectj.weaver.ast.Or;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import top.gradual.cloud.seata.order.application.command.OrderCommandService;
import top.gradual.cloud.seata.order.application.query.OrderQueryService;
import top.gradual.cloud.seata.order.domain.order.Order;
import top.gradual.cloud.seata.order.infrastructure.rest.request.OrderCreateRequest;
import top.gradual.springcloud.entities.CommonResult;

/**
 * @Description:
 * @Author: gradual
 * @Date: 2020-08-29 9:59 下午
 */
@RestController
public class OrderController {

    @Autowired
    private OrderQueryService orderQueryService;

    @Autowired
    private OrderCommandService orderCommandService;

    /**
     * @description: 获取订单信息
     *
     * @date: 2020/8/29 10:08 下午
     * @author: gradual
     *
     * @param id
     * @return: top.gradual.springcloud.entities.CommonResult<top.gradual.cloud.seata.order.domain.order.Order>
     */
    @GetMapping("/order/{id}")
    public CommonResult<Order> getOrderInfo(@PathVariable Long id) {
        Order order = orderQueryService.getById(id);
        return new CommonResult<>(200, "success", order);
    }

    @PostMapping("/order")
    public CommonResult<Object> createOrder(@RequestBody OrderCreateRequest request) {

        return new CommonResult<>(200, "success");
    }
}
