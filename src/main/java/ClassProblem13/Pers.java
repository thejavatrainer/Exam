package ClassProblem13;

/**
 * Return persoana majora, else return "Minor" string..
 */
public class Pers {
    public static String persoanaMajora(Persoana p) {
        if (p.age >= 18) {
            return p.name;
        } else {
            return "Minor";
        }
    }
}