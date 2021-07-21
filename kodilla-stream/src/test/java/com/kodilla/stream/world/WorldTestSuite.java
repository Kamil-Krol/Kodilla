package com.kodilla.stream.world;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class WorldTestSuite {
    @Test
    void testGetPeopleQuantityFromOneContinent() {
        //Given
        Country Polska=new Country(new BigDecimal("38000000"),"Polska");
        Country Czechy=new Country(new BigDecimal("42000000"),"Czechy");

        List<Country> europeCountries= Arrays.asList(Polska,Czechy);

        Continent Europa=new Continent("Europa",europeCountries);

        List<Continent> continents =Arrays.asList(Europa);

        World world=new World(continents);

        //When
        BigDecimal result= world.getPeopleQuantity();

        //Then
        assertEquals(new BigDecimal("80000000"),result);
    }

    @Test
    void testGetPeopleQuantityFromTwoContinents() {
        //given
        Country Polska=new Country(new BigDecimal("38000000"),"Polska");
        Country Czechy=new Country(new BigDecimal("42000000"),"Czechy");
        Country Chiny=new Country(new BigDecimal("10000000"),"Chiny");

        List<Country> europeCountries= Arrays.asList(Polska,Czechy);
        List<Country> asiaCountries=Arrays.asList(Chiny);

        Continent Europa=new Continent("Europa",europeCountries);
        Continent Asia=new Continent("Asia",asiaCountries);

        List<Continent> continents=Arrays.asList(Europa,Asia);

        World world=new World(continents);

        //when
        BigDecimal result= world.getPeopleQuantity();

        //then
        assertEquals(new BigDecimal("90000000"),result);
    }
}
