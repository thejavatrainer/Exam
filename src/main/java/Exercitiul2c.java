public class Exercitiul2c {

    public double ex3(){
        Person sir[] = new Person[]{
                new Person("Ana",10),
                new Person("Dan", 11),
                new Person("Ion",12),
                new Person("Pop",13),
                new Person("John",14),
                new Person("Alin", 15),
                new Person("Razvan",16),
                new Person("Tudor", 17),
                new Person("Ionica",18),
                new Person("Tudorel",19)
        };

        int sumaVarstelor = 0;
        double avg = 0;
        for (int i =0; i<sir.length; i++){
            Person person = sir[i];
            int age = person.age;
            sumaVarstelor = sumaVarstelor + age;
            avg = sumaVarstelor/sir.length;

        }
        return avg;

    }



}
