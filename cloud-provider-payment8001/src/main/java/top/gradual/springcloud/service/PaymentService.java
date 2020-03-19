package top.gradual.springcloud.service;

import org.springframework.stereotype.Service;
import top.gradual.springcloud.entities.Payment;

/**
 * @Description:
 * @Author: gradual
 * @Date: 2020-03-19 10:56 下午
 */
public interface PaymentService {

    int create(Payment payment);

    Payment getPaymentById(long id);
}
