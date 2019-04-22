import java.lang.StringBuilder;
import java.lang.*;

public class Nume {
    String nume;

    public Nume(String nume) {
        this.nume = nume;
    }

    public static String changeString(String sir) {

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < sir.length(); i++) {
            result.append(sir.charAt(sir.length() - 1 - i));
        }
        return result.toString();
    }



    public static void main(String Args[]) {
        Nume test = new Nume("Muica Alex Alex2 Gheorghe");
        String[] names=test.nume.split(" ") ;
        String reversed = names[0];
        for (int i=1; i< names.length;i++ ) {
            reversed+=" "+changeString(names[i]);
        }
        System.out.println(reversed);
    }
}

