package javatraining.exercises.module4;

/**
 * Scrieti si apelati o metoda care returneaza un subsir de dimensiune 3 al unui String. Metoda primeste ca parametru String-ul .

 */
public class SubstringSir {
    public static String subSir(String sirCaracter)

    {
        return sirCaracter.substring(3,6);
    }

    public static void main(String[] args) {
        String s1 = "Alinus este baiat";
        System.out.println("Subsirul de dimensiune 3 ale Stringului este:" + " " + subSir(s1));

    }
}
