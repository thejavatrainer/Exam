//import  java.lang.IllegalAccessException;
public class Person {
    public String name;
    public int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static boolean containAna(Person[] sir) {
        boolean resut = false;
        for (int i = 0; i < sir.length; i++) {
            if (sir[i].name.contains("ana")) {
                resut = true;
                break;
            }
        }
        return resut;

    }


    public static void doAverageAge(Person[] sir) {
        int result = 0;
        for (int i = 0; i < sir.length; i++) {
            {
                result = result + sir[i].age;
            }
        }
        System.out.println(" Varsta medie este:" + result / sir.length);
    }

    public static Person getYoungest(Person[] sir) throws IllegalAccessException {
        if (sir == null || sir.length == 0) {
            throw new IllegalAccessException(" No persons specifed");
        }
        Person youngest = sir[0];
        for (Person p : sir) {
            if (p.age < youngest.age) {
                youngest = p;

            }

        }
        return youngest;
    }

    public static Person getOldest(Person[] sir) throws IllegalAccessException {
        if (sir == null || sir.length == 0) {
            throw new IllegalAccessException(" No persons specifed");
        }
        Person oldest = sir[0];
        for (Person p : sir) {
            if (p.age > oldest.age) {
                oldest = p;

            }

        }
        return oldest;
    }

    public boolean isMajor() {

        return age >= 18;
    }

    public static Person[] isMajorAll(Person[] sir) {
        int j = 0;
        for (Person aSir : sir) {
            if (aSir.isMajor()) {
                j++;
            }
        }

        Person[] result = new Person[j];
        j = 0;
        for (Person aSir : sir) {
            if ((aSir.isMajor())) {
                result[j] = new Person(aSir.name, aSir.age);
                j++;
            }
        }
        return result;
    }

    public static void main(String Args[]) {
        Person[] sirPersoane = new Person[3];
        Person[] sirPersoaneEmpty = new Person[0];
        sirPersoane[0] = new Person("Alex", 8);
        sirPersoane[1] = new Person("Adrian", 28);
        sirPersoane[2] = new Person("Ana", 18);
        System.out.println(" Ana se afla printre persoane:" + containAna(sirPersoane));
        doAverageAge(sirPersoane);
        try {
            System.out.println(" Persoana cea mai tanara este " + getYoungest(sirPersoane).name + " cu varsta de " + getYoungest(sirPersoane).age);
        } catch (IllegalAccessException myException) {
            //fa ceva ..... iu
        }

        try {
            System.out.println(" Persoana cea mai batrana este " + getOldest(sirPersoane).name + " cu varsta de " + getOldest(sirPersoane).age);
        } catch (IllegalAccessException myException) {
            //fa ceva .....
        }

        Person[] sirPersoanemMajor = isMajorAll(sirPersoane);
        System.out.println("Toate personele majore: ");
        for (int i = 0; i < sirPersoanemMajor.length; i++) {
            System.out.println("Persona " + sirPersoanemMajor[i].name + " are varsta de " + sirPersoanemMajor[i].age);
        }
    }
}
