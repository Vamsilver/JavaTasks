package Tasks.Task8.Instruments;

public class Piano extends Instrument{
    @Override
    public void play() {
        System.out.println("Пианино играет");
    }

    @Override
    public void tune() {
        System.out.println("Пианино настраивается");
    }
}
