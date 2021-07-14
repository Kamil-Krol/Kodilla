package com.kodilla.testing.weather.stub;

import java.util.*;

public class WeatherForecast {
    private Temperatures temperatures;

    public WeatherForecast(Temperatures temperatures) {
        this.temperatures = temperatures;
    }

    public Map<String, Double> calculateForecast() {
        Map<String, Double> resultMap = new HashMap<>();

        for (Map.Entry<String, Double> temperature :
                temperatures.getTemperatures().entrySet()) {


            resultMap.put(temperature.getKey(), temperature.getValue() + 1.0);
        }
        return resultMap;
    }

    public double calculateAverageTemperature()
    {
        double average = 0;
        for (Map.Entry<String, Double> temperature :
                temperatures.getTemperatures().entrySet())
        {
            average = average + temperature.getValue();
        }

        return average;

    }

    public double calculateMedianTemperature()
    {
        //List<Double> employeeById = new ArrayList<>(temperatures.values());
        List<Double> list = new ArrayList<>();
        for (Map.Entry<String, Double> temperature :
                temperatures.getTemperatures().entrySet())
        {
            list.add(temperature.getValue());
        }

        Collections.sort(list);
        int sizeOfTheList = list.size();
        if(sizeOfTheList%2==1)
        {
            return list.get(sizeOfTheList/2);
        }

        else
        {
            return (list.get(sizeOfTheList/2) + list.get(sizeOfTheList/2+1))/2;
        }


    }


}
