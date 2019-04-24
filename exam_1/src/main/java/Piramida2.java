public class Piramida2 {
    public static void printPiramida(int n) {
        if ((n & 1) == 1) {
            for (int i = 1; i <= n; i = i + 2) {
                for (int j = 0; j < n; j++) {
                    if (j < (n - i) / 2) {
                        System.out.print(" ");
                    } else {
                        if (((j < (i + (n - i) / 2)))) {
                            System.out.print("#");
                        } else {

                            System.out.print(" ");
                        }
                    }
                }
                System.out.println(" "+i);
            }


        }
    }


    //TODO: write level at the end of line
    public static void main(String args[]) {
        printPiramida(17);
    }
}
