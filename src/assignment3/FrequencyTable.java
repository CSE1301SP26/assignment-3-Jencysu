package assignment3;

import java.util.Scanner;

public class FrequencyTable {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("How many dice?");
    int diceNum = in.nextInt();
    System.out.println("Times each value was rolled with " + diceNum + " dice over 10000 rolls");
    int[] frequency = new int[diceNum * 6 + 1];
    for(int i = 0; i < 10000; i++){
        int rollSum = 0;
        for(int j = 0; j < diceNum; j++){
        int singleDie = (int)(Math.random() * 6 + 1);
        rollSum += singleDie;
        }
        frequency[rollSum]++;
    }
    for(int j = diceNum; j < diceNum * 6 + 1; j++){
        System.out.print(j + ": " + frequency[j] + " ");
    }

}
}