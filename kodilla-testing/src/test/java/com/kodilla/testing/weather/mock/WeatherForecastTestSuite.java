package com.kodilla.testing.weather.mock;

import com.kodilla.testing.weather.stub.Temperatures;
import com.kodilla.testing.weather.stub.WeatherForecast;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.HashMap;
import java.util.Map;


import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class WeatherForecastTestSuite {

    @Mock
    private Temperatures temperaturesMock;
    private WeatherForecast weatherForecast;
    private Map<String, Double> temperaturesMap;

    @BeforeEach
    public void before() {
        temperaturesMap = new HashMap<>();
        temperaturesMap.put("Rzeszow", 25.5);
        temperaturesMap.put("Krakow", 26.2);
        temperaturesMap.put("Wroclaw", 24.8);
        temperaturesMap.put("Warszawa", 25.2);
        temperaturesMap.put("Gdansk", 26.1);
        when(temperaturesMock.getTemperatures()).thenReturn(temperaturesMap);
        weatherForecast = new WeatherForecast(temperaturesMock);
    }

    @Test
    void testCalculateForecastWithMock() {
        //Given
        //When
        int quantityOfSensors = weatherForecast.calculateForecast().size();

        //Then
        Assertions.assertEquals(5, quantityOfSensors);
    }

    @Test
    void testAverageTemperature() {
        //Given
        //When
        double averageTemperature = weatherForecast.calculateAverageTemperature();

        //Then
        Assertions.assertEquals(25.56, averageTemperature);
    }

    @Test
    void testMedianTemperatures() {
        //Given
        //When
        double medianTemperature = weatherForecast.calculateMedianTemperature();

        //Then
        Assertions.assertEquals(25.5, medianTemperature);
    }

}
