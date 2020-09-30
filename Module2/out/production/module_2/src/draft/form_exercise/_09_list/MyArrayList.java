package _09_list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MyArrayList {
    public static void main(String[] args) {
        List myArray = new ArrayList();
        myArray.add(1); //index = 0
        myArray.add("one"); //index = 1

        System.out.println(myArray.get(1));
        //System.out.println(myArray.get(1));
        //myArray.set(1,5);
        //System.out.println(myArray.get(1));
       // System.out.println(myArray.isEmpty());
       // System.out.println(myArray.size());

        //myArray.remove(0);
        //System.out.println(myArray.size());


        List myLinkedList = new LinkedList();
        myLinkedList.add(1);
        myLinkedList.add(2);
        myLinkedList.add(3);

        System.out.println(myLinkedList.get(2));
    }
}
