package com.liao.springcloud.controller;

import com.liao.springcloud.entities.CommonResult;
import com.liao.springcloud.entities.Payment;
import com.liao.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: liaojinhu
 * @Date: 2021/07/11/18:18
 * @Description:
 */
@RestController
@Slf4j
public class PaymentController {

    @Value("${server.port}")
    private String serverPort;

    @Resource
    private PaymentService paymentService;


    @PostMapping("/payment/createPayment")
    public CommonResult create(Payment payment){
        int results = this.paymentService.createPayment(payment);
        log.info("*****插入操作返回结果:" + results);
        if(results>0){
            log.info("****插入成功*****");
            return new CommonResult(200,"插入成功,端口号："+ this.serverPort,results);
        }else {
            log.info("*****插入失败");
            return new CommonResult(404,"插入失败",null);
        }
    }


    @GetMapping("/payment/get/{id}")
    public CommonResult<Payment> getPayment(@PathVariable("id") Long id){
        Payment payment = this.paymentService.getPaymentById(id);
        log.info("查询结果:{}",payment);
        if (payment != null) {
            return new CommonResult(200,"查询成功了，端口号:"+ this.serverPort,payment);
        }else{
            return new CommonResult(444,"没有对应记录,查询ID: "+id,null);
        }
    }


}
