package Tasks.Task14;

import java.util.ArrayList;
import java.util.LinkedList;

public class Task14_List {
    public static void main(String[] args) {
        //Task 1
        String value = "red";
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("red");
        arrayList.add("blue");
        arrayList.add("yellow");
        arrayList.add("pink");
        arrayList.add("grey");
        arrayList.add("black");
        arrayList.add("white");


        System.out.println(arrayList);
        System.out.println("Есть ли в этом списке \"" + value + "\"?");
        System.out.println(isContainsInArray(arrayList, value) ? "Есть такой" : "Промах");

        //Task 2
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(5);

        System.out.println(linkedList);
        swapFirstAndLast(linkedList);
        System.out.println(linkedList);
    }

    public static <T> boolean isContainsInArray(ArrayList<T> arrayList, T value)
    {
        return arrayList.contains(value);
    }

    public static <T> void swapFirstAndLast(LinkedList<T> linkedList)
    {
        if(linkedList.size() == 1)
            return;

        T firstElement = linkedList.removeFirst();
        T lastElement = linkedList.removeLast();

        linkedList.addFirst(lastElement);
        linkedList.addLast(firstElement);
    }
}
