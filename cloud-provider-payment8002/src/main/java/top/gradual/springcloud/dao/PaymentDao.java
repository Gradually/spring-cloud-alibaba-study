package top.gradual.springcloud.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import top.gradual.springcloud.entities.Payment;

/**
 * @Description:
 * @Author: gradual
 * @Date: 2020-03-19 10:45 下午
 */
@Mapper
public interface PaymentDao {

    int create(Payment payment);

    Payment getPaymentById(@Param("id") long id);
}
