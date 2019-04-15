package ClassProblem13;

/**
 * Scrieti si apelati o metoda care returneaza un Boolean cu valoarea true daca persoana este majora si false daca persoana este minora. Pentru persoanele minore metoda va returna stringul “Minor”.
 * Metoda primeste ca parametru un obiect de tip “Person”.
 * public class Person{
 * public Sting name;
 * public int age;
 * }
 */

public class Persoana {
    public String name;
    public int age;

    public Persoana(final String name, final int age) {
        this.name = name;
        this.age = age;
    }

    public static void main(String args[]) {
        Persoana persoana = new Persoana("Ana", 19);
        String nume = Pers.persoanaMajora(persoana);
        if (nume.equals("Minor")) {
            System.out.println("Persoana este minora");
        } else {
            System.out.println(nume + " este majora");
        }


    }
}
