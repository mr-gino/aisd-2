package strukturyA.z2;

public class naukZ2 {
    private int[] table;
    private int nElem;

    public naukZ2(int maxSize) {
        table = new int[maxSize];
        nElem = 0;
    }

    public void add(int value) {
        if (nElem >= table.length) {
            int[] tempTable = new int[table.length * 2];
            for (int i = 0; i < table.length; i++) {
                tempTable[i] = table[i];
            }
        }

        int j;
        for (j = 0; j < nElem; j++) {
            if (value < table[j])
                break;
        }
        for (int k = nElem; k > j; k--) {
            table[k] = table[k - 1];
        }
        table[j] = value;
        nElem++;
    }

    public int get(int index){
        return table[index];
    }

    public int size(){
        return nElem;
    }

    public boolean remove(int index){
        if (nElem == 0 || index < 0 || index >= nElem)
            return false;

        for (int i = index; i < nElem-1; i++) {
            table[i] = table[i+1];
        }
        nElem--;
        return true;
    }

    public int find(int value){
        int left = 0;
        int right = nElem-1;
        int cur;
        while(true){
            cur = (left+right)/2;
            if (table[cur] == value)
                return cur;
            else if (left>right) {
                return -1;
            } else if (table[cur]<value) {
                left = cur+1;
            } else right = cur-1;
        }
    }
}
