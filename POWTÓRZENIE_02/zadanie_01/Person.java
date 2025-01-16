public record Person(String name, int age) {  // pola w rekordach sa final i private
    public Person {
        if (age < 0) {
            throw new IllegalArgumentException("wartości ujemne nie są obsługiwane");
        }
    }

    public static void main(String[] args) {
        Person person = new Person("Laura", 10);
        System.out.println(person);
    }
}
