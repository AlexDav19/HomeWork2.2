public class Main {
    public static void main(String[] args) {
        Gryffindor[] gryffindors = {
                new Gryffindor("Гарри", "Поттер", rnd(), rnd(), rnd(), rnd(), rnd()),
                new Gryffindor("Гермиона", "Грейнджер", rnd(), rnd(), rnd(), rnd(), rnd()),
                new Gryffindor("Рон", "Уизли", rnd(), rnd(), rnd(), rnd(), rnd())
        };
        Hufflepuff[] hufflepuffs = {
                new Hufflepuff("Захария", "Смит", rnd(), rnd(), rnd(), rnd(), rnd()),
                new Hufflepuff("Седрик", "Диггори", rnd(), rnd(), rnd(), rnd(), rnd()),
                new Hufflepuff("Джастин", "Финч-Флетчли", rnd(), rnd(), rnd(), rnd(), rnd())
        };
        Ravenclaw[] ravenclaws = {
                new Ravenclaw("Чжоу", "Чанг", rnd(), rnd(), rnd(), rnd(), rnd(), rnd()),
                new Ravenclaw("Падма", "Патил", rnd(), rnd(), rnd(), rnd(), rnd(), rnd()),
                new Ravenclaw("Маркус", "Белби", rnd(), rnd(), rnd(), rnd(), rnd(), rnd())
        };
        Slytherin[] slytherins = {
                new Slytherin("Драко", "Малфой", rnd(), rnd(), rnd(), rnd(), rnd(), rnd(), rnd()),
                new Slytherin("Грэхэм", "Монтегю", rnd(), rnd(), rnd(), rnd(), rnd(), rnd(), rnd()),
                new Slytherin("Грегори", "Гойл", rnd(), rnd(), rnd(), rnd(), rnd(), rnd(), rnd())
        };

        PrintStudent printStudent = new PrintStudent();
        printStudent.printStudent(gryffindors);

        System.out.println(slytherins[0]);

        Gryffindor.comparisonStudent(gryffindors[0], gryffindors[2]);
        Hufflepuff.comparisonStudent(hufflepuffs[0], hufflepuffs[1]);
        Hogwarts.comparisonStudent(gryffindors[0],slytherins[0]);
    }

    public static int rnd() {
        return (int) (Math.random() * 100);
    }
}