package com.ocw.springcloud.modular.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.ocw.springcloud.modular.model.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface PaymentMapper extends BaseMapper<Payment> {

    int create(Payment payment);

    Payment getPayMentById(@Param("id") Long id);
}
