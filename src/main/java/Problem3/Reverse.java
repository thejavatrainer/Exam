package Problem3;

/**
 * Created by imacarie on 15.04.2019.
 */
public class Reverse {

    public static void main(String[] args) {
        String str = "Macarie Ioana Maria";
        char[] charArray = str.toCharArray();
        int indexOfLastChar = charArray.length - 1;
        for (int i = 0; i < charArray.length / 2; i++) {
            char temp = charArray[i];
            charArray[i] = charArray[indexOfLastChar - i];
            charArray[indexOfLastChar - i] = temp;

        }
        String reversedStr = new String((charArray));
        System.out.println("The reversed String is: "  + reversedStr);

    }
}

