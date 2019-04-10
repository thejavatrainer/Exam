package javatraining.exercises.module4;

public class SumaElementelorSir {

    public static int sum(int a[]) {

        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum = sum + a[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        int a[] = new int[]{22, 2, 31, 3, 77, 222, 228, 456, 5, 12, 45, 44};
        int sum1 = sum(a);
        System.out.println("Sum is " + sum1);
    }

}