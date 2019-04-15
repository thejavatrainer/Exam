public class Piramida {
    public static void printPiramida(int n) {
        if ((n & 1) == 1) {
            for (int i = 1; i <= (n / 2 + 1); i ++) {
                for (int j = 0; j < i; j++) {
                    System.out.print("#");
                }
                System.out.println("");
            }
        }

    }
    public static void main(String args[])
    {
        printPiramida(7);
    }
}
