package com.vtp.test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class Verify {

    public static void logMessage(Object actual, Object expected, String message) {
        LoggerSupplier.getLogger().info(String.join("\n", "Verifying {}", " expected: {}", " actual: {}"),
                message, expected, actual);
    }

    public static void isTrue(boolean actual, String message) {
        logMessage(actual, true, message);
        assertThat(message, actual, is(true));
    }

    public static void equals(Object actual, Object expected, String message) {
        logMessage(actual, expected, message);
        assertThat(message, actual, equalTo(expected));
    }
}
