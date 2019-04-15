package com.javatrainer.exam;

public class Problema4 {
    public static void printEmptySpaces(int numberOfRows, int numberOfLine)
    {
            for (int lineNumber = 1; lineNumber <= (numberOfRows-numberOfLine) / 2; lineNumber++) {
                System.out.print(" ");
            }
    }

    public static void printSpecialChar(int numberOfLine)
    {
        for (int lineNumber = 1; lineNumber <= numberOfLine; lineNumber++) {
            System.out.print("#");
        }
    }
    public static void main(String args[]) {
        int numberOfRows = 9;
        for (int numberOfLine = 1; numberOfLine <= numberOfRows; numberOfLine++) {
            printEmptySpaces(numberOfRows,numberOfLine);
            printSpecialChar(numberOfLine);
            printEmptySpaces(numberOfRows,numberOfLine);
            System.out.println();
        }
    }
}
