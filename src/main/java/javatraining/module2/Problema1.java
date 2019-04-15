package javatraining.module2;


public class Problema1 {
    public static void main(String[] args) {

        String[] list = new String[]{"Andreea", "Diana", "Roxana", "Dana", "Mirela", "Ana", "Moana", "Maria"};

        for (int position = 0; position<= list.length - 1; position++) {
            if (list[position].contains("ana")){
                System.out.println(list[position]);
            }
        }
    }
}
