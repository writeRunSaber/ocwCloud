package com.ocw.springcloud.modular.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.ocw.springcloud.modular.dao.PaymentMapper;
import com.ocw.springcloud.modular.model.Payment;
import com.ocw.springcloud.modular.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class PaymenyServiceImpl extends ServiceImpl<PaymentMapper,Payment> implements PaymentService {

    @Resource
    private PaymentMapper paymentMapper;

    @Override
    public int create(Payment payment) {
        return paymentMapper.create(payment);
    }

    @Override
    public Payment getPayMentById(Long id) {
        return paymentMapper.getPayMentById(id);
    }
}
