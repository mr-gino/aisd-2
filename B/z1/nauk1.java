package strukturyB.z1;

import java.io.Console;
import java.util.ArrayList;
import java.util.LinkedList;

public class nauk1 {
    private LinkedList<Object> oList;

    public nauk1() {
        oList = new LinkedList<Object>();
    }
   public boolean isEmpty(){
        return oList.isEmpty();
   }

   public int size(){
        return oList.size();
   }

   public void insertLast(Object value){
        oList.addLast(value);
   }

   public void insertFirst(Object value){
        oList.addFirst(value);
   }

   public Object removeLast(){
        return oList.removeLast();
   }

   public Object peek(){
        return oList.get(oList.size()-1);
   }
   public void print(){
       for (int i = 0; i < oList.size(); i++) {
           System.out.println(oList.get(i));
       }
   }
}
