package Tasks.Task16;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Task16_Map {
    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(32,"Настя");
        hashMap.put(18,"Полина");
        hashMap.put(19,"Ева");
        hashMap.put(17,"Ангелина");
        hashMap.put(20,"Катя");

        //Task 1
        System.out.println(getKeys(hashMap) + "\n");

        //Task 2
        System.out.println(filterMapByValueLength(hashMap, 4));

    }

    public static <T, V> Set<T> getKeys(Map<T, V> map)
    {
        return map.keySet();
    }

    public static <T, V> Map<T,V> filterMapByValueLength(Map<T, V> map, int length)
    {
        Map<T, V> hashMap = new HashMap<>();

        for(Map.Entry<T, V> entry : map.entrySet())
        {
            if(entry.getValue().toString().length() > length) {
                hashMap.put(entry.getKey(), entry.getValue());
            }
        }

        return hashMap;
    }
}
