package strukturyA.z4.nauk;

import java.util.List;

public class SortedLinkedList {
    private ListElem first;

    public SortedLinkedList() {
        first = null;
    }

    public ListElem getFirst() {
        return first;
    }

    public boolean isEmpty() {
        return (first == null);
    }

    public void insert(int value) {
        ListElem newElem = new ListElem(value);
        ListElem cur = first;
        ListElem prev = null;
        while (cur != null && newElem.iData > cur.iData) {
            prev = cur;
            cur = cur.next;
        }
        if (prev == null) first = newElem;
        else prev.next = newElem;
        newElem.next = cur;
    }

    public ListElem delete(int elem) {
        if (isEmpty()) return null;

        ListElem cur = first;
        ListElem prev = null;
        while (cur.iData != elem) {
            if (cur.next == null) {
                return null;
            } else {
                prev = cur;
                cur = cur.next;
            }
        }
        if (prev == null) first = first.next;
        else prev.next = cur.next;
        return cur;

    }

    public ListElem find(int elem) {
        if (isEmpty()) return null;
        ListElem cur = first;
        while (cur.iData != elem) {
            if (cur.next == null)
                return null;
            else
                cur = cur.next;
        }
        return cur;
    }

    public void print() {
        ListElem cur = first;
        while (cur != null) {
            System.out.print(cur.toString() + " ");
            cur = cur.next;
        }
    }

    public static void main(String[] args) {
        SortedLinkedList theList = new SortedLinkedList();
        theList.insert(12);
        theList.insert(42);
        theList.insert(10);
        theList.insert(22);
        theList.print();
        System.out.println();
        theList.delete(12);
        theList.print();
    }
}
