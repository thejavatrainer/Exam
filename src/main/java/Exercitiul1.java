import java.util.Arrays;
import java.util.List;

public class Exercitiul1 {

    public static void  problema1(){
        List<String> list = Arrays.asList("Diana","Roxana","Dana","Ana","Moana","Ion");
        for (String each:list){
            if (each.contains("ana")){
                System.out.println("Exercitiul 1 -> Found the following name:" +each);
            }
        }

    }


}
