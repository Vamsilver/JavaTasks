package Tasks.Task15;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Task15_Set {
    public static void main(String[] args) {

        //Task 1

        Set<String> setHash = new HashSet<>();
        setHash.add("Красный");
        setHash.add("Синий");
        setHash.add("Желтый");
        setHash.add("Черный");

        Set<String> setLinked = new LinkedHashSet<>();
        setLinked.add("Красный");
        setLinked.add("Оранжевый");
        setLinked.add("Фиолетовый");
        setLinked.add("Синий");

        System.out.println(setHash);
        System.out.println(setLinked);

        Set<String> commons = findCommon(setHash, setLinked);
        System.out.println(commons + "\n");

        //Task 2
        Set<Integer> integerSet = new LinkedHashSet<>();
        integerSet.add(14);
        integerSet.add(15);
        integerSet.add(16);
        integerSet.add(17);
        integerSet.add(18);
        integerSet.add(19);
        integerSet.add(20);

        System.out.println(integerSet);

        for(Integer obj: integerSet)
        {
            if(obj > 15 && obj % 2 == 0)
                System.out.print(obj);
            else
                System.out.print(obj / 2.0);
            System.out.print(", ");
        }

    }

    public static <T> Set<T> findCommon(Set<T> set1, Set<T> set2)
    {
        set1.retainAll(set2);
        return set1;
    }
}
