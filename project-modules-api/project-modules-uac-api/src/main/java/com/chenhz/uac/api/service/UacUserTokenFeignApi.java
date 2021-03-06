/*
 * Copyright (c) 2018. paascloud.net All Rights Reserved.
 * 项目名称：paascloud快速搭建企业级分布式微服务平台
 * 类名称：UacUserTokenFeignApi.java
 * 创建人：刘兆明
 * 联系方式：paascloud.net@gmail.com
 * 开源地址: https://github.com/paascloud
 * 博客地址: http://blog.paascloud.net
 * 项目官网: http://paascloud.net
 */

package com.chenhz.uac.api.service;


import com.chenhz.common.base.wrapper.Wrapper;
import com.chenhz.uac.api.service.hystrix.UacUserTokenFeignApiHystrix;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;


/**
 * The interface Uac user token feign api.
 *
 * @author paascloud.net @gmail.com
 */
@FeignClient(value = "paascloud-provider-uac",/* configuration = OAuth2FeignAutoConfiguration.class, */fallback = UacUserTokenFeignApiHystrix.class)
public interface UacUserTokenFeignApi {

	/**
	 * 超时token更新为离线.
	 *
	 * @return the wrapper
	 */
	@PostMapping(value = "/api/uac/token/updateTokenOffLine")
	Wrapper<Integer> updateTokenOffLine();
}
