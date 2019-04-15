package com.javatrainer.exam;

//mport com.sun.java.util.jar.pack.ConstantPool;

public class Problema3 {
    public static StringBuilder reversOrder(String name) {


        StringBuilder reversOrder = new StringBuilder();
        reversOrder.append(name);
        reversOrder = reversOrder.reverse();
        return reversOrder;
    }

    public static void main(String args[]) {
        String[] name = new String[]{"Nume", " Prenume1", " Prenume2"};
        for (int index = name.length; index > 1; index--) {
            System.out.println(reversOrder(name[index - 1]));
        }
        System.out.println(name[0]);


    }
}
