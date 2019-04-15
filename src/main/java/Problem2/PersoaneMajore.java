package Problem2;

/**
 * a. Persoanele majore din lista
 */

public class PersoaneMajore {
    public static int numaraMinor(Person sir[]) {
        int numara = 0;
        for (Person om : sir) {
            if (Pers.persoanaMajora(om).equals("Minor")) numara++;
        }
        return numara;
    }

    public static void main(String args[]) {
        Person sir[] = new Person[]{new Person("Ana", 15), new Person("Mirela", 19), new Person("George", 9),
                new Person("Mihai", 1), new Person("Ioana", 15), new Person("Delia", 15), new Person("Marian", 15),
                new Person("Iulia", 15), new Person("Denisa", 15), new Person("Andreea", 15)}; // an array of 10 objects
        System.out.println("Persoane minore in sir: " + numaraMinor(sir));
    }
}
