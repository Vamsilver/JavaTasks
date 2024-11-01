package Tasks.Task10;

import Helpers.Mth;

public class Task10_NestedInner {
    public static void main(String[] args)
    {
        Car car = new Car("audi",
                Mth.randomWithRound(20,100,2),
                Mth.randomWithRound(1000,3000,2));
        car.startCar();
    }
}
