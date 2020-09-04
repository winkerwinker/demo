package com.acxie.demo.loggerlearn.controller;

import com.acxie.demo.loggerlearn.WebLog;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description:
 * @author: xieaichen
 * @time: 2020/8/13 19:10
 */
@RestController
@RequestMapping()
public class LoggerTestController {

    @RequestMapping("/loggertest")
    @WebLog(description="执行了logger注解")
    public Object loggertest(String msg) {
        org.apache.log4j.Logger logger= org.apache.log4j.Logger.getLogger(LoggerTestController.class);
        logger.info("111");
        logger.debug("111");
        logger.error("error 111");
        return new Object();
    }

}
