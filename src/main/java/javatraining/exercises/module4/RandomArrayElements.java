package javatraining.exercises.module4;

import java.util.Random;

/**
 * Create and int array of 20 elements. Initialize each element with random numbers between 0 and 100 using java.util.Random class
 */
public class RandomArrayElements {

    public static void main(String[] args) {
        Random ran = new Random();
        int a[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 16, 17, 18, 19, 20};
        int nxt = ran.nextInt(100);
        for (int i = 0; i < a.length; i++) {
            a[i] = nxt;
        }
        for (int j = 0; j < a.length; j++)
            System.out.println(a[j]);
    }
}
