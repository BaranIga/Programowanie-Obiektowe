package zad_08;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Athlete implements Cloneable {
    private String name;
    private List<Integer> lapTimes;

    public Athlete(String name, List<Integer> lapTimes) {
        this.name = name;
        this.lapTimes = lapTimes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Integer> getLapTimes() {
        return lapTimes;
    }

    public void setLapTimes(List<Integer> lapTimes) {
        this.lapTimes = lapTimes;
    }

    @Override
    public String toString() {
        return name + " " + lapTimes;
    }

    @Override
    public Object clone() throws CloneNotSupportedException{
        Athlete cloned = (Athlete) super.clone();
        cloned.lapTimes = new ArrayList<>(this.lapTimes);
        return cloned;
    }

    public static void main(String[] args) {
        try {
            Athlete originalAthlete = new Athlete("Usain Bolt", Arrays.asList(12, 11, 10, 9));

            Athlete clonedAthlete = (Athlete) originalAthlete.clone();

            originalAthlete.getLapTimes().set(2, 15);

            System.out.println("Oryginalny sportowiec: " + originalAthlete);
            System.out.println("Sklonowany sportowiec: " + clonedAthlete);

        } catch (CloneNotSupportedException e) {
            System.err.println("Klonowanie nie jest obsługiwane: ");
        }
    }
}
