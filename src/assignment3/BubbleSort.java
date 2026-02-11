package assignment3;

import java.util.Scanner;

public class BubbleSort {

    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("How big would you like the array to be?");
    int length = in.nextInt();
    int[] array = new int[length];
    for(int i = 0; i < length; i++){
        System.out.println("Give me the value:");
        array[i] = in.nextInt();
    }
    for(int i = 0; i < length - 1; i++){
       for(int j = 0; j < length - 1; j++){
        if(array[j] > array[j + 1]){
            int temp = array[j];
            array[j] = array[j + 1];
            array[j + 1] = temp;
        }
       }
       System.out.print("Sorted value: ");
    for(i = 0; i < length; i++){
        System.out.print(array[i] + " ");
    }

    }
    }
}
