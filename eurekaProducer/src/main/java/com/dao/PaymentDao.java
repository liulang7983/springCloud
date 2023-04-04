package com.dao;

import bean.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author ming.li
 * @date 2023/3/10 14:05
 */
@Mapper
public interface PaymentDao {
    int create(Payment payment);
    Payment getId(@Param("id") Long id);
}
