package javatraining.exercises.module4;

/**
 * Created by imacarie on 10.04.2019.
 */
public class ElementeMaiMiciDecat5Sir {
    public static double countElements5(int[] a) {

        int element = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] < 5)
                element++;
        }
        return element;
    }

    public static void main(String[] args) {
        int a[] = new int[]{1, 2, 3, 4, 7, 9, 10};
        double countElementsSmallerThan5 = countElements5(a);
        System.out.println("In the array are: " + countElementsSmallerThan5 + " " + "elements");
    }


}
