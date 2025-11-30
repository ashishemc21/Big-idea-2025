package com.solomates;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {

    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);
    }

    @Test
    public void appName_isNotNull() {
        String appName = "SoloMates";
        assertNotNull(appName);
    }

    @Test
    public void welcomeMessage_containsAppName() {
        String welcomeMessage = "Welcome to SoloMates";
        assertTrue(welcomeMessage.contains("SoloMates"));
    }
}

