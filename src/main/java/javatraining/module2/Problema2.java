package javatraining.module2;

public class Problema2 {
    public static void main(String[] args) {

    Person[] persoana = new Person[10];

    persoana[0].name = "Maria";
    persoana[0].age = 10;
    persoana[1].name = "Raluca";
    persoana[1].age = 12;
    persoana[2].name = "Roxana";
    persoana[2].age = 14;
    persoana[3].name = "Andreea";
    persoana[3].age = 16;
    persoana[4].name = "Moana";
    persoana[4].age = 18;
    persoana[5].name = "Ana";
    persoana[5].age = 20;
    persoana[6].name = "Diana";
    persoana[6].age = 22;
    persoana[7].name = "Dana";
    persoana[7].age = 24;
    persoana[8].name = "Oana";
    persoana[8].age = 26;
    persoana[9].name = "Paul";
    persoana[9].age = 28;

    isAnaPresent(persoana);
    System.out.println("The average age is: " + getMeanAge(persoana));
    System.out.println("The youngest person is: " + getYoungest(persoana));
    System.out.println("The oldest person is: " + getOldest(persoana));
    System.out.println("Is this person overage?" + isOverage(persoana[2]));
    System.out.println(getOveragePeople(persoana));

    }

    public static void isAnaPresent(Person[] list){

        for (int i=0; i<=list.length-1; i++){
           if (list[i].name == "Ana")
           System.out.println("Ana is in the list");
        return;
        }
    }

    public static int getMeanAge(Person[] list){
        int sum = 0;
        for (int i=0; i<=list.length-1; i++){
            sum = sum + list[i].age;
        }
        int mean = sum/list.length;
        return mean;
    }

    public static String getYoungest(Person[] list){
        String youngest = "";
        for (int i=0; i<=list.length-1; i++){
            if (list[i].age < list[i+1].age)
                youngest = list[i].name;
        }
        return youngest;
    }

    public static String getOldest(Person[] list){
        String oldest = "";
        for (int i=0; i<=list.length-1; i++){
            if (list[i].age > list[i+1].age)
                oldest = list[i].name;
        }
        return oldest;
    }

    public static boolean isOverage(Person person){

        boolean isOverage = false;
            if (person.age >= 18)
                isOverage = true;
        return isOverage;
    }

    public static String[] getOveragePeople(Person[] list){
        String[] overagePeople = new String[] {};
        for (int i=0; i<=list.length-1; i++){
            if (list[i].age >= 18)
                overagePeople[i] = list[i].name;
        }
        return overagePeople;
    }
}
