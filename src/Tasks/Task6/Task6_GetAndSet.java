package Tasks.Task6;

public class Task6_GetAndSet {
    public static void main(String[] args)
    {
        Gamer[] gamers = {new Gamer("Вова"),
                new Gamer("Ян", true),
                new Gamer("Дима", true),
                new Gamer("Антон"),
                new Gamer("Борис", true)};

        for(Gamer g : gamers)
        {
            if(g.getActive())
                System.out.println(g.getNickname());
        }
    }
}
