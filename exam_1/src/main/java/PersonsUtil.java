public class PersonsUtil {
    public String isMajorAll(Person[] sir) {
        int j = 0;
        for (Person aSir : sir) {
            if (aSir.isMajor()) {
                j++;
            }
        }

        String result = "";
        j = 0;
        for (Person person : sir) {
            if ((person.isMajor())) {
                result = result + person.name+ " ";
                j++;
            }
        }
        return result;
    }
}
