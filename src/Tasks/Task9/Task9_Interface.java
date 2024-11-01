package Tasks.Task9;

public class Task9_Interface {
    public static void main(String[] args)
    {
        Human human = new Human("Валера", 20);
        Bird bird = new Bird("Кеша", 2);
        Fish fish = new Fish("Иннокентий", 1);

        human.swim();
        fish.swim();
        bird.swim();
        bird.fly();
    }
}
