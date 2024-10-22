/* Stwórz klasę Time z polami: hours i minutes. Napisz metodę addTime(Time otherTime),
która dodaje do bieżącego czasu czas podany jako argument i zwraca nowy obiekt klasy Time.
Zadbaj o to,  aby minuty i godziny nie przekraczały odpowiednio 59 i 23.
Stwórz przypadek testowy, aby wywołać metodę co najmniej jeden raz. */

package zadanie_07;

public class Time {
    public int hours;
    public int minutes;

    public Time(int hours, int minutes){
        this.hours = hours;
        this.minutes = minutes;
    }

    public Time addTime(Time otherTime){
        int mins = this.minutes + otherTime.minutes;
        int hour = this.hours + otherTime.hours;

        if(mins > 59){
            mins -= 60;
            hour += 1;
        }

        if(hour > 23){
            hour -= 24;
        }

        return new Time(hour, mins);
    }

    public static void main(String[] args){
        Time time1 = new Time(23, 59);
        Time time2 = new Time(23, 59);
        Time time = time1.addTime(time2);
        System.out.println(time1.hours + ":" + time1.minutes);
        System.out.println(time2.hours + ":" + time2.minutes);
        System.out.println(time.hours + ":" + time.minutes);
    }
}
