public record Person(String imie, int wiek) {
    public Person{
        if(wiek < 0) {
            wiek = 0;
        }
    }

    public Person() {
        this("Default", 0);
    }

    public void przedstawSie() {
        System.out.println("Nazywam się " + imie
            + " i mam " + wiek + " lat.");
    }
}
