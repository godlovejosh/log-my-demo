package ch.qos.logback.demo;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author wuxing
 */
public class Demo01 {

    private static final Logger LOGGER = LoggerFactory.getLogger(Demo01.class);

    @Test
    public void test01() {
        LOGGER.debug("I am debug");
        LOGGER.info("I am info");
        LOGGER.error("I am error");

//        new Demo02().test01();

        try {
            throw new IllegalStateException("I am exception");
        } catch (Exception e) {
            LOGGER.error(e.getMessage(), e);
        }
    }

}
