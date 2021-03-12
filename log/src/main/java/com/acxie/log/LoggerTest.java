package com.acxie.log;

import org.apache.log4j.Logger;
/**
 * @description:
 * @author: xieaichen
 * @time: 2020/8/13 20:25
 */

public class LoggerTest {

    public static void main(String[] args) {
        Logger logger=Logger.getLogger(LoggerTest.class);
        logger.info("111");
        logger.debug("111");
    }
}
