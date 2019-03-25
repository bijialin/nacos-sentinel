package com.nickbi.nacosconfig.config;

import com.alibaba.nacos.api.annotation.NacosProperties;
import com.alibaba.nacos.spring.context.annotation.config.EnableNacosConfig;
import org.springframework.context.annotation.Configuration;

/**
 * @author nickbi
 * @date 2019/3/25
 */
@Configuration
@EnableNacosConfig(globalProperties = @NacosProperties(serverAddr = "${nacos.server-addr:localhost:12345}"))
public class NacosConfiguration {


}
