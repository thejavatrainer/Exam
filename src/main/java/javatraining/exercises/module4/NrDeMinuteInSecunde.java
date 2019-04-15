package javatraining.exercises.module4;

/**
 * Implementati o metoda care transforma un numar de minute, in secunde. Metoda primeste ca parametru numarul de minute. Eg. public int getSeconds(int minutes)
 */
public class NrDeMinuteInSecunde {
    public static int getSeconds(int minutes) {
        long seconds = 60 * minutes;
        return (int) seconds;
    }

    public static void main(String[] args) {
        int x = getSeconds(3);
        System.out.println("10 minutes have = " + x + "seconds");
    }
}
