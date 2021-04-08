package com.sinbad.cloud.demo.common.entry;

import java.io.Serializable;

import lombok.Data;

/**
 * @author sinbad on 2021/4/6.
 */
@Data
public class PayVo implements Serializable {

	private long id;
	private String serial;
}
