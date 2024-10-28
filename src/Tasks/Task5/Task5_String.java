package Tasks.Task5;

import java.util.Arrays;

public class Task5_String {
    public static void main(String[] args)
    {
        //Task 1
        String[] stringArray = {"ab", "cd", "ef"};

        int length = 0;

        for (String s : stringArray) {
            length += s.length();
        }

        char[] charArray = new char[length];

        int count = 0;

        for (String s : stringArray) {
            for(int i = 0; i < s.length(); i++)
            {
                charArray[count] = s.charAt(i);
                count++;
            }
        }

        System.out.println(Arrays.toString(charArray) + '\n');

        //Task 2
        String stroke = "12345";

        System.out.println(stroke.charAt(0) + "" + stroke.charAt(stroke.length() - 1) + '\n');

        //Task 3
        String stroke2 = "1203405";

        System.out.println(stroke2.indexOf('0'));
    }
}
