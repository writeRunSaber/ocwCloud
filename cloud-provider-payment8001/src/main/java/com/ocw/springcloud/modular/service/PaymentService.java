package com.ocw.springcloud.modular.service;

import com.baomidou.mybatisplus.service.IService;
import com.ocw.springcloud.modular.model.Payment;

public interface PaymentService extends IService<Payment> {

    int create(Payment payment);

    Payment getPayMentById(Long id);
}
