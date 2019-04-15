public class Exercise4
{
   public static void drawPyramid( int n )
   {
      int i = 1;
      while ( i <= n )
      {
         //blank space required on each side
         int blankSpace = (n - i) / 2;

         //print blank space
         for ( int b = 0; b < blankSpace; b++ )
            System.out.print( " " );

         //print stars
         for ( int s = 0; s < i; s++ )
            System.out.print( "*" );

         //print blank space
         for ( int b = 0; b < blankSpace; b++ )
            System.out.print( " " );

         // new line
         System.out.println();

         i += 2;
      }
   }


   public static void main( String[] args )
   {
      Exercise4.drawPyramid( 19 );
   }
}
