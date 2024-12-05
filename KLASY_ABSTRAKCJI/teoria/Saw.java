public class Saw extends WorkTool {

    public Saw(String name, int productionYear) {
        super(name, productionYear);
    }

    public Saw() {
        super();
    }

    @Override
    public void use() {
        System.out.println("Użyto piły do przepiłowania materiału.");
    }
}
