package Problem2;

/**
 * Metoda returneaza numele persoanei daca este majora, otherwise returneaza Stringul "Minor"
 */
public class Pers {
    public static String persoanaMajora(Person p) {
        if (p.age >= 18) {
            return p.name;
        } else {
            return "Minor";
        }
    }
}

