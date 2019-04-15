package Problem1;

/**
 * Problem1
 */
public class Problem1 {

    private static String subSir(String list)
    {
        return list.substring(3,7);
    }
    public static void main(String[] args) {
        String list="Ana, Dana, Ioana,Moana";
        System.out.println("Substring de la index 3, 4 caractere ale sirului de caracter:"+ subSir(list));
    }
}





