package strukturyA.z1;

public class naukZ1 {
    private int[] table;
    private int nElems;

    public naukZ1(int size){
        table = new int[size];
        nElems = 0;
    }

    public void add(int value){
        if (nElems >= table.length) {
            int[] tempTab = new int[table.length*2];
            for (int i = 0; i < table.length; i++) {
                tempTab[i] = table[i];
            }
            table = tempTab;
        }
        table[nElems] = value;
        nElems++;
    }

    public int get(int index){
        return table[index];
    }

    public int size(){
        return nElems;
    }

    public boolean remove(int index){
        if (nElems ==0 || nElems < index || index <0) {
            return false;
        }
        for (int i = index; i < nElems-1; i++) {
            table[i] = table[i+1];
        }
        nElems--;
        return true;
    }

    public int find(int value){
        for (int i = 0; i < nElems; i++) {
            if (table[i] == value) {
                return i;
            }
        }
        return -1;
    }
}
