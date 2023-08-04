public class Hogwarts {
    private String firstName;
    private String lastName;
    private int witchcraft;
    private int transgression;

    public Hogwarts(String firstName, String lastName, int witchcraft, int transgression) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.witchcraft = witchcraft;
        this.transgression = transgression;
    }

    public int getWitchcraft() {
        return witchcraft;
    }

    public void setWitchcraft(int witchcraft) {
        this.witchcraft = witchcraft;
    }

    public int getTransgression() {
        return transgression;
    }

    public void setTransgression(int transgression) {
        this.transgression = transgression;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public static void comparisonStudent(Hogwarts student1, Hogwarts student2) {
        int sumPointsStudent1 = student1.getWitchcraft() + student1.getTransgression();
        int sumPointsStudent2 = student2.getWitchcraft() + student2.getTransgression();
        if (sumPointsStudent1 > sumPointsStudent2) {
            System.out.println(student1.getFirstName() + " " + student1.getLastName()
                    + " обладает большей мощностью магии, чем "
                    + student2.getLastName() + " " + student2.getFirstName());
        } else if (sumPointsStudent1 < sumPointsStudent2) {
            System.out.println(student2.getFirstName() + " " + student2.getLastName()
                    + " обладает большей мощностью магии, чем "
                    + student1.getFirstName() + " " + student1.getLastName());
        } else System.out.println("Студенты равны");
    }
}
