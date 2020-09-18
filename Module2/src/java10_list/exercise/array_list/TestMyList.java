package java10_list.exercise.array_list;

public class TestMyList {
    public static void main(String[] args) {
        MyList<Integer> strings = new MyList<Integer>();

        strings.add(1);
        strings.add(2);
        strings.add(3);
        strings.add(4);
        strings.add(5);
        strings.add(0, 10);
        strings.add(6, 20);
        strings.add(3, 58);
        strings.add(6, 30);
        strings.remove(0);
        strings.remove(2);
        strings.remove(2);
        System.out.println(strings.contains(5));
        System.out.println("index: " + strings.indexOf(4));
        for (int i = 0; i < strings.size(); i++) {
            System.out.println(strings.get(i));
        }

        System.out.println(strings.getabcd());

        strings.clear();
        strings.ensureCapa(5);
        System.out.println(strings.getabcd());
        for (int i = 0; i < strings.size(); i++) {
            System.out.println(strings.get(i));
        }

    }
}
