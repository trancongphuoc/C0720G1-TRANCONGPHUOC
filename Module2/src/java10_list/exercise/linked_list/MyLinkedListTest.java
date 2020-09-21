package java10_list.exercise.linked_list;

public class MyLinkedListTest {
    public static void main(String[] args) {
        MyLinkedList<Integer> list= new MyLinkedList<Integer>(5);
        list.addFirst(5);
        list.addLast(16);
//        list.addFirst(13);
        list.add(2,9);
        list.add(3,15);
        list.addLast(28);
        list.addLast(13);
        list.remove(5);
        list.printList();
//        list.clear();
//        System.out.println("clear");
//        list.printList();
//        System.out.println(list.size());
    }
}
