package strukturyB.z3;

import java.util.ArrayList;

public class nauk3 {
    private ArrayList<Integer> intQueue;

    public nauk3(){
        intQueue = new ArrayList<Integer>();
    }

    public boolean isEmpty(){
        return intQueue.isEmpty();
    }

    public int size(){
        return intQueue.size();
    }

    public void insert(int value){
        intQueue.add(value);
    }

    public int peek(){
        return intQueue.get(0).intValue();
    }

    public int remove(){
        int toRemove = intQueue.get(0).intValue();
        intQueue.remove(0);
        return toRemove;
    }
}
