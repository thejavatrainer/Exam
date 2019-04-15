package javatraining.module2;
import java.util.*;

public class Problema3 {

    public static void main(String[] args){
    AnotherPerson om = new AnotherPerson();
    om.nume = "Smith";
    om.prenume1 = "John";
    om.prenume2 = "Matthew";
    String rev1 = reverseName(om.prenume2);
    String rev2 = reverseName(om.prenume1);

    System.out.println(rev1 + " " + rev2 + " " + om.nume);
    }

    public static String reverseName(String name){
        String reversedName = "";
        int lungime = name.length()-1;

        for (int i=lungime; i>=0; i--){
            reversedName = reversedName + name.charAt(i);
        }
        return reversedName;
    }
}
