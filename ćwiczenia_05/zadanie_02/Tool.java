//Stwórz klasę Tool z chronionym konstruktorem, który przyjmuje nazwę narzędzia. 
//Następnie stwórz klasę potomną Hammer, która dziedziczy po klasie Tool. W klasie 
//Hammer stwórz konstruktor, który korzysta z konstruktora klasy bazowej.
//Zastanów się, dlaczego używając modyfikatora private dla konstruktora klasy
//bazowej, taki scenariusz nie byłby możliwy.


public class Tool {

    protected String toolName;

    public Tool(String toolName) {
        this.toolName = toolName;
    }

    public String getToolName() {
        return toolName;
    }
}
