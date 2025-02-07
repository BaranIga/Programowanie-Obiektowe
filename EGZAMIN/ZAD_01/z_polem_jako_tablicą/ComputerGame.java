package z_polem_jako_tablicą;

import java.util.Arrays;
import java.util.Objects;

public class ComputerGame {
    private String title;
    private String producer;
    double[] ratings;

    public ComputerGame(String title, String producer, double[] ratings) {
        this.title = title;
        this.producer = producer;
        if (ratings != null) {
            this.ratings = Arrays.copyOf(ratings, ratings.length);
        } else {
            this.ratings = new double[0];
        }
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public double[] getRatings() {
        return Arrays.copyOf(ratings, ratings.length);
    }

    public void setRatings(double[] ratings) {
        if (ratings != null) {
            this.ratings = Arrays.copyOf(ratings, ratings.length);
        } else {
            this.ratings = new double[0];
        }
    }

    public void addRating(double rating) {
        double[] newList = new double[ratings.length + 1];
        for (int i = 0; i < ratings.length; i++) {
            newList[i] = this.ratings[i];
        }
        newList[newList.length - 1] = rating;
        this.ratings = newList;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + ": " + title + ", " + producer + ", " + ratings;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        ComputerGame computerGame = (ComputerGame) obj;
        return Objects.equals(title,computerGame.title) &&
                Objects.equals(producer, computerGame.producer) &&
                Arrays.equals(ratings, computerGame.ratings);
    }

    @Override
    public int hashCode() {
        int result =  Objects.hash(title, producer);
        result = 31 * result * Arrays.hashCode(ratings);
        return result;
    }
}
