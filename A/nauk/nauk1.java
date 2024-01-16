package strukturyA.nauk;

public class nauk1 {
    private ListElem first;

    public nauk1() {
        first = null;
    }

    public boolean isEmpty() {
        return (first == null);
    }

    public void insertFirst(int value) {
        ListElem newElem = new ListElem(value);
        if (!isEmpty())
            first.next = first;
        first = newElem;
    }

    public ListElem remove(int value) {
        if (isEmpty()) return null;

        ListElem cur = first;
        ListElem prev = null;
        while (cur.iData != value) {
            if (cur.next == null) return null;
            prev = cur;
            cur = cur.next;
        }

        if (prev == null) first = first.next;
        else prev.next = cur.next;

        return cur;
    }
}
