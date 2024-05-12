package Java.generics;


import java.util.*;

public class CustomArrayList {
    public static void main(String[] arg) {
        Map<Integer, Integer> hm = new HashMap<>();
        int[] arr = {3,2,3};

        for(int key : arr) {
            hm.put(key, hm.getOrDefault(key, 0) + 1);
        }

        System.out.println(hm);

        int maxOccerence = 0;
        int maxValue = 0;
        for(Map.Entry<Integer, Integer> entry : hm.entrySet()) {
            if(entry.getValue() > maxValue) {
                maxValue = entry.getValue();
                maxOccerence = entry.getKey();
            }
        }
        System.out.println(maxOccerence);
    }
}
