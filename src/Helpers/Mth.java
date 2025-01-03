package Helpers;

public class Mth {

    public static double random(double min, double max)
    {
        max -= min;
        return (Math.random() * ++max) + min;
    }

    public static double round(double num, int decimalPlaces)
    {
        double pow = Math.pow(10, decimalPlaces);
        return Math.ceil(num * pow) / pow;
    }

    public static double randomWithRound(double min, double max, int decimalPlaces)
    {
        return round(random(min, max), decimalPlaces);
    }

    public static boolean isEven(int num) throws Exception {
        if(num % 2 != 0) {
            throw new Exception("Число " + num + " нечетное");
        }
        else
            return true;
    }
}
