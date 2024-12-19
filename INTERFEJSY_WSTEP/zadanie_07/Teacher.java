public class Teacher implements Cloneable {
    private String name;
    private String subject;
    private int experience;

    public Teacher(String name, String subject, int experience) {
        this.name = name;
        this.subject = subject;
        this.experience = experience;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    @Override
    public String toString() {
        return name + " " + subject + " " + experience;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException{
        return super.clone();
    }

    public static void main(String[] args) {
        try {
            Teacher teacher = new Teacher("Alice", "Biology", 5);
            Teacher clonedTeacher = (Teacher) teacher.clone();

            teacher.setExperience(10);

            System.out.println("Oryginalny nauczyciel: " + teacher);
            System.out.println("Sklonowany nauczyciel: " + clonedTeacher);
        }
        catch (CloneNotSupportedException e) {
            System.out.println("Nie udało się.");
        }
    }
}
