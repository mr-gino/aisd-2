package strukturyA;

import java.util.Random;
import java.util.Scanner;

public class BubbleSort {
    private static int N = 10;
    private static int[] myTab;


    public static void print(){
        for (int i = 0; i < N; i++) {
            System.out.print(myTab[i] + " ");
        }
        System.out.println();
    }

    public static void bubbleSort(){
        for (int i = N-1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (myTab[j] > myTab[j+1]) {
                    swap(j);
                }
            }
        }
    }

    public static void swap(int j){
        int temp = myTab[j];
        myTab[j] = myTab[j+1];
        myTab[j+1] = temp;
    }

    public static void main(String[] args) {
        myTab = new int[N];
        myTab[0] = 5;
        myTab[1] = 6;
        myTab[2] = 3;
        myTab[3] = 2;
        myTab[4] = 8;
        myTab[5] = -4;
        myTab[6] = -9;
        myTab[7] = 9;
        myTab[8] = 0;
        myTab[9] = 1;

        System.out.println("Tablica przed sortowaniem:");
        print();

        bubbleSort();

        System.out.println("Tablica po sortowaniu:");
        print();
    }
}
