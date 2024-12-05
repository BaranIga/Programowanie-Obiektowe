import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<ComputerGraphic> computerGraphics = new ArrayList<>();

        computerGraphics.add(new Bitmap(12, 2, "komputer"));
        computerGraphics.add(new Bitmap(20, 12, "telefon"));
        computerGraphics.add(new Vector(15, 6, "słuchawki"));
        computerGraphics.add(new Vector(81, 58, "drukarka"));
        computerGraphics.add(new Vector(60, 24, "telewizor"));

        for (ComputerGraphic computerGraphic: computerGraphics) {
            computerGraphic.loadFile();
            System.out.println("\n");
            computerGraphic.saveFile();
        }
    }
}
