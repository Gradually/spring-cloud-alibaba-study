package top.gradual.springcloud.controller;

import java.util.List;

import javax.annotation.Resource;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import top.gradual.springcloud.entities.CommonResult;
import top.gradual.springcloud.entities.Payment;
import top.gradual.springcloud.service.PaymentService;

/**
 * @Description:
 * @Author: gradual
 * @Date: 2020-03-19 10:58 下午
 */
@Slf4j
@RestController
public class PaymentController {

    @Resource
    private PaymentService paymentService;

    @Value("${server.port}")
    private String serverPort;

    @Resource
    private DiscoveryClient discoveryClient;

    @PostMapping("/payment/create")
    public CommonResult create(@RequestBody Payment payment) {
        int result = paymentService.create(payment);
        log.info("插入结果: result -> {}", result);
        if (result > 0) {
            return new CommonResult<Integer>(200, "插入数据库成功" + serverPort, result);
        } else {
            return new CommonResult(444, "插入数据库失败" + serverPort);
        }
    }

    @GetMapping("/payment/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable long id) {
        Payment paymentById = paymentService.getPaymentById(id);
        log.info("查询结果: result -> {}", paymentById);
        if (paymentById != null) {
            return new CommonResult<Payment>(200, "查询成功" + serverPort, paymentById);
        } else {
            return new CommonResult<Payment>(400, "查询失败" + serverPort, null);
        }
    }

    @GetMapping("/payment/lb/{id}")
    public CommonResult<Payment> getPaymentByIdWithLb(@PathVariable long id) {
        Payment paymentById = paymentService.getPaymentById(id);
        if (paymentById != null) {
            return new CommonResult<Payment>(200, "lb 查询成功" + serverPort, paymentById);
        } else {
            return new CommonResult<Payment>(400, "lb 查询失败" + serverPort, null);
        }
    }

    @GetMapping("/payment/discovery")
    public Object discovery() {
        List<String> services = discoveryClient.getServices();
        services.forEach(str -> log.info("service -> {}", str));
        System.out.println("------------------");
        List<ServiceInstance> instances = discoveryClient.getInstances("cloud-payment-service");
        instances.forEach(instance -> log.info("instance -> serviceId: {}, host: {}, port: {}, uri: {}", instance.getServiceId(), instance.getHost(), instance.getPort(), instance.getUri()));
        System.out.println("------------------");
        return discoveryClient;
    }

}
