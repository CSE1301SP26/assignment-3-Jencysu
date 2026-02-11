package assignment3;

import java.util.Scanner;

public class SymmetricImage {

    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int rows = 10;
    int cols = 10;
    boolean[][] image = new boolean[rows][cols];
    int pointsToGenerate = (rows * cols) / 4;
    for (int i = 0; i < pointsToGenerate; i++) {
        int r = (int) (Math.random() * rows);
        int c = (int) (Math.random() * cols);
        image[r][c] = true;
        int mirroredCol = (cols - 1) - c;
        image[r][mirroredCol] = true;
    }
    System.out.println("A randomly generated, symmetrical 10 x 10 image:");
    for (int i = 0; i < rows; i++) {
        for (int j = 0; j < cols; j++) {
            if (image[i][j]) {
                    System.out.print("*");
            } else {
                    System.out.print(" "); 
            }
        }
        System.out.println();
    }
    }
}