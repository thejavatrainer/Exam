package javatraining.exercises.module4;

public class ProdusElementeImpareSir {

    public static double productOddElements(int[] a) {

        double product = 1;

        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 != 0)
                product = product * a[i];
        }
        return product;
    }

    public static void main(String[] args) {
        int a[] = new int[]{7, 3, 13, 40};
        double productOddElements = productOddElements(a);
        System.out.println("The product for the odd elements is: " + productOddElements);
    }

}
