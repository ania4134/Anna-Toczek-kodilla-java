package com.kodilla.testing.weather.stub;

import java.util.*;

public class WeatherForecast {
   private Temperatures temperatures;

    public WeatherForecast(Temperatures temperatures) {
        this.temperatures = temperatures;
    }

    public Map<String, Double> calculateForecast(){
        Map<String, Double> resultMap = new HashMap<>();

        for(Map.Entry<String, Double> temperature : temperatures.getTemperatures().entrySet()){

            // adding 1 celsius degree to current value
            // as a temporary weather forecast
            resultMap.put(temperature.getKey(), temperature.getValue() + 1.0);
        }
        return resultMap;
    }

    public double calculateAverage(){
        double average;
        double sum = 0;

        for(Map.Entry<String, Double> temperature : temperatures.getTemperatures().entrySet()){
            sum += temperature.getValue();
        }
        average = sum/temperatures.getTemperatures().size();
        return average;
    }


    public double calculateMedian(){
        double median = 0;
        List<Double> valuesList = new LinkedList<>();
        for(Map.Entry<String, Double> temperature : temperatures.getTemperatures().entrySet()){
            valuesList.add(temperature.getValue());
        }
        Collections.sort(valuesList);

        double middleA=0;
        double middleB=0;
        int size = valuesList.size();

        if(valuesList.size() % 2 ==0) {
            middleA= valuesList.get(size/2 - 1/2);
            middleB= valuesList.get(size/2 + 1/2);
            median = (middleA+middleB)/2;
            return median;

        }else{
            median = valuesList.get(size/2 +1/2);
            return median;
        }
        }
    }