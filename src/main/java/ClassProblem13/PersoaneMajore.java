package ClassProblem13;

/**
 * Se da un sir de Persoane ca la exercitiul 13. Sa se numere cate persoane minore sunt in sir.

 */
public class PersoaneMajore {
    public static int numaraMinor(Persoana sir[]) {
        int numara = 0;
        for (Persoana om : sir) {
            if (Pers.persoanaMajora(om).equals("Minor"))
                numara++;
        }
        return numara;
    }

    public static void main(String args[]) {
        Persoana sir[] = new Persoana[]{new Persoana("Ana", 15), new Persoana("Mirela", 19),
                new Persoana("George", 9),  new Persoana("Mihai", 1)};
        System.out.println("Persoane minore in sir: " + numaraMinor(sir));
    }
}
