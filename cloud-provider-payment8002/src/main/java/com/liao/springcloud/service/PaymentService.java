package com.liao.springcloud.service;

import com.liao.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: liaojinhu
 * @Date: 2021/07/11/18:15
 * @Description:
 */
public interface PaymentService {
    public int createPayment (Payment payment);
    public  Payment getPaymentById(@Param("id")long id);
}
