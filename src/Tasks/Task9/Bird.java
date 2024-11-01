package Tasks.Task9;

public class Bird implements INameable, IAgeable, ISwimmable, IFlyable{
    private String name;
    private int age;

    public Bird(String name, int age) {
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
        System.out.println("Птичка по имени " + getName() + " возрастом " + getAge() + " лет плывет");
    }

    @Override
    public void fly() {
        System.out.println("Птичка по имени " + getName() + " возрастом " + getAge() + " лет устремилась в полет");
    }
}
