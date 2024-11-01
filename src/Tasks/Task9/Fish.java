package Tasks.Task9;

public class Fish implements INameable, IAgeable, ISwimmable{
    private String name;
    private int age;

    public Fish(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public void swim() {
        System.out.println("Рыбка по имени " + getName() + " возрастом " + getAge() + " лет плывет");
    }
}
