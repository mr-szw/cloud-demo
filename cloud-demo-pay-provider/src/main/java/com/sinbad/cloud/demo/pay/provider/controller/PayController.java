package com.sinbad.cloud.demo.pay.provider.controller;

import javax.annotation.Resource;

import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sinbad.cloud.demo.common.entry.PayVo;
import com.sinbad.cloud.demo.common.suppert.RtResponse;
import com.sinbad.cloud.demo.common.utils.GsonUtil;

import com.sinbad.cloud.demo.pay.provider.service.PayServiceImpl;

import lombok.extern.slf4j.Slf4j;

/**
 * @author sinbad on 2021/4/6.
 */
@Slf4j
@RestController
@RequestMapping(value = "/pay")
public class PayController {

	@Resource
	private PayServiceImpl payService;

	@PostMapping(value = "/create")
	public RtResponse<Long> createPay(@RequestBody PayVo payVo) {
		log.info("Create pay payVo={}", GsonUtil.toJson(payVo));
		if (payVo == null || StringUtils.isEmpty(payVo.getSerial())) {
			return RtResponse.paramError();
		}
		long payId = payService.createPay(payVo);
		return RtResponse.success(payId);

	}

	@GetMapping(value = "/get")
	public RtResponse<PayVo> getPayDataById(Long payId) {
		log.info("Get pay by id, payVo={}", payId);
		if (payId == null) {
			return RtResponse.paramError();
		}
		PayVo payDataById = payService.getPayDataById(payId);
		return RtResponse.success(payDataById);

	}

}
