package java10_list.exercise.linked_list;

public class MyLinkedListTest {
    public static void main(String[] args) {
        MyLinkedList<Integer> list= new MyLinkedList<Integer>(5);
        list.addFirst(10);
        list.addLast(16);
        list.add(1,9);
        list.add(3,15);
        list.addLast(28);
        list.addLast(13);

        list.remove(13);
        list.printList();
        System.out.println(list.size());
    }
}
