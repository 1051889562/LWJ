package com.yicun.Test;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestOne {
    Logger logger=LoggerFactory.getLogger(TestOne.class);
    @Test
    public void test01(){
        String callString="0|失败：原因发生异常: +详细异常";
        logger.info(callString.substring(callString.indexOf("|")+1));
    }
}
