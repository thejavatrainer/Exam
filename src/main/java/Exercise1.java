import java.util.ArrayList;
import java.util.List;

public class Exercise1
{

   public static void printNamesWhichContainSubstring( List<String> names, String substring )
   {
      for ( String name : names )
      {
         if ( name.contains( substring ) )
         {
            System.out.println( name );
         }
      }
   }


   public static void main( String[] args )
   {
      List<String> names = new ArrayList<String>();
      names.add( "Diana" );
      names.add( "Calin" );
      names.add( "Moana" );
      names.add( "Robert" );

      printNamesWhichContainSubstring( names, "ana" );
   }
}
