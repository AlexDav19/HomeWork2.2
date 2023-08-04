public class Ravenclaw extends Hogwarts {
    private int smart;
    private int wise;
    private int witty;
    private int creativity;

    public Ravenclaw(String firstName, String lastName, int witchcraft, int transgression, int smart, int wise, int witty, int creativity) {
        super(firstName, lastName, witchcraft, transgression);
        this.smart = smart;
        this.wise = wise;
        this.witty = witty;
        this.creativity = creativity;
    }

    public int getSmart() {
        return smart;
    }

    public void setSmart(int smart) {
        this.smart = smart;
    }

    public int getWise() {
        return wise;
    }

    public void setWise(int wise) {
        this.wise = wise;
    }

    public int getWitty() {
        return witty;
    }

    public void setWitty(int witty) {
        this.witty = witty;
    }

    public int getCreativity() {
        return creativity;
    }

    public void setCreativity(int creativity) {
        this.creativity = creativity;
    }

    @Override
    public String toString() {
        return "Ravenclaw{" +
                "имя: " + getFirstName() +
                ", фамилия: " + getLastName() +
                ", колдоство: " + getWitchcraft() +
                ", трансгрессия: " + getTransgression() +
                ", ум=" + smart +
                ", мудрость=" + wise +
                ", остроумность=" + witty +
                ", творчество=" + creativity +
                '}';
    }

    public static void comparisonStudent(Ravenclaw student1, Ravenclaw student2) {
        int sumPointsStudent1 = student1.getWitchcraft() + student1.getTransgression() + student1.smart +
                student1.wise + student1.witty + student1.creativity;
        int sumPointsStudent2 = student2.getWitchcraft() + student2.getTransgression() + student2.smart +
                student2.wise + student2.witty + student2.creativity;
        if (sumPointsStudent1 > sumPointsStudent2) {
            System.out.println(student1.getFirstName() + " " + student1.getLastName()
                    + " лучший Когтевранец, чем "
                    + student2.getLastName() + " " + student2.getFirstName());
        } else if (sumPointsStudent1 < sumPointsStudent2) {
            System.out.println(student2.getFirstName() + " " + student2.getLastName()
                    + " лучший Когтевранец, чем "
                    + student1.getFirstName() + " " + student1.getLastName());
        } else System.out.println("Студенты равны");
    }
}
