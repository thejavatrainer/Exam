public class TestDeProbleme {


    public static void main(String[] args) {
        PersonsUtil utilitar = new PersonsUtil();

        Person alex = new Person("Alex", 21);
        Person genu = new Person("Eugen", 18);
        Person szabi = new Person("Szabi", 12);

        Person[] persoane = new Person[]{alex, genu, szabi};

        System.out.println("Persoanele majore au numele:" + utilitar.isMajorAll(persoane));
    }
}
