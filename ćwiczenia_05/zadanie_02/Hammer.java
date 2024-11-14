public class Hammer extends Tool {

    public Hammer(String toolName) {
        super(toolName);
    }

    public void displayToolName() {
        System.out.println(toolName);
    }


    public static void main(String[] args) {
        Hammer hammer = new Hammer("hammer");
        hammer.displayToolName();
    }
}
