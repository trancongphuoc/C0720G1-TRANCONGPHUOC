package java11_stack_queue.exercise.count_use_map;

import java.util.Map;

public class TreeMap {
    public static void main(String[] args) {
        String strings = "mot hai ba bon nam sau";
        Map<String,Integer> count = new java.util.TreeMap<>();

        for (int i = 0; i < strings.length(); i++) {
            count.put(String.valueOf(strings.charAt(i)), 0);
        }

        for (String key : count.keySet()) {
            System.out.println(key + " : " + count.get(key));
        }

        for (String key : count.keySet()) {
            for (int i = 0; i < strings.length(); i++) {
                if (key.equals(String.valueOf(strings.charAt(i)))) {
                    count.put(key, count.get(key) +1);
                }
            }
        }

        for (String key : count.keySet()) {
            System.out.println(key + " : " + count.get(key));
        }


    }
}
