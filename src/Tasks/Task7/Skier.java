package Tasks.Task7;

public class Skier extends Sportsman{
    public Skier(String name, String team, int age) {
        super(name, team, age);
    }

    public void pushOff()
    {
        System.out.println("Лыжник по имени " + getName() + " оттолкнулся палками");
    }
}
