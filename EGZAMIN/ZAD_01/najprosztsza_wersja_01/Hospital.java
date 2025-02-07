package najprosztsza_wersja_01;

import java.util.Objects;

public class Hospital {
    private String name;
    private double capacity;

    public Hospital(String name, double capacity) {
        if (name != null) {
            this.name = name;
        } else {
            this.name = "";
        }

        if (capacity > 0) {
            this.capacity = capacity;
        } else {
            this.capacity = 50.0;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null) {
            this.name = name;
        } else {
            this.name = "";
        }
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        if (capacity > 0) {
            this.capacity = capacity;
        } else {
            this.capacity = 50.0;
        }
    }

    @Override
    public String toString() {
        if (name == null) {
            return "[" + getClass().getSimpleName() + "]. Capacity: [" + capacity + "].";
        } else {
            return "[" + getClass().getSimpleName() + "]: Name: [" + name + "]. Capacity: [" + capacity + "].";
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Hospital hospital = (Hospital) obj;
        return Objects.equals(name, hospital.name) && Objects.equals(capacity, this.capacity);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, capacity);
    }

}
