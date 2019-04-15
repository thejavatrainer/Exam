import java.util.ArrayList;
import java.util.List;

public class Persoane
{
        private List<String> personsNames;

        Persoane(List<String>pers){
                personsNames = pers;
        }

        public List<String> getNamesThatContainsAna(){
                List<String> result = new ArrayList<String>(  );
                for (String name:personsNames){
                        if (name.contains( "ana" )){
                                result.add( name );
                        }
                }
                return result;
        }
}
