package java11_stack_queue.exercise.count_use_map;

import java.util.Map;

public class TreeMap {
    public static void main(String[] args) {
        String strings = "Mot hai ba bon nam sau";
        strings = strings.toLowerCase();
        Map<Character,Integer> count = new java.util.TreeMap<>();
        for (int i = 0; i < strings.length(); i++) {
            count.put(strings.charAt(i), 0);
        }
        System.out.println(count);

        for (Character key : count.keySet()) {
            for (int i = 0; i < strings.length(); i++) {
                if (key.equals(strings.charAt(i))) {
                    count.put(key, count.get(key) +1);
                }
            }
        }

        System.out.println(count);
    }
}
