package com.kodilla.patterns.singleton;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LoggerTestSuite {

    private static Logger logger;

    @Test
    public void testGetLastLog()
    {
        //Given
        logger = Logger.LOG;
        logger.log("Test");
        //When
        String result = logger.getLastLog();

        //Then
        assertEquals("Test",result);

    }
}
