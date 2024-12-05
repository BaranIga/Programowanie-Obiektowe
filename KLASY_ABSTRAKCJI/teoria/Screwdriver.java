public class Screwdriver extends WorkTool {

    public Screwdriver(String name, int productionYear) {
        super(name, productionYear);
    }

    public Screwdriver() {
        super();
    }

    @Override
    public void use() {
        System.out.println("użyto śruboketa do wkręcenia śruby.");
    }
}
