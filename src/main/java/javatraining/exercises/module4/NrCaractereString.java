package javatraining.exercises.module4;


/**
 * Scrieti si apelati o metoda care returneaza numarul de caractere ale unui String. Metoda primeste ca parametru String-ul
 */
public class NrCaractereString {
    public static double nrSirCaractere(String sirCaracter)

    {
        return sirCaracter.length();
    }

    public static void main(String[] args) {
        String sirCaracter = "Ana are mere";
        System.out.println("Numarul de caractere ale Stringului este:" + " " + nrSirCaractere(sirCaracter));

    }
}
