package com.sinbad.cloud.demo.order.consumer.controller;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sinbad.cloud.demo.common.suppert.RtResponse;
import com.sinbad.cloud.demo.order.consumer.entry.PayVo;
import com.sinbad.cloud.demo.order.consumer.service.OrderServiceImpl;

import lombok.extern.slf4j.Slf4j;

/**
 * @author sinbad on 2021/4/6.
 */
@Slf4j
@RestController
@RequestMapping(value = "/order")
public class OrderController {

	@Resource
	private OrderServiceImpl orderService;

	@PostMapping(value = "/create")
	public RtRsponse<Long> createPayForOrder(String serial) {
		log.info("Create pay payVo={}", serial);
		return orderService.createPayForOrder(serial);

	}

	@GetMapping(value = "/get")
	public RtResponse<PayVo> getPayForGetOrder(Long payId) {
		log.info("Get pay by id, payId={}", payId);
		if (payId == null) {
			return RtResponse.paramError();
		}
		return orderService.getPayForGetOrder(payId);
	}

}
