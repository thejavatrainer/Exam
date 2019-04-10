package javatraining.exercises.module4;

public class MediaElementelorSir {

    public static double sum(int[] a) {

        double sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum = sum + a[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        int a[] = new int[]{22, 2, 22};
        double average1 = sum(a)/a.length;
        System.out.println("Average is " + average1);
    }

}
