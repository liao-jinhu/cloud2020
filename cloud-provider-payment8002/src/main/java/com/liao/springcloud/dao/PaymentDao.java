package com.liao.springcloud.dao;

import com.liao.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: liaojinhu
 * @Date: 2021/07/11/18:14
 * @Description:
 */

@Mapper
public interface PaymentDao {
    public int createPayment (Payment payment);
    public  Payment getPaymentById(@Param("id")long id);
}
