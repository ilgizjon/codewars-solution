package CodeWars;

import java.util.HashMap;
import java.util.LinkedHashMap;

/**
In this kata, you will sort elements in an array by decreasing frequency of elements.
If two elements have the same frequency, sort them by increasing value.
**/

public class SimpleFrequencySort {

    public static void main(String[] args) {
        sortByFrequency(new int[]{2, 3, 5, 3, 7, 9, 5, 3, 7});
    }

    public static int[] sortByFrequency(int[] ints){
        HashMap<Integer, Integer>map = new LinkedHashMap<>();
        int[]res = new int[ints.length];

        for(int i : ints){
            if(!map.containsKey(i)){
                map.put(i, 1);
            }
            else{
                int oldVal = map.get(i);
                map.replace(i, oldVal, ++oldVal);
            }
        }
 //       for()

        /**
        map.entrySet().forEach(entry -> {
            System.out.println(entry.getKey() + " " + entry.getValue());
        });
        **/

        return new int[1];
    }
}