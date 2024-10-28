package Helpers;

import java.util.Scanner;

public class ScannerConsole {
    Scanner scanner = new Scanner(System.in);

    public int GetIntValueFromConsole(String getMessage, String errorMessage) {
        int value = 0;
        boolean _isSuccess = false;

        do {
            System.out.println(getMessage);

            String input = scanner.next();

            try {
                value = Integer.parseInt(input);
                _isSuccess = true;
            } catch (Exception e) {
                System.out.println(errorMessage);
            }

        } while (!_isSuccess);

        return value;
    }

    public int GetIntValueFromConsoleWithLimit(int minValue, int maxValue, String getMessage, String errorMessage) {
        int value;
        boolean _isSuccess;

        do {
            value = GetIntValueFromConsole(getMessage, errorMessage);

            _isSuccess = value >= minValue && value <= maxValue;

            if (!_isSuccess)
                System.out.println(errorMessage);

        } while (!_isSuccess);

        return value;
    }
}
