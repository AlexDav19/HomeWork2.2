public class Hufflepuff extends Hogwarts {
    private int industriousness;
    private int loyalty;
    private int honesty;

    public Hufflepuff(String firstName, String lastName, int witchcraft, int transgression, int industriousness, int loyalty, int honesty) {
        super(firstName, lastName, witchcraft, transgression);
        this.industriousness = industriousness;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public int getIndustriousness() {
        return industriousness;
    }

    public void setIndustriousness(int industriousness) {
        this.industriousness = industriousness;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }

    @Override
    public String toString() {
        return "Hufflepuff{" +
                "имя: " + getFirstName() +
                ", фамилия: " + getLastName() +
                ", колдоство: " + getWitchcraft() +
                ", трансгрессия: " + getTransgression() +
                ", трудолюбивость: " + industriousness +
                ", верность: " + loyalty +
                ", честность=" + honesty +
                '}';
    }

    public static void comparisonStudent(Hufflepuff student1, Hufflepuff student2) {
        int sumPointsStudent1 = student1.getWitchcraft() + student1.getTransgression() + student1.industriousness +
                student1.loyalty + student1.honesty;
        int sumPointsStudent2 = student2.getWitchcraft() + student2.getTransgression() + student2.industriousness +
                student2.loyalty + student2.honesty;
        if (sumPointsStudent1 > sumPointsStudent2) {
            System.out.println(student1.getFirstName() + " " + student1.getLastName()
                    + " лучший Пуффендуец, чем "
                    + student2.getLastName() + " " + student2.getFirstName());
        } else if (sumPointsStudent1 < sumPointsStudent2) {
            System.out.println(student2.getFirstName() + " " + student2.getLastName()
                    + " лучший Пуффендуец, чем "
                    + student1.getFirstName() + " " + student1.getLastName());
        } else System.out.println("Студенты равны");
    }
}
