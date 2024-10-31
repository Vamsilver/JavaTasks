package Tasks.Task7;

public class Footballer extends Sportsman{

    public Footballer(String name, String team, int age) {
        super(name, team, age);
    }

    public void hitBall()
    {
        System.out.println("Футболист по имени " + getName() + " ударил мяч");
    }
}
