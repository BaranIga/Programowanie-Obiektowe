package zad_06;

public class Kitchen implements Cloneable {
    private String name;
    private Stove stove;

    public Kitchen(String name, Stove stove) {
        this.name = name;
        this.stove = stove;
    }

    @Override
    public Kitchen clone() throws CloneNotSupportedException {
        Kitchen clonedKitchen = (Kitchen) super.clone();
        clonedKitchen.stove = stove.clone();
        return clonedKitchen;
    }

    public String getName() {
        return name;
    }

    public Stove getStove() {
        return stove;
    }

    @Override
    public String toString() {
        return "Kitchen [name=" + getName() + ", stove=" + getStove() + "]";
    }
}
