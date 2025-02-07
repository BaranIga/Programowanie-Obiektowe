package zad_04;

import java.util.Comparator;

public class TemperatureComparator implements Comparator<WeatherForecast> {
    @Override
    public int compare(WeatherForecast o1, WeatherForecast o2) {
        return Double.compare(o2.getTemperature(), o1.getTemperature());
    }
}
