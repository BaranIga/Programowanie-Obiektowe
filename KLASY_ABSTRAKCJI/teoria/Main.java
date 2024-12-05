import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // klasa anonimowa
        WorkTool lyzka = new WorkTool("łyzka", 1891) {
            @Override
            public void use() {
                System.out.println("Nałożono zupę na łyżkę.");
            }
        };
        lyzka.use();
        System.out.println(lyzka);

        // druga klasa anonimowa
        WorkTool widelec = new WorkTool("widelec", 2020) {
            @Override
            public void use() {
                System.out.println("użyto widelca.");
            }
        };
        widelec.use();

        ArrayList<WorkTool> workTools = new ArrayList<>();
        workTools.add(new Hammer("młotek", 2024)); // bezpośrednie przekazanie konstruktora
        workTools.add(new Screwdriver("śrubokręt krzyżak", 2024));
        workTools.add(new Screwdriver("śrubokręt płaski", 2024));
        workTools.add(new Saw("piła do drewna", 2024));
        workTools.add(new Saw("piła to metalu", 2024));

        for (WorkTool wt: workTools) {
            wt.use();
        }

        WorkTool srubokret = new Screwdriver("śrubokręt", 1995);
        srubokret.use();
    }
}
