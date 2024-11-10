package Tasks.Task13;

import java.util.Arrays;

public class Task13_Generics {
    public static void main(String[] args)
    {
        //Task 1
        Integer[] array = {3, 2, 1};
        Integer[] array2 = {1, 2, 3, 4, 3};

        System.out.println(isArraysEqual(array, array2) ? "Одинаковы" : "Не одинаковы");

        //Task 2
        swapElements(array2, 0, 2);

        for (Integer i : array2)
        {
            System.out.print(i + " ");
        }
    }

    public static <T> boolean isArraysEqual(T[] value, T[] value2)
    {
        return Arrays.equals(value, value2);
    }

    public static <T> T[] swapElements(T[] array, int position1, int position2)
    {
        try {
            T tempValue = array[position1];
            array[position1] = array[position2];
            array[position2] = tempValue;
        }
        catch (Exception e)
        {
            System.out.println("Index out of bounds ");;
        }

        return array;
    }
}
