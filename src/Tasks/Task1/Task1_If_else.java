package Tasks.Task1;

import Helpers.ScannerConsole;

public class Task1_If_else {

    static final String GET_MESSAGE = "Введите целое число";
    static final String ERROR_MESSAGE = "Некорректный ввод числа";

    public static void main(String[] args) {

        ScannerConsole scannerConsole = new ScannerConsole();

        // Task 1
        System.out.println();

        int xValue;
        int yValue;

        xValue = scannerConsole.getIntValueFromConsole(GET_MESSAGE + " X", ERROR_MESSAGE + " X"); //запрос данных X

        yValue = scannerConsole.getIntValueFromConsole(GET_MESSAGE + " Y", ERROR_MESSAGE + " Y"); //запрос данных Y

        System.out.print((xValue % 2 == 0 && yValue % 2 == 0) || (xValue % 2 != 0 && yValue % 2 != 0) ? //проверка на нечетность/четность обоих чисел
                "Удачное совпадение" : "");
        // End Task 1

        System.out.println("\n\n");

        //  Task 2
        int day;
        day = scannerConsole.getIntValueFromConsoleWithLimit(1, 31,
                GET_MESSAGE + " дня", ERROR_MESSAGE + " дня"); //запрос данных дня

        int monthDecade;

        if (day <= 10) //опредление декады
            monthDecade = 1;
        else if (day <= 20)
            monthDecade = 2;
        else
            monthDecade = 3;

        System.out.println("Номер декады месяца = " + monthDecade);
        // End Task 2
    }
}

