package Helpers;

public class Str {
    public static boolean isStringWithoutDigits(String string) throws Exception {
        if(string.matches(".*\\d+.*"))
            throw new Exception("Строка \"" + string + "\" содержит цифры");
        else
            return true;
    }
}
