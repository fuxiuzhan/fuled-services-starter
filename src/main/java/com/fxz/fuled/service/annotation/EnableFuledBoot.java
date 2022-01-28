package com.fxz.fuled.service.annotation;


import com.alibaba.cloud.nacos.discovery.NacosDiscoveryAutoConfiguration;
import com.alibaba.cloud.nacos.registry.NacosServiceRegistryAutoConfiguration;
import com.fxz.component.fuled.cat.starter.annotation.EnableCatTracing;
import com.fxz.fuled.config.starter.annotation.EnableDiamondConfig;
import com.fxz.fuled.simple.cache.EnableSimpleCache;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.lang.annotation.*;

/**
 * @author fxz
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Inherited
@Documented
@SpringBootApplication(exclude = {NacosDiscoveryAutoConfiguration.class, NacosServiceRegistryAutoConfiguration.class})
@EnableSimpleCache
@EnableDiamondConfig
@EnableCatTracing
public @interface EnableFuledBoot {
}
