package zad_04;

import java.util.Comparator;

public class DateComparator implements Comparator<WeatherForecast> {
    @Override
    public int compare(WeatherForecast o1, WeatherForecast o2) {
        return o1.getDate().compareTo(o2.getDate());
    }
}
