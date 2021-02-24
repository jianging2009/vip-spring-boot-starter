package com.holyw.vip.exception;

import com.holyw.vip.config.VipAutoConfiguration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @className: DuoduokeClientNotFoundException
 * @description: TODO
 * @date: 2021/1/11
 **/
public class DuoduokeClientNotFoundException extends Exception {
    private static final Logger log = LoggerFactory.getLogger(VipAutoConfiguration.class);

    public DuoduokeClientNotFoundException() {
        super();
        log.info("没有找到Client自定义实现类...");
    }
}
