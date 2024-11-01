package Tasks.Task8.Birds;

public abstract class Bird {
    private double flySpeed;

    public Bird(double flySpeed) {
        this.flySpeed = flySpeed;
    }

    public abstract void fly();

    public abstract void makeSound();

    public double getFlySpeed() {
        return flySpeed;
    }
}
