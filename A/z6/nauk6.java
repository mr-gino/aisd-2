package strukturyA.z6;

import java.util.LinkedList;

public class nauk6 {
    private LinkedList[] hashArray;
    private int arraySize;

    public nauk6(int size) {
        arraySize = size;
        hashArray = new LinkedList[size];

        for (int i = 0; i < size; i++) {
            hashArray[i] = new LinkedList();
        }
    }

    private int hashFunc(int value) {
        return value % arraySize;
    }

    public LinkedList getLinkedList(int index) {
        return hashArray[index];
    }

    public int size() {
        return arraySize;
    }

    public void insert(int value) {
        int hashVal = hashFunc(value);
        if (!hashArray[hashVal].contains(value))
            hashArray[hashVal].addFirst(value);
    }

    public void delete(int value) {
        int hashVal = hashFunc(value);
        hashArray[hashVal].remove((Object)value);

    }

    public boolean find(int value){
        int hashVal = hashFunc(value);
        return hashArray[hashVal].contains(value);
    }

    public static void main(String[] args) {
        nauk6 npArray = new nauk6(10);
        npArray.insert(4);
        npArray.insert(42);
        npArray.insert(2);
        npArray.insert(1);
        npArray.insert(89);
        npArray.insert(45);
        npArray.insert(21);
        npArray.insert(92);
        npArray.insert(99);
        npArray.insert(55);

        System.out.println(npArray.find(21));
        npArray.delete(21);
        System.out.println(npArray.find(21));
        System.out.println(npArray.find(22));
    }
}
