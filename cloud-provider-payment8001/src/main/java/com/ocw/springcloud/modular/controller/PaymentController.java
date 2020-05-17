package com.ocw.springcloud.modular.controller;


import com.ocw.springcloud.modular.enums.ResponseEnum;
import com.ocw.springcloud.modular.model.CommonResult;
import com.ocw.springcloud.modular.model.Payment;
import com.ocw.springcloud.modular.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/payment")
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    @RequestMapping("/create")
    public CommonResult create(Payment payment){
        int isCreate=paymentService.create(payment);
        if(isCreate > 0){
            return new CommonResult(ResponseEnum.RESULT_SUCCESS.getCode(),ResponseEnum.RESULT_SUCCESS.getMessage(),isCreate);
        }else {
            return new CommonResult(ResponseEnum.RESULT_ERROR.getCode(),ResponseEnum.RESULT_ERROR.getMessage(),0);
        }
    }

    @RequestMapping("/getPaymentById/{id}")
    public CommonResult getPaymentById(@PathVariable("id") Long id){
        Payment payment=paymentService.getPayMentById(id);
        if(payment != null){
            return new CommonResult(ResponseEnum.RESULT_SUCCESS.getCode(),ResponseEnum.RESULT_SUCCESS.getMessage(),payment);
        }else{
            return new CommonResult(ResponseEnum.RESULT_ERROR.getCode(),ResponseEnum.RESULT_ERROR.getMessage(),null);
        }
    }

}
