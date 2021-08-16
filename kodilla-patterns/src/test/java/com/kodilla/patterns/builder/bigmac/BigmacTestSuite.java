package com.kodilla.patterns.builder.bigmac;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BigmacTestSuite {

    @Test
    void testBigmac()
    {
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder().bun("with sesame").sauce("mild")
                .ingredient("salad").burgers(2).ingredient("tomato")
                .ingredient("cheese").ingredient("onion").build();
        System.out.println(bigmac);
        //When
        int numberOfBurgers = bigmac.getBurgers();
        int numberOfIngredients = bigmac.getIngredients().size();
        String bunType = bigmac.getBun();

        //Then
        assertEquals("with sesame",bunType);
        assertEquals(2,numberOfBurgers);
        assertEquals(4,numberOfIngredients);

    }
}
