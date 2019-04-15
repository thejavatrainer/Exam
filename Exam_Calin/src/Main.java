import java.util.*;

public class Main {

    private static boolean isAnaInArray( List<Person> personArray )
    {
        boolean isAnaInArray = false;
        for (Person persoana:personArray)
        {
            isAnaInArray = persoana.isAna();
        }
        return isAnaInArray;
    }

    private static int calculeazaVarstaMedie( List<Person> personArray )
    {
        int sumaVarsta = 0;
        for (Person persoana:personArray)
        {
            sumaVarsta+= persoana.age;
        }
        return sumaVarsta/personArray.size();
    }

    private static String getYoungestPerson( List<Person> personArray )
    {
        Person youngestPerson = new Person( personArray.get( 0 ).name,  personArray.get(0).age);

        for (Person persoana:personArray){
            if ( persoana.age < youngestPerson.age)
            {
                youngestPerson = persoana;
            }
        }
        return youngestPerson.name;
    }

    private static String getOldestPerson( List<Person> personArray )
    {
        Person oldestPerson = new Person( personArray.get( 0 ).name,  personArray.get(0).age);

        for (Person persoana:personArray){
            if ( persoana.age > oldestPerson.age)
            {
                oldestPerson = persoana;
            }
        }
        return oldestPerson.name;
    }

    private static List<String> getMajorPersons( List<Person> personArray )
    {
        List<String> result = new ArrayList<String>(  );
        for (Person persoana:personArray){
            if ( persoana.isMajor())
            {
                result.add( persoana.name );
            }
        }
        return result;
    }


    public static String inversarePrenume (String nume){
        String prenume1 = "";
        String prenume2 = "";
        String[] splitName = nume.split( " " );
        for (int i=splitName[2].length()-1; i>=0; i--){
            prenume2 += splitName[2].charAt( i );
        }
        for (int i=splitName[1].length()-1; i>=0; i--){
            prenume1 += splitName[1].charAt( i );
        }
        return prenume2 + " " + prenume1 + " " + splitName[0];
    }

    public static void printPiramidFromNumber (int baseNumber){
        for(int i=1; i <= baseNumber; i+=2) {
            for(int j=0; j < (baseNumber-i)/2; j++) {
                System.out.print(" ");
            }
            for(int k=1; k <= i; k++) {
                System.out.print("#");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        System.out.println("Hello World!");

        List<String>persoane = Arrays.asList("Diana", "Roxana", "Dana", "Ana", "Moana");
        Persoane pers = new Persoane(persoane);
        System.out.println("Persoane = " + pers.getNamesThatContainsAna());

        List<Person> personArray = Arrays.asList(
              new Person( "Diana", 18 ),
              new Person( "Roxana", 11 ),
              new Person( "Dana", 12 ),
              new Person( "Ana", 13 ),
              new Person( "Moana", 14 ),
              new Person( "Roxana", 11 ),
              new Person( "Adi", 11 ),
              new Person( "Florin", 18 ),
              new Person( "Gabriel", 11 ),
              new Person( "Roxana", 9 ));


        System.out.println("Is Ana in Array Persoane = " + isAnaInArray( personArray ));
        System.out.println("Varsta medie este = " + calculeazaVarstaMedie( personArray ));
        System.out.println("Persoana mai tanara este = " + getYoungestPerson( personArray ));
        System.out.println("Persoana mai in varsta este = " + getOldestPerson( personArray ));
        System.out.println("Persoana " + personArray.get(0).name + " este majora = " + personArray.get(0).isMajor( ));

        System.out.println("Persoanele majore sunt = " + getMajorPersons( personArray ));

        System.out.println("Inversare prenume = " + inversarePrenume("Nume Prenume1 Prenume2"));
        printPiramidFromNumber( 9 );
    }



}
