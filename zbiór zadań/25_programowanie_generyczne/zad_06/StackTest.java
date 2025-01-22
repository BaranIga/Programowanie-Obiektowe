package zad_06;

public class StackTest {
    public static void main(String[] args) {
        StackClass<Integer> intStack = new StackClass<>();
        intStack.push(10);
        intStack.push(20);
        intStack.push(30);

        System.out.println("Szczyt stosu: " + intStack.peek()); // 30
        System.out.println("Usunięty element: " + intStack.pop()); // 30
        System.out.println("Szczyt stosu po usunięciu: " + intStack.peek()); // 20
        System.out.println("Czy stos jest pusty? " + intStack.isEmpty()); // false

        // Tworzymy stos przechowujący ciągi znaków
        StackClass<String> stringStack = new StackClass<>();
        stringStack.push("Hello");
        stringStack.push("World");

        System.out.println("Szczyt stosu: " + stringStack.peek()); // World
        System.out.println("Usunięty element: " + stringStack.pop()); // World
        System.out.println("Szczyt stosu po usunięciu: " + stringStack.peek()); // Hello
    }
}
