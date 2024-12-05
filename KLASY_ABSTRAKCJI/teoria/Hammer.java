public class Hammer extends WorkTool {

    public Hammer(String name, int productionYear) {
        super(name, productionYear);
    }

    public Hammer() {
        super();
    }

    @Override
    public void use() {
        System.out.println("użyto młotka do wbicia gwoździa.");
    }
}
