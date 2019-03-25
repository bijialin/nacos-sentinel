package com.nickbi.nacosdiscovery.controller;

import com.alibaba.nacos.api.annotation.NacosInjected;
import com.alibaba.nacos.api.exception.NacosException;
import com.alibaba.nacos.api.naming.NamingService;
import com.alibaba.nacos.api.naming.pojo.Instance;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * nacos discovery controller
 *
 * @author nickbi
 * @date 2019/3/25
 */
@Controller
@RequestMapping("/discovery")
public class DiscoveryController {
	@NacosInjected
	private NamingService namingService;

	@RequestMapping(value = "/get", method = RequestMethod.GET)
	@ResponseBody
	public List<Instance> get(@RequestParam String serviceName) throws NacosException {
		return namingService.getAllInstances(serviceName);
	}
}
