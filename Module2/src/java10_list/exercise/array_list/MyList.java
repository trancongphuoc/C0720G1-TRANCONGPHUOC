package java10_list.exercise.array_list;

import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object elements[];

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public MyList(int capacity) {
        elements = new Object[capacity];
    }

    // Đảm bảo kích thước
    void ensureCapa(int minCapacity) {
        if (minCapacity > 0) {
            elements = Arrays.copyOf(elements, elements.length + minCapacity);
        } else {
            throw new IndexOutOfBoundsException("Failed");
        }
    }

    // Thêm 1 phần tử vào cuối mảng.
    public boolean add(E e) {
        if (size == elements.length)
            elements = Arrays.copyOf(elements, elements.length + 1);
        elements[size++] = e;
        return true;
    }

    // Thêm 1 phần tử vào vị trí chỉ định
    public void add(int index, E element) {
        if (size == elements.length)
            elements = Arrays.copyOf(elements, elements.length + 1);

        if (index == size) {
            add(element);
        } else if (index >= 0 && index < size()) {
            for (int i = 0; i < size; i++) {
                if (i == index) {
                    for (int j = size ; j > index; j--) {
                        elements[j] = elements[j - 1];
                    }
                    elements[index] = element;
                }
            }
            size++;
        } else {
            throw new IndexOutOfBoundsException("Failed");
        }

    }

    // Xóa 1 phần tử tại vị trí chỉ định
    E remove(int index) {
        if (index >= 0 && index < size) {
                for (int i = 0; i < size; i++) {
                    if (i == index) {
                        for (int j = index; j < size; j++) {
                            elements[j] = elements[j + 1];
                        }
                    }
                }
                size--;
        } else {
            throw new IndexOutOfBoundsException("Failed Remove");
        }
        return (E) elements;
    }

    // Độ dài mảng.
    int size() {
        return size;
    }

    // Sao chép.
    public E clone() {
        MyList<E> temp = new MyList<E>();
        for (int i = 0; i < size; i++) {
            temp.add(get(i));
        }
        return (E) temp;
    }


    // Kiểm tra xem phần tử có nằm trong mảng
    boolean contains(E o) {

        for (int i = 0; i < elements.length; i++) {
            if (elements[i] == o) {
                return true;
            }
        }
        throw new IndexOutOfBoundsException("Failed Contains");
    }

    // Kiểm tra vị trí của phần tử
    int indexOf(E o) {
        int flag = -1;
        for (int i = 0; i < size(); i++) {
            if (o == elements[i]) {
                flag = i;
                break;
            }
        }
        return flag;
    }

    // Lấy phần tử
    E get(int index) {
        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size " + index);
        }
        return (E) elements[index];
    }

    // Clear !!!!!!!!!!!!!!!!!!
    void clear() {
        int length = size;
        for (int i = 0; i < length; i++) {
            if (elements[i] != null) {
                size--;
            }
            elements[i] = null;
        }
    }



}
