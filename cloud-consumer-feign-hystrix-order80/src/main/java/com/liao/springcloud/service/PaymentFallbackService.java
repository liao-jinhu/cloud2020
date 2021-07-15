package com.liao.springcloud.service;

import org.springframework.stereotype.Component;

@Component //必须加 //必须加 //必须加
public class PaymentFallbackService implements PaymentHystrixService
{


    @Override
    public String paymentInfo_OK(Integer id) {
        return "------paymentInfo_OK";
    }

    @Override
    public String paymentInfo_TimeOut(Integer id) {
        return "-----paymentInfo_TimeOut";
    }
}
 