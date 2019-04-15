import java.lang.StringBuilder;
import java.lang.*;

public class Nume {
    String nume;
    String prenume1;
    String prenume2;

    public Nume(String nume, String prenume1, String prenume2) {
        this.nume = nume;
        this.prenume1 = prenume1;
        this.prenume2 = prenume2;
    }

    public static String changeString(String sir) {

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < sir.length(); i++) {
            result.append(sir.charAt(sir.length() - 1 - i));
        }
        return result.toString();
    }
    public static Nume changePrenume (Nume imput){
        Nume result = imput;
        result.prenume1=changeString(result.prenume1);
        result.prenume2=changeString(result.prenume2);
        return result;

    }

    public static void main(String Args[]) {
        Nume test= new Nume("Muica","Alex","Alex2" );
        changePrenume(test);
       System.out.println(test.prenume1+" "+test.prenume2+" "+test.nume);

    }
}
