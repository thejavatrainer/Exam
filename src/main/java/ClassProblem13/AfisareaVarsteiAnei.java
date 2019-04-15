package ClassProblem13;

/**
 * Se da un sir de Persoane ca la exercitiul 13. Sa se afiseze varsta Anei. (Persoana cu numele “Ana”).
 */
public class AfisareaVarsteiAnei {
    public static int afisareVarstaAna(Persoana[] sir) {

        for (int i = 0; i < sir.length; i++) {                            //for (Persoana om : sir)
            Persoana om = sir[i];                                         //sir =(int i = 0; i < sir.length; i++)
            if (om.name == ("Ana")) {
                return om.age;
            }
        }
        return 0;
    }

    public static void main(String args[]) {
        Persoana sir[] = new Persoana[]{new Persoana("Ana", 15), new Persoana("Mirela", 19),
                new Persoana("George", 9), new Persoana("Mihai", 1)};
        System.out.println("Varsta Anei este: " + afisareVarstaAna(sir));
    }
}
