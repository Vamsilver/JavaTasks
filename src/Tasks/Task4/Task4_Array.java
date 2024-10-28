package Tasks.Task4;

import java.util.Arrays;

public class Task4_Array {
    public static void main(String[] args)
    {
        //Task 1

        int[] array_1 = {3, 87, 12, 98, 2, 4, 66};

        for(int i = array_1.length - 1; i >= 0; i--)
        {
            System.out.print(array_1[i] + " ");
        }

        System.out.println("\n");

        //Task 2
        float[] array_2 = {34.6f, 125.7f, 1.2f, 678.5f, 12.8f, 89.98f, 89.99f};

        System.out.println(Arrays.toString(reverseBubbleSort(array_2)));

        System.out.println();

        //Task 3
        int[] array_3 = {6, 117, 44, 5, 32, 81, 9};

        for(int i = array_3.length - 1; i >= 0; i--)
        {
            System.out.print(array_3[i] % 2 == 0 ? array_3[i] + " " : "");
        }
    }

    public static float[] reverseBubbleSort(float[] array)
    {
        for(int i = 0; i < array.length; i++)
        {
            for (int j = 0; j < array.length - 1; j++)
            {
                if(array[j] < array[j+1])
                {
                    float temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }

        return array;
    }
}
