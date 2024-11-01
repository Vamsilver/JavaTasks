package Tasks.Task8;

import Tasks.Task8.Birds.Bird;
import Tasks.Task8.Birds.Eagle;
import Tasks.Task8.Birds.Hawk;
import Tasks.Task8.Instruments.Guitar;
import Tasks.Task8.Instruments.Instrument;
import Tasks.Task8.Instruments.Piano;

public class Task8_Abstract {
    public static void main(String[] args) {
        //Task1
        Instrument guitar = new Guitar();
        Instrument piano = new Piano();

        guitar.tune();
        guitar.play();

        System.out.println();

        piano.tune();
        piano.play();

        System.out.println("-------------------\n");
        //Task2
        Bird eagle = new Eagle(5.45);
        Bird hawk = new Hawk(5.75);

        eagle.makeSound();
        eagle.fly();

        System.out.println();

        hawk.fly();
        hawk.makeSound();
    }
}
