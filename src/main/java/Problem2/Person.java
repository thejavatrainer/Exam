package Problem2;

/**
 * class Person
 * array of 10 objects
 */
public class Person {
    public String name;
    public int age;

    public Person(final String aName, final int anAge) {
        name = aName;
        age = anAge;
    }

    public static void main(String args[]) {
        //Person persoana = new Person("Ana", 19);
        Person sir[] = new Person[]{new Person("Ana", 19), new Person("Mirela", 19), new Person("Georgiana", 19), new Person("Minodora", 1), new Person("Ioana", 15), new Person("Delia", 22), new Person("Mariana", 56), new Person("Iulia", 23), new Person("Denisa", 45), new Person("Andreea", 89)};

        for (Person om : sir) {
            if (om.name.equals("Ana")) {
                System.out.println("Ana se afla in lista");
                System.out.println("--------------------");
            }
        }

        for (Person om : sir) {
            String aName = Pers.persoanaMajora(om);
            if (Pers.persoanaMajora(om).equals("Minor")) {
                System.out.println(aName + " este minora");
            } else {
                System.out.println(aName + " este majora");
            }
        }

        for (Person om : sir) {
            String aName = Pers.persoanaMajora(om);
            if (Pers.persoanaMajora(om).equals("89")) {
                System.out.println(aName + " este cea mai varstanica persoana din lista");
            }

        }



        //String nume = Pers.persoanaMajora(persoana);
        // if (nume.equals("Minor")) {
        //   System.out.println("Person este minora");
        // } else {
        // System.out.println(nume + " este majora");
        // }


    }


}