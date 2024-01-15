package strukturyA.z3.nauk;

import java.util.LinkedList;
import java.util.List;

public class naukZ4 {
    private ListElem first;

    public naukZ4() {
        first = null;
    }

    public boolean isEmpty() {
        return (first == null);
    }

    public ListElem getFirst() {
        return first;
    }

    public void insertFirst(int value) {
        ListElem newElem = new ListElem(value);
        if (!isEmpty())
            newElem.next = first;
        first = newElem;
    }

    public boolean find(int elem) {
        if (isEmpty()) return false;
        ListElem cur = first;
        while (elem != cur.iData) {
            if (cur.next == null)
                return false;
            else
                cur = cur.next;
        }
        return true;
    }

    public ListElem deleteFirst() {
        if (isEmpty()) return null;

        ListElem tempElem = first;
        first = first.next;
        return tempElem;
    }

    public ListElem delete(int elem) {
        if (isEmpty()) return null;

        ListElem cur = first;
        ListElem prev = null;

        while (cur.iData != elem) {
            if (cur.next == null) return null;
            else {
                prev = cur;
                cur = cur.next;
            }
        }
        if (prev == null) {
            first = first.next;
        } else
            prev.next = cur.next;
        return cur;
    }

    public void print() {
        ListElem cur = first;
        while (cur != null){
            System.out.print(cur.iData + " ");
            cur= cur.next;}
    }

    public static void main(String[] args) {
        naukZ4 theList = new naukZ4();

        theList.insertFirst(22);
        theList.insertFirst(77);
        theList.insertFirst(11);

        theList.print();

    }
}
