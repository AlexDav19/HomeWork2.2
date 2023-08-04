public class Slytherin extends Hogwarts {
    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int lustForPower;

    public Slytherin(String firstName, String lastName, int witchcraft, int transgression, int cunning, int determination, int ambition, int resourcefulness, int lustForPower) {
        super(firstName, lastName, witchcraft, transgression);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.lustForPower = lustForPower;
    }

    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public int getLustForPower() {
        return lustForPower;
    }

    public void setLustForPower(int lustForPower) {
        this.lustForPower = lustForPower;
    }

    @Override
    public String toString() {
        return "Slytherin{" +
                "имя: " + getFirstName() +
                ", фамилия: " + getLastName() +
                ", колдоство: " + getWitchcraft() +
                ", трансгрессия: " + getTransgression() +
                ", хитрость=" + cunning +
                ", решительность=" + determination +
                ", амбициозность=" + ambition +
                ", находчивость=" + resourcefulness +
                ", жажда власти=" + lustForPower +
                '}';
    }

    public static void comparisonStudent(Slytherin student1, Slytherin student2) {
        int sumPointsStudent1 = student1.getWitchcraft() + student1.getTransgression() + student1.cunning +
                student1.determination + student1.ambition + student1.resourcefulness + student1.lustForPower;
        int sumPointsStudent2 = student2.getWitchcraft() + student2.getTransgression() + student2.cunning +
                student2.determination + student2.ambition + student2.resourcefulness + student2.lustForPower;
        if (sumPointsStudent1 > sumPointsStudent2) {
            System.out.println(student1.getFirstName() + " " + student1.getLastName()
                    + " лучший Слизеринец, чем "
                    + student2.getLastName() + " " + student2.getFirstName());
        } else if (sumPointsStudent1 < sumPointsStudent2) {
            System.out.println(student2.getFirstName() + " " + student2.getLastName()
                    + " лучший Слизеринец, чем "
                    + student1.getFirstName() + " " + student1.getLastName());
        } else System.out.println("Студенты равны");
    }
}
