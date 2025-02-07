package najprosztsza_wersja_01;

import java.util.Objects;

public class Clinic extends Hospital {
    private double rating;

    public Clinic(String name, double capacity, double rating) {
        super(name, capacity);
        if (rating >= 0.0 && rating <= 5.0) {
            this.rating = rating;
        } else {
            this.rating = 3.0;
        }
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        if (rating >= 0.0 && rating <= 5.0) {
            this.rating = rating;
        } else {
            this.rating = 3.0;
        }
    }

    @Override
    public String toString() {
        if (getName() != null) {
            return "[" + getClass().getSimpleName() + "]. Capacity: [" + getCapacity() + "]." + "\nRating: [" + rating + "]";
        }
        return super.toString() + "\nRating: [" + rating + "].";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        if (!super.equals(obj)) return false;
        Clinic clinic = (Clinic) obj;
        return Double.compare(clinic.rating, rating) == 0; // tutaj nie zadziła Objects bo double to nie obiekt i musi
        // być Double.compare natomoast na Objects to objekty (Integer, String)
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), rating);
    }

}
