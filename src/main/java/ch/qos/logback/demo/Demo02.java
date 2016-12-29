package ch.qos.logback.demo;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author wuxing
 */
public class Demo02 {

    private static final Logger LOGGER = LoggerFactory.getLogger(Demo02.class);

    @Test
    public void test01() {
        LOGGER.trace("======trace");
        LOGGER.debug("======debug");
        LOGGER.info("======info");
        LOGGER.warn("======warn");
        LOGGER.error("======error");
    }

}
