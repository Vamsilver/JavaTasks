package Tasks.Task8.Instruments;

public class Guitar extends  Instrument{
    @Override
    public void play() {
        System.out.println("Гитара играет");
    }

    @Override
    public void tune() {
        System.out.println("Идет настройка гитары");
    }
}
