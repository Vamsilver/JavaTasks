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

    public int Sum(int a, int b)
    {
        return a + b;
    }

    public int Sum()
    {
        return a + b;
    }

    public int Diff(int a, int b)
    {
        return a - b;
    }

    public int Diff()
    {
        return a - b;
    }

    public void Multiply(int a, int b)
    {
        System.out.println(a * b);
    }

    public void Multiply()
    {
        System.out.println(a * b);
    }

    public void Div(int a, int b)
    {
        System.out.println(a / b);
    }

    public void Div()
    {
        System.out.println(a / b);
    }
}
