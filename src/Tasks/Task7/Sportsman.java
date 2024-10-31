package Tasks.Task7;

public class Sportsman {
    private String name;
    private String team;
    private int age;

    public Sportsman(String name, String team, int age) {
        this.name = name;
        this.team = team;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getTeam() {
        return team;
    }

    public int getAge() {
        return age;
    }

    public void run() {
        System.out.println("Спортсмен по имени " + getName() + " побежал");
    }

    public void printInfo() {
        System.out.println("Встречайте спортсмена по имени " + getName() + " за команду " + getTeam() +
                " возрастом " + getAge() + " лет");
    }
}
