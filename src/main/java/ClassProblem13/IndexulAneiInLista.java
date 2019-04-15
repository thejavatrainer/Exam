package ClassProblem13;

import ClassProblem13.Persoana;

/**
 * Se da un sir de Persoane ca la exercitiul 13. Sa se afiseze indexul Anei in lista. (Persoana cu numele “Ana”).
 */
public class IndexulAneiInLista {
    public static int afisareIndexAna(Persoana[] sir) {

        for (int i = 0; i < sir.length; i++) {
            Persoana om = sir[i];
            if (om.name == ("Ana")) {
                return i;
            }
        }
        return 0;
    }

    public static void main(String args[]) {
        Persoana sir[] = new Persoana[]{new Persoana("Ana", 15), new Persoana("Mirela", 19),
                new Persoana("George", 9), new Persoana("Mihai", 1)};
        System.out.println("Indexul Anei este: " + afisareIndexAna(sir));
    }
}
