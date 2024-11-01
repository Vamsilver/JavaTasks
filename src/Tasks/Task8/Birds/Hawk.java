package Tasks.Task8.Birds;

public class Hawk extends Bird{
    public Hawk(double flySpeed) {
        super(flySpeed);
    }

    @Override
    public void fly() {
        System.out.println("Ястреб стремится к своей цели со скоростью " + getFlySpeed() + " м/с");
    }

    @Override
    public void makeSound() {
        System.out.println("Ястреб издал звук");
    }
}
