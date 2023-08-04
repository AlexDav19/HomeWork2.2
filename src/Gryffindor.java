public class Gryffindor extends Hogwarts {
    private int nobility;
    private int honor;
    private int bravery;

    public Gryffindor(String firstName, String lastName, int witchcraft, int transgression, int nobility, int honor, int bravery) {
        super(firstName, lastName, witchcraft, transgression);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getBravery() {
        return bravery;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }

    @Override
    public String toString() {
        return "Gryffindor{" +
                "имя: " + getFirstName() +
                ", фамилия: " + getLastName() +
                ", колдоство: " + getWitchcraft() +
                ", трансгрессия: " + getTransgression() +
                ", благородство: " + nobility +
                ", честь: " + honor +
                ", храбрость: " + bravery +
                '}';
    }

    public static void comparisonStudent(Gryffindor student1, Gryffindor student2) {
        int sumPointsStudent1 = student1.getWitchcraft() + student1.getTransgression() + student1.bravery +
                student1.honor + student1.nobility;
        int sumPointsStudent2 = student2.getWitchcraft() + student2.getTransgression() + student2.bravery +
                student2.honor + student2.nobility;
        if (sumPointsStudent1 > sumPointsStudent2) {
            System.out.println(student1.getFirstName() + " " + student1.getLastName()
                    + " лучший Гриффиндорец, чем "
                    + student2.getLastName() + " " + student2.getFirstName());
        } else if (sumPointsStudent1 < sumPointsStudent2) {
            System.out.println(student2.getFirstName() + " " + student2.getLastName()
                    + " лучший Гриффиндорец, чем "
                    + student1.getFirstName() + " " + student1.getLastName());
        } else System.out.println("Студенты равны");
    }
}
