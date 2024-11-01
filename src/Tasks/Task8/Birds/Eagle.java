package Tasks.Task8.Birds;

public class Eagle extends Bird{

    public Eagle(double flySpeed) {
        super(flySpeed);
    }

    @Override
    public void fly() {
        System.out.println("Орел летит за добычей со скоростью " + getFlySpeed() + " м/с");
    }

    @Override
    public void makeSound() {
        System.out.println("Орел кричит в горах");
    }
}
