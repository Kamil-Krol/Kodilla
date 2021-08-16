package com.kodilla.patterns.strategy.social;

import com.kodilla.patterns.strategy.social.generations.Millenials;
import com.kodilla.patterns.strategy.social.generations.YGeneration;
import com.kodilla.patterns.strategy.social.generations.ZGeneration;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTestSuite {

    @Test
    void testDefaultSharingStrategies()
    {
        //Given
        User userM = new Millenials("UserM");
        User userY = new YGeneration("UserY");
        User userZ = new ZGeneration("UserZ");

        //When
        String mShouldChoose = userM.sharePost();
        System.out.println("Millenial should choose " + mShouldChoose);
        String yShouldChoose = userY.sharePost();
        System.out.println("Y should choose " + yShouldChoose);
        String zShouldChoose = userZ.sharePost();
        System.out.println("Z should choose " + zShouldChoose);

        //Then
        assertEquals("Twitter",mShouldChoose);
        assertEquals("Facebook",yShouldChoose);
        assertEquals("Snapchat",zShouldChoose);

    }

    @Test
    void testIndividualSharingStrategy()
    {
        //Given
        User userM = new Millenials("UserM");

        //When
        String mShouldChoose = userM.sharePost();
        System.out.println("Millenial should choose " + mShouldChoose);
        userM.getSocialType(new SnapchatPublisher());
        mShouldChoose = userM.sharePost();
        System.out.println("Millenial should choose " + mShouldChoose);

        //Then
        assertEquals("Snapchat",mShouldChoose);
    }
}
