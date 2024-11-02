package Tasks.Task11;

import Helpers.Mth;
import Helpers.Str;

public class Task11_Exception {
    public static void main(String[] args) throws Exception {
        //Task 1
        int notEvenNum = 5;
        int evenNum = 4;

        try {
            System.out.println(Mth.isEven(notEvenNum)
                    ? "Все хорошо, число " + notEvenNum + " четное" : "Чтото плохое число...");
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }

        System.out.println(Mth.isEven(evenNum)
                ? "Все хорошо, число " + evenNum + " четное" : "Чтото плохое число...");
        System.out.println();

        //Task 2
        String str1 = "Hello world!";
        String str2 = "Hello world1!";
        String str3 = "9Hello world!";
        String str4 = "Hello 123world!";

        System.out.println(Str.isStringWithoutDigits(str1)
                ? "Все хорошо, строка \"" + str1 + "\" без символов" : "Плохо, числа есть..");

        try {
            System.out.println(Str.isStringWithoutDigits(str2)
                    ? "Все хорошо, строка \"" + str2 + "\" без символов" : "Плохо, числа есть..");
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
        finally {
            try {
                System.out.println(Str.isStringWithoutDigits(str3)
                        ? "Все хорошо, строка \"" + str3 + "\" без символов" : "Плохо, числа есть..");
            }
            catch (Exception e)
            {
                System.out.println(e.getMessage());
            }

            try {
                System.out.println(Str.isStringWithoutDigits(str4)
                        ? "Все хорошо, строка \"" + str4 + "\" без символов" : "Плохо, числа есть..");
            }
            catch (Exception e)
            {
                System.out.println(e.getMessage());
            }
        }
    }
}
