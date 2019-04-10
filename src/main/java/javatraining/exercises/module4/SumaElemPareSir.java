package javatraining.exercises.module4;

public class SumaElemPareSir {

    public static double sum(int[] a) {

        double sum = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0)
                sum = sum + a[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        int a[] = new int[]{2, 3, 4};
        double average1 = sum(a) / a.length;
        System.out.println("Average only for EVEN numbers is " + average1);
    }

}
