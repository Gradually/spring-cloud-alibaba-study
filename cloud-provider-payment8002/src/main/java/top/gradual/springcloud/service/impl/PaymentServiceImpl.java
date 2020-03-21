package top.gradual.springcloud.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import top.gradual.springcloud.dao.PaymentDao;
import top.gradual.springcloud.entities.Payment;
import top.gradual.springcloud.service.PaymentService;

/**
 * @Description: 支付服务实现类
 * @Author: gradual
 * @Date: 2020-03-19 10:56 下午
 */
@Service
public class PaymentServiceImpl implements PaymentService {

    @Resource
    private PaymentDao paymentDao;

    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(long id) {
        return paymentDao.getPaymentById(id);
    }
}
