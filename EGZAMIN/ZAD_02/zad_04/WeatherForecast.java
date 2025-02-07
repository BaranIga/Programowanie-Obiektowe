package zad_04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class WeatherForecast {
    private int id;
    private String date;
    private double temperature;

    public WeatherForecast(int id, String date, double temperature) {
        this.id = id;
        this.date = date;
        this.temperature = temperature;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + ": " + getId() + ": " + getDate() + ": " + getTemperature();
    }

    public static void main(String[] args) {
        ArrayList<WeatherForecast> weatherForecasts = new ArrayList<>();
        weatherForecasts.add(new WeatherForecast(123, "2024-10-20", 28.2));
        weatherForecasts.add(new WeatherForecast(123, "2025-01-20", 28.2));
        weatherForecasts.add(new WeatherForecast(123, "2023-05-31", 31.2));
        weatherForecasts.add(new WeatherForecast(123, "2024-10-20", 7.3));

        System.out.println("before: ");
        for (WeatherForecast weatherForecast : weatherForecasts) {
            System.out.println(weatherForecast);
        }

        Collections.sort(weatherForecasts, new TemperatureComparator().thenComparing(new DateComparator()));

        System.out.println("after: ");
        for (WeatherForecast weatherForecast : weatherForecasts) {
            System.out.println(weatherForecast);
        }
    }
}