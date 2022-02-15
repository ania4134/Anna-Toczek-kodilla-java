package com.kodilla.testing.weather.mock;

import com.kodilla.testing.weather.stub.Temperatures;
import com.kodilla.testing.weather.stub.WeatherForecast;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import java.util.*;

import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)



public class WeatherForecastTestSuite {

    @Mock
    private Temperatures temperaturesMock;


    private static int testCounter;

    Map<String, Double> temperaturesMap;
    WeatherForecast weatherForecast;


    @BeforeEach
    public void beforeEveryTest(){
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);

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
    void testCalculateForecastWithMock(){
        //Given
        //BeforeEach

        //When
        int quantityOfSensors = weatherForecast.calculateForecast().size();

        //Then
        Assertions.assertEquals(5, quantityOfSensors);
    }


    @Test
    void testCalculateAverage() {
        //Given
        //BeforeEach

        //When
        double expected = 0;
        double sum = 0.0;
        for (Map.Entry<String, Double> temperature : temperaturesMock.getTemperatures().entrySet()) {
            sum += temperature.getValue();
        }
        expected = sum / temperaturesMap.size();

        //Then
        Assertions.assertEquals(expected, weatherForecast.calculateAverage());
    }


    @Test
    void testCalculateMedian() {
        //Given

        //When
        double expectedMedian = 25.5;

        //Then
        Assertions.assertEquals(expectedMedian, weatherForecast.calculateMedian());
    }
}