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
            if (sir[i].name.contains("Ana")) {
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

    public static void getYoungestOldest(Person[] sir) {
        int youngest = sir[0].age;
        int oldest = sir[0].age;
        int youngestI = 0;
        int oldestI = 0;
        for (int i = 1; i < sir.length; i++) {
            if (sir[i].age < youngest) {
                youngest = sir[i].age;
                youngestI = i;

            }
            if (sir[i].age > oldest) {
                oldest = sir[i].age;
                oldestI = i;

            }
        }
        System.out.println("Cea mai tanara persoana este: " + sir[youngestI].name);
        System.out.println("Cea mai batrana persoana este: " + sir[oldestI].name);

    }

    public static boolean isMajor(Person Persoana) {

        return Persoana.age >= 18;
    }

    public static Person[] isMajorAll(Person[] sir) {
        int j = 0;
        for (int i = 0; i < sir.length; i++) {
            if (isMajor(sir[i])) {
                j++;
            }
        }

        Person[] result = new Person[j];
        j = 0;
        for (int i = 0; i < sir.length; i++) {
            if (isMajor(sir[i])) {
                result[j] = new Person(sir[i].name, sir[i].age);
                j++;
            }
        }
        return result;
    }

    public static void main(String Args[]) {
        Person[] sirPersoane = new Person[3];
        sirPersoane[0] = new Person("Alex", 8);
        sirPersoane[1] = new Person("Adrian", 28);
        sirPersoane[2] = new Person("Ana", 18);
        System.out.println(" Ana se afla printre persoane:" + containAna(sirPersoane));
        doAverageAge(sirPersoane);
        getYoungestOldest(sirPersoane);
        Person[] sirPersoanemMajor = isMajorAll(sirPersoane);
        System.out.println("Toate personele majore: ");
        for (int i = 0; i < sirPersoanemMajor.length; i++) {
            System.out.println("Persona "+sirPersoanemMajor[i].name+" are varsta de "+sirPersoanemMajor[i].age);
        }
    }
}
