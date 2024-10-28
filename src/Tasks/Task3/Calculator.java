package Tasks.Task3;

public class Calculator {
    int a;
    int b;

    public Calculator(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public Calculator() {
        a = 0;
        b = 0;
    }

    public int sum(int a, int b)
    {
        return a + b;
    }

    public int sum()
    {
        return a + b;
    }

    public int diff(int a, int b)
    {
        return a - b;
    }

    public int diff()
    {
        return a - b;
    }

    public void multiply(int a, int b)
    {
        System.out.println(a * b);
    }

    public void multiply()
    {
        System.out.println(a * b);
    }

    public void div(int a, int b)
    {
        System.out.println(a / b);
    }

    public void div()
    {
        System.out.println(a / b);
    }
}
