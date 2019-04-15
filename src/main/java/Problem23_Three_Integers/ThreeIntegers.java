package Problem23_Three_Integers;

/**
 * Create a class having 3 int fields..
 * constructor initialize fields/.
 * method to calculate min and mean..
 */

public class ThreeIntegers {
    public int a;
    public int b;
    public int c;

    public ThreeIntegers(final int a, final int b, final int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    private static int minimumMethod(ThreeIntegers integer1) {
        if ((integer1.a < integer1.b) && (integer1.a < integer1.c)) {
            return integer1.a;
        }
        if ((integer1.b < integer1.a) && (integer1.b < integer1.c)) {
            return integer1.b;
        }
        if ((integer1.c < integer1.a) && (integer1.c < integer1.b)) {
            return integer1.c;
        }
        return 0;
    }

    private static double mediaMethod(ThreeIntegers integer1) {
        double d = (integer1.a + integer1.b + integer1.c) / 3;
        return d;
    }

    public static void main(String[] args) {
        ThreeIntegers integer1 = new ThreeIntegers(1, 0, 5);
        System.out.println("Minimul este: " + minimumMethod(integer1));
        System.out.println("Media aritmetica este: " + mediaMethod(integer1));


    }
}