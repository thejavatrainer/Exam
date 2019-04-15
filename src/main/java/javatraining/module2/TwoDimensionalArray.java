/*
 * COPYRIGHT: FREQUENTIS AG. All rights reserved.
 *            Registered with Commercial Court Vienna,
 *            reg.no. FN 72.115b.
 */
package javatraining.module2;

@SuppressWarnings("all")
public class TwoDimensionalArray {
    public static void main(String[] args) {
        char twoD[][] = new char[][]{
                {'x', '0', '0'},
                {'0', 'x', '0'},
                {'0', '0', 'x'}};

        System.out.println(twoD[1][1]);

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(twoD[i][j] + " ");
            }
            System.out.println();
        }
    }
}
