package com.sinbad.cloud.demo.order.consumer.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.sinbad.cloud.demo.common.entry.PayVo;
import com.sinbad.cloud.demo.common.suppert.RtResponse;


import lombok.extern.slf4j.Slf4j;

/**
 * @author sinbad on 2021/4/6.
 */
@Slf4j
@Service
public class OrderServiceImpl {

	//private static final String PAY_SERVICE = "http://127.0.0.1:8001";
	private static final String PAY_SERVICE = "http://PAY-PROVIDER";

	@Resource
	private RestTemplate restTemplate;

	public RtResponse<Long> createPayForOrder(PayVo payVo) {

		RtResponse rtResponse = restTemplate.postForObject(PAY_SERVICE + "/pay/create", payVo,
				RtResponse.class);
		log.info("Create order for pay success, responseEntity={}", rtResponse);
		return rtResponse;

	}

	public RtResponse<PayVo> getPayForGetOrder(long payId) {
		RtResponse rtResponse = restTemplate.getForObject(PAY_SERVICE + "/pay/get?payId=" + payId,
				RtResponse.class);
		return rtResponse;

	}

}
