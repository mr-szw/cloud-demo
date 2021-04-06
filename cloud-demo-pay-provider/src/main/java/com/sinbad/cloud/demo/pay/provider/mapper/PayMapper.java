package com.sinbad.cloud.demo.pay.provider.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.sinbad.cloud.demo.pay.provider.entry.po.PayPo;

/**
 * @author sinbad on 2021/4/6.
 */
@Mapper
public interface PayMapper {

	long insertPayData(PayPo payPo);

	PayPo getPayDataById(long payId);
}
