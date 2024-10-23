import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random random = new Random(); //создаю объект класса Random для использования метода nextInt для присвоения случаных значений от 0 до 99;
        Gryffindor[] gryffindors = {
                new Gryffindor("Гарри", "Поттер", random.nextInt(100), random.nextInt(100), random.nextInt(100), random.nextInt(100), random.nextInt(100)),
                new Gryffindor("Гермиона", "Грейнджер", random.nextInt(100), random.nextInt(100), random.nextInt(100), random.nextInt(100), random.nextInt(100)),
                new Gryffindor("Рон", "Уизли", random.nextInt(100), random.nextInt(100), random.nextInt(100), random.nextInt(100), random.nextInt(100))
        };
        Puffenduy[] puffenduys = {
                new Puffenduy("Захария", "Смит", random.nextInt(100), random.nextInt(100), random.nextInt(100), random.nextInt(100), random.nextInt(100)),
                new Puffenduy("Седрик", "Диггори", random.nextInt(100), random.nextInt(100), random.nextInt(100), random.nextInt(100), random.nextInt(100)),
                new Puffenduy("Джастин", "Финч-Флетчли", random.nextInt(100), random.nextInt(100), random.nextInt(100), random.nextInt(100), random.nextInt(100))
        };
        Kogtevran[] kogtevrans = {
                new Kogtevran("Чжоу", "Чанг", random.nextInt(100), random.nextInt(100), random.nextInt(100), random.nextInt(100), random.nextInt(100), random.nextInt(100)),
                new Kogtevran("Падма", "Патил", random.nextInt(100), random.nextInt(100), random.nextInt(100), random.nextInt(100), random.nextInt(100), random.nextInt(100)),
                new Kogtevran("Маркус", "Белби", random.nextInt(100), random.nextInt(100), random.nextInt(100), random.nextInt(100), random.nextInt(100), random.nextInt(100))
        };
        Slytherin[] slytherins = {
                new Slytherin("Драко", "Малфой", random.nextInt(100), random.nextInt(100), random.nextInt(100), random.nextInt(100), random.nextInt(100), random.nextInt(100), random.nextInt(100)),
                new Slytherin("Грэхем", "Монтегю", random.nextInt(100), random.nextInt(100), random.nextInt(100), random.nextInt(100), random.nextInt(100), random.nextInt(100), random.nextInt(100)),
                new Slytherin("Грегори", "Гойл", random.nextInt(100), random.nextInt(100), random.nextInt(100), random.nextInt(100), random.nextInt(100), random.nextInt(100), random.nextInt(100))
        };

        Hogwarts[] hogwarts = {     //новый массив для метода который сравнивает силу магии и дистанцию трансгрессии студентов
                gryffindors[0],
                gryffindors[1],
                gryffindors[2],
                puffenduys[0],
                puffenduys[1],
                puffenduys[2],
                kogtevrans[0],
                kogtevrans[1],
                kogtevrans[2],
                slytherins[0],
                slytherins[1],
                slytherins[2]
        };

        gryffindors[0].printStudent();
        gryffindors[1].printStudent();
        gryffindors[2].printStudent();
        System.out.println();
        puffenduys[0].printStudent();
        puffenduys[1].printStudent();
        puffenduys[2].printStudent();
        System.out.println();
        kogtevrans[0].printStudent();
        kogtevrans[1].printStudent();
        kogtevrans[2].printStudent();
        System.out.println();
        slytherins[0].printStudent();
        slytherins[1].printStudent();
        slytherins[2].printStudent();
        System.out.println();
        Gryffindor.bestGryffindor(gryffindors[0], gryffindors[1]);
        System.out.println();
        Puffenduy.bestPuffenduy(puffenduys[0], puffenduys[1]);
        System.out.println();
        Kogtevran.bestKogtevran(kogtevrans[0], kogtevrans[1]);
        System.out.println();
        Slytherin.bestSlytherin(slytherins[0], slytherins[1]);
        System.out.println();
        Hogwarts.bestStudentInPowerMagic(hogwarts[0], hogwarts[7]);
        System.out.println();
        Hogwarts.bestStudentInDistanceTransgression(hogwarts[4], hogwarts[11]);

    }
}