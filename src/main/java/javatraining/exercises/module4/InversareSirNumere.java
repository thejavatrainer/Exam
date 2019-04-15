package javatraining.exercises.module4;

/**
 * Se da un sir de numere. Creati o metoda care inverseaza sirul de numere. Primul element = ultimul element, etc.
 */
public class InversareSirNumere {

    public static void main(String[] args) {
        String str = "1,2,3,4,5,6,7,8";
        char[] charArray = str.toCharArray();
        int indexOfLastChar = charArray.length - 1;
        for (int i = 0; i < charArray.length / 2; i++) {
            char temp = charArray[i];
            charArray[i] = charArray[indexOfLastChar - i];
            charArray[indexOfLastChar - i] = temp;

        }
        String reversedStr = new String((charArray));
        System.out.println("The reversed String is:"  + reversedStr);

    }
}

