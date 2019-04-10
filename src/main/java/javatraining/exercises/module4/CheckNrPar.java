/*
 * COPYRIGHT: FREQUENTIS AG. All rights reserved.
 *            Registered with Commercial Court Vienna,
 *            reg.no. FN 72.115b.
 */
package javatraining.exercises.module4;

public class CheckNrPar {
    public static boolean numberIsEven(int a) {
        return (a % 2 == 0);

    }

    public static void main(String[] args) {
        boolean even = numberIsEven(13);
        if (even) {
            System.out.println("The number is even");
        } else
            System.out.println("The number is odd");
    }

}