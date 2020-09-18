package java10_list.pricise.class_list_implementation;

import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object elements[];

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    private void ensureCapa() {
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }

    public void add(E e) {
        if (size == elements.length) {
            ensureCapa();
        }
        elements[size++] = e;
//        System.out.println("size: " + size + "elements " + size + ":" + e);
    }

    public E get(int i) {
        if (i>= size || i <0) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i );
        }
        return (E) elements[i];
    }


    E remove(int index) {
        int newSize = elements.length - 2;
        for (int i = 0; i < elements.length; i++) {
            if (i == index) {
                for (int j = index; j < elements.length; j++) {
                    elements[j] = elements[j+1];
                    if (elements.length -2 == j) {
                        break;
                    }
                }
            }
        }
        return (E) elements;
    }

    int size() {
        int count = 0;
        for (int i = 0; i < elements.length; i++) {
            if (elements[i] != null) {
                count++;
            }
        }
        return count;
    }

    boolean contains(E o) {
        boolean check = false;
        for (int i = 0; i < elements.length; i++) {
            if ( elements[i] == o) {
                check = true;
            }
        }
        return check;
    }



}
