// EXERCISES

@SuppressWarnings("SameParameterValue")

public class exam {

    public static void main(String args[]) {

        // ex1
        hasAna("Dana");
        //String s2 = new String(new String[] {"Dana", "Ana"});

        // ex 3
        numeInversate ("Nume Prenume1 Prenume2");

        // ex 4
        piramida(5);

    }

    // ex1 - printeaza numele care contin sub-stringul "ana"
    public static Boolean hasAna(String name) {
        String str1 = name;
        boolean n = (str1.contains("ana"));
        System.out.println("Name " + name + " has ana = " + n);
        return n;
    }

    // ex 3 - nume inversate
    public static String numeInversate(String numePrenume){
        String n = numePrenume;
        //String word1 = "Nume";

        //boolean t = n.matches();
        String n1 = "Prenume1 Prenume2";

        String reverseString = new StringBuilder(n1).reverse().toString();
        /*System.out.println("\nString: " + string1
                + "\nWord: " + word1
                + "\nResult String: "
                + reverseString(string1, word1)); */

        System.out.println(reverseString );
        //return reverseString;
        return reverseString;
    }


    // ex 4 - piramida
    public static Integer piramida(Integer n){
        n = 5;
        System.out.println("#");
        return n;
    }
}
