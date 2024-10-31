package Tasks.Task7;

public class HockeyPlayer extends Sportsman {

    public HockeyPlayer(String name, String team, int age) {
        super(name, team, age);
    }

    public void hitPuck()
    {
        System.out.println("Хоккеист " + getName() + " ударил по шайбе");
    }
}
