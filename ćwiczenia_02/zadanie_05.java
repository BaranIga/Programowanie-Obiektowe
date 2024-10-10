/* Napisz statyczną metodę, która przyjmuje napis jako argument
i zwraca ten napis w odwrotnej kolejności. Stwórz przypadek testowy.
 */

// mniej dobrze ale działa 

public class zadanie_05 {

    public static String odwrocNapis(String napis) {
        String odwrocony = "";
        for(int i = napis.length() - 1; i >= 0; i--) {
            odwrocony += napis.charAt(i);
        }

        return odwrocony;
    }
}

// drugi sposób też git

public class zadanie_05 {

    public static String odwrocNapis(String napis) {
        StringBuilder odwrocony = new StringBuilder();
        for(int i = napis.length() - 1; i >= 0; i--) {
            odwrocony.append(napis.charAt(i))
        }

        return odwrocony.toString();
    }
}

// lepiej już git, najlepiej i działa

public class zadanie_05 {

    public static String odwrocNapis(String napis) {
        StringBuilder odwrocony = new StringBuilder(napis);

        return odwrocony.reverse().toString();
    }
}


// MAIN

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> liczby = new ArrayList<>();
        for (int i = 0; i < 15; i++) {
            liczby.add(i);
        }

        System.out.println(zadanie_05.odwrocNapis("Siema"));
    }
}
