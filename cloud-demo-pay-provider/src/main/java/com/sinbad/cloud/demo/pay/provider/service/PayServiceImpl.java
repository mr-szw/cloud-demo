package com.sinbad.cloud.demo.pay.provider.service;

import javax.annotation.Resource;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import com.sinbad.cloud.demo.common.utils.GsonUtil;
import com.sinbad.cloud.demo.pay.provider.entry.po.PayPo;
import com.sinbad.cloud.demo.pay.provider.entry.vo.PayVo;
import com.sinbad.cloud.demo.pay.provider.mapper.PayMapper;

import lombok.extern.slf4j.Slf4j;

/**
 * @author sinbad on 2021/4/6.
 */
@Slf4j
@Service
public class PayServiceImpl {

	@Resource
	private PayMapper payMapper;

	public long createPay(PayVo payVo) {

		PayPo payPo = new PayPo();
		BeanUtils.copyProperties(payVo, payPo);
		long payId = payMapper.insertPayData(payPo);
		log.info("Create pay success, payId={}", payId);
		return payId;

	}

	public PayVo getPayDataById(long payId) {

		PayPo payDataById = payMapper.getPayDataById(payId);
		if (payDataById == null) {
			return null;
		}
		PayVo payVo = new PayVo();
		BeanUtils.copyProperties(payDataById, payVo);
		log.info("Get pay success, payVo={}", GsonUtil.toJson(payVo));
		return payVo;

	}

}
