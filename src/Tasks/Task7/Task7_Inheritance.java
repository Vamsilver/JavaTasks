package Tasks.Task7;

public class Task7_Inheritance {
    public static void main(String[] args) {
        Footballer footballer1 = new Footballer("Валера", "Красные", 20);
        Footballer footballer2 = new Footballer("Кирилл", "Синие", 20);

        HockeyPlayer hockeyPlayer1 = new HockeyPlayer("Максим", "Львы на льду", 19);
        HockeyPlayer hockeyPlayer2 = new HockeyPlayer("Игорь", "Пантеры", 19);

        Skier skier1 = new Skier("Тимофей", "Ак барс", 17);
        Skier skier2 = new Skier("Анатолий", "ССССССР", 67);

        System.out.println();

        footballer1.printInfo();
        footballer1.run();
        footballer1.hitBall();

        System.out.println();

        footballer2.printInfo();
        footballer2.run();
        footballer2.hitBall();

        System.out.println();

        hockeyPlayer1.printInfo();
        hockeyPlayer1.run();
        hockeyPlayer1.hitPuck();

        System.out.println();

        hockeyPlayer2.printInfo();
        hockeyPlayer2.run();
        hockeyPlayer2.hitPuck();

        System.out.println();

        skier1.printInfo();
        skier1.run();
        skier1.pushOff();

        System.out.println();

        skier2.printInfo();
        skier2.run();
        skier2.pushOff();
    }
}
