/*
 * COPYRIGHT: FREQUENTIS AG. All rights reserved.
 *            Registered with Commercial Court Vienna,
 *            reg.no. FN 72.115b.
 */
package javatraining.exercises.module4;

public class AriaDreptunghi {
 public static long area1(int a, int b) {
        int x = 10;
        long area = a * b;
        return (int) area;
    };
//testt
    public static void main(String[] args) {
        int x = (int) area1(5,6);
        System.out.println("area = " + x);
    }
}