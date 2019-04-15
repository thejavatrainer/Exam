public class Exercise3
{

   public static String invertName( String name )
   {
      String[] names = name.split( " " );
      return new String( Exercise3.reverseString( names[2] ) ) + " " + new String( Exercise3.reverseString( names[1] ) )
            + " " + names[0];
   }


   public static char[] reverseString( String string )
   {
      int tail = string.length() - 1;
      char[] reversedString = new char[string.length()];
      for ( int head = 0; head < string.length() / 2 + 1; head++, tail-- )
      {
         reversedString[head] = string.charAt( tail );
         reversedString[tail] = string.charAt( head );
      }
      return reversedString;
   }


   public static void main( String args[] )
   {
      System.out.println( Exercise3.invertName( "Sebestyen Robert Tiberiu" ) );
      System.out.println( Exercise3.invertName( "Nume Prenume1 Prenume2" ) );
   }
}
