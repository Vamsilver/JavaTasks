package Tasks;

import Helpers.ScannerConsole;

public class Task1_If_else {

    static final String GET_MESSAGE = "Введите целое число";
    static final String ERROR_MESSAGE = "Некорректный ввод числа";

    public static void main(String[] args) {

        ScannerConsole scannerConsole = new ScannerConsole();

        // TODO Task 1
        System.out.println();

        int xValue;
        int yValue;

        xValue = scannerConsole.GetIntValueFromConsole(GET_MESSAGE + " X", ERROR_MESSAGE + " X"); //запрос данных X

        yValue = scannerConsole.GetIntValueFromConsole(GET_MESSAGE + " Y", ERROR_MESSAGE + " Y"); //запрос данных Y

        System.out.print((xValue % 2 == 0 && yValue % 2 == 0) || (xValue % 2 != 0 && yValue % 2 != 0) ? //проверка на нечетность/четность обоих чисел
                "Удачное совпадение" : "");
        //TODO End Task 1

        System.out.println("\n\n");

        // TODO Task 2
        int day;
        day = scannerConsole.GetIntValueFromConsoleWithLimit(1, 31,
                GET_MESSAGE + " дня", ERROR_MESSAGE + " дня"); //запрос данных дня

        int monthDecade;

        if (day <= 10) //опредление декады
            monthDecade = 1;
        else if (day <= 20)
            monthDecade = 2;
        else
            monthDecade = 3;

        System.out.println("Номер декады месяца = " + monthDecade);
        //TODO End Task 2
    }
}

