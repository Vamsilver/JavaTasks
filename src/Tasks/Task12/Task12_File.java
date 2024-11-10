package Tasks.Task12;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Task12_File {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String input;

        File file = new File("D://myfile.txt");
        file.createNewFile();
        FileWriter fileWriter = new FileWriter(file);

        System.out.println("Вводите данные для записи");

        while (true)
        {
            input = scanner.nextLine();

            if(input.equals("0"))
            {
                fileWriter.close();
                System.out.println("Файл создан");
                return;
            }
            else
            {
                fileWriter.write(input + "\n");

                System.out.println("Введите что-нибудь еще");
            }
        }
    }
}
