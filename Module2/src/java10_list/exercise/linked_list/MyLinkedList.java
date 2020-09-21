package java10_list.exercise.linked_list;

public class MyLinkedList<E> {

    private class Node {
        private Node next;
        private Object data;

        public Node(Object data) {
            this.data = data;
        }

        public Object getData() {
            return data;
        }
    }

    private Node head;
    private int numNode;

    public MyLinkedList(Object data) {
        head = new Node(data);
        numNode++;
    }

    public MyLinkedList() {

    }

    void add(int index, E element) {
        if (index < 0 || index > numNode) {
            throw new IndexOutOfBoundsException();
        } else {
            Node temp = head;
            Node holder;

            for (int i = 0; i < index - 1 && temp.next != null; i++) {
                temp = temp.next;
            }

            holder = temp.next;
            temp.next = new Node(element);
            temp.next.next = holder;
            numNode++;
        }
    }

    void addFirst(E e) {
        Node temp = head;
        head = new Node(e);
        head.next = temp;
        numNode++;
    }

    void addLast(E e) {
        Node temp = head;
        for (int i = 0; i < numNode && temp.next != null; i++) {
            temp = temp.next;
        }
        temp.next = new Node(e);
        numNode++;
    }

    // Xóa 1 phần tử tại index. !!!
    E removeIndex(int index) {
        if (index < 0 || index > numNode) {
            throw new IndexOutOfBoundsException();
        }

        Node temp = head;
        Object data;
        if (index == 0) {
            data = temp.data;
            head = head.next;
        } else {
            for (int i = 0; i < index - 1 && temp.next != null; i++) {
                temp = temp.next;
            }
            data = temp.next.data;
            temp.next = temp.next.next;
        }
        numNode--;
        return (E) data;
    }


    // Xóa 1 phần tử bất kì. !!!
    boolean remove(Object e) {
        if (head.data.equals(e)) {
            removeIndex(0);
            return true;
        } else {
            Node temp = head;
            int size = size();
            for (int i = 0; i < size && temp.next != null; i++) {
                if (temp.next.data.equals(e)) {
                    temp.next = temp.next.next;
                    numNode--;
                    return true;
                }
                temp = temp.next;
            }
            return false;
        }
    }

    // Kích thước list
    int size() {
        return numNode;
    }


    // Sao chép !!!
    public E clone() {
        if (numNode == 0) {
            throw new NullPointerException();
        }

        MyLinkedList<E> temp = new MyLinkedList<E>();
        Node tempNode = head;
        temp.addFirst((E) tempNode.data);
        tempNode = tempNode.next;

        while (tempNode != null) {
            temp.addLast((E) tempNode.data);
            tempNode = tempNode.next;
        }
        return (E) temp;
    }

    // Kiểm tra phần tử trong mảng.
    boolean contains(E o) {
        Node temp = head;
        while (temp.data != null) {
            if (temp.data.equals(o)) {
                return true;
            }
            temp = temp.next;
        }
        return false;

    }

    // Vị trí của phần tử trong mảng.
    int indexOf(E o) {
        int count = 0;
        Node temp = head;
        while (temp.data != null) {
            if (temp.data.equals(o)) {
                return count;
            }
            temp = temp.next;
            count++;
        }
        return -1;
    }

//     !!!
    boolean add(E e) {
        Node temp = head;
        for (int i = 0; i < numNode && temp.next != null; i++) {
            temp = temp.next;
        }
        temp.next = new Node(e);
        numNode++;
        return true;
    }


    // Lấy 1 phần tử tại index.
    E get(int index) {
        if (index < 0 || index > numNode) {
            throw new IndexOutOfBoundsException();
        }
        Node temp = head;
        for (int i = 0; i < index && temp.next != null; i++) {
            temp = temp.next;
        }
        return (E) temp.data;
    }

    // Lấy ra phần tử đầu tiên.
    E getFirst() {
        return (E) head.data;
    }

    // Lấy ra phần tử cuối cùng.
    E getLast() {
        Node temp = head;

        for (int i = 0; i < numNode && temp.next != null; i++) {
            temp = temp.next;
        }
        return (E) temp.data;
    }

    // Xóa danh sách.
    void clear() {
        Node temp = head;
        for (int i = 0; i < numNode; i++) {
            head = temp.next;
            temp = temp.next;
        }
        numNode = 0;
    }

    // In danh sách.
    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

}
