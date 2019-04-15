package com.javatrainer.exam;

public class Problema1 {
    public static void verificaNumeContineAna(String persoane[])
    {
        for(String persoana:persoane)
        {
            if (persoana.contains("ana"))
            {
                System.out.print(persoana + ",");
            }
        }
    }
    public static void main (String args[])
    {
        String persoane[] = new String[] {"Diana", "Geta", "Roxana", "Dana", "Ana", "Moana", "Viorica"};
        System.out.print("Persoanele care contin ana sunt: " );
        verificaNumeContineAna(persoane);
    }
}
