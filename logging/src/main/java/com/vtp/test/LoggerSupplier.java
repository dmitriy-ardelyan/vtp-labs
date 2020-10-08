package com.vtp.test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoggerSupplier {

        public static Logger getLogger(){
                final int stackTraceId = 2;
                return LoggerFactory.getLogger(Thread.currentThread().getStackTrace()[stackTraceId].getClassName());
        }

        public static Logger getLogger(String name) {
                return LoggerFactory.getLogger(name);
        }
}
