public class Exercitiul2a {

    public void ex2() {
        Person sir[] = new Person[]{
                new Person("Ana", 10),
                new Person("Dan", 11),
                new Person("Ion", 12),
                new Person("Pop", 13),
                new Person("John", 14),
                new Person("Alin", 15),
                new Person("Razvan", 16),
                new Person("Tudor", 17),
                new Person("Ionica", 18),
                new Person("Tudorel", 19)

        };
        for (int i=0; i<sir.length;i++) {
            System.out.println("Array de 10 obiecte:" + sir[i]);
        }
    }
}
