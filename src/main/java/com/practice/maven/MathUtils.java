package com.practice.maven;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MathUtils {
    private static final Logger LOGGER = LoggerFactory.getLogger(MathUtils.class);

    public static int add(int a, int b) {
        int result = a + b;
        LOGGER.info("event=addition a={} b={} result={}", a, b, result);
        return result;
    }
}
