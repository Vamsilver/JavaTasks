package Tasks;

public class Task2_While {
    public static void main(String[] args)
    {
        //Task1
        int variable = 0;
        while (++variable <= 50)
        {
            System.out.print( variable % 3 == 0 ? variable + "\n" : "" );
        }

        //Task2
        int sum = 0;
        for(int i = 1; i <= 100; i++)
        {
            sum += i;
        }
        System.out.println("Сумма всех чисел от 1 до 100 = " + sum);
    }
}
