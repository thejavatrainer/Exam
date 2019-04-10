/*
 * COPYRIGHT: FREQUENTIS AG. All rights reserved.
 *            Registered with Commercial Court Vienna,
 *            reg.no. FN 72.115b.
 */
package javatraining.exercises.module4;

@SuppressWarnings("all")
public class NumberContainsDigit2 {

    public static boolean numberContainsDigit2(int a) {
        String s;
        s = String.valueOf(a);
        return (s.contains("2"));
    }

    public static void main(String[] args) {
        int a[] = new int[]{22, 2, 31, 3, 77, 222, 228, 456, 5, 12, 45, 44};
        for (int i = 0; i < a.length; i++) {
            boolean digit2 = numberContainsDigit2(a[i]);
            if (digit2) {
                System.out.println(a[i]+ " The number contains digit2");
            } else
                System.out.println(a[i]+ " The number does not contain digit2");
        }

    }

}



