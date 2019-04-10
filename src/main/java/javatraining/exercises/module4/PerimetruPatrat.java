/*
 * COPYRIGHT: FREQUENTIS AG. All rights reserved.
 *            Registered with Commercial Court Vienna,
 *            reg.no. FN 72.115b.
 */
package javatraining.exercises.module4;

class PerimetruPatrat {
    public static long perimetru(int a) {
        int x = 10;
        int perimetru = 4*a;
        return (int) perimetru;
    };


    public static void main(String[] args) {
        int x = (int) perimetru(5);
        System.out.println("perimetru = " + x);
    }
}