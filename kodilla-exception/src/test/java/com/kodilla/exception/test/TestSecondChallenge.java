package com.kodilla.exception.test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class TestSecondChallenge {
    @Test
    void whenYMeetCondition()
    {
        //Given
        SecondChallenge secondChallenge = new SecondChallenge();


        //When && Then
        assertThrows(Exception.class,() -> secondChallenge.probablyIWillThrowException(1.5,1.5));

    }

    @Test
    void whenXMeetFirstCondition()
    {
        //Given
        SecondChallenge secondChallenge = new SecondChallenge();


        //When && Then
        assertThrows(Exception.class,() -> secondChallenge.probablyIWillThrowException(3,1));

    }

    @Test
    void whenXMeetSecondCondition()
    {
        //Given
        SecondChallenge secondChallenge = new SecondChallenge();


        //When && Then
        assertThrows(Exception.class,() -> secondChallenge.probablyIWillThrowException(0.5,1));

    }
}
