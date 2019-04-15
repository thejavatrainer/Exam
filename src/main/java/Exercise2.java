import java.util.ArrayList;
import java.util.List;

public class Exercise2
{
   // a
   public static List<Person> getPeople()
   {
      List<Person> people = new ArrayList<Person>();
      people.add( new Person( "Szabi", 10 ) );
      people.add( new Person( "Ana", 19 ) );
      people.add( new Person( "Diana", 77 ) );
      people.add( new Person( "Moana", 27 ) );
      people.add( new Person( "Calin", 19 ) );
      people.add( new Person( "Roxana", 45 ) );
      people.add( new Person( "Robert", 60 ) );
      people.add( new Person( "Ioana", 62 ) );
      people.add( new Person( "Tiberiu", 26 ) );
      people.add( new Person( "Serbi", 39 ) );

      return people;
   }


   // b
   public static boolean lookForAna( List<Person> people )
   {
      for ( Person p : people )
      {
         if ( p.name.equals( "Ana" ) )
         {
            return true;
         }
      }
      return false;
   }


   // c
   public static double calculateAverage( List<Person> people )
   {
      double sum = 0.0;
      for ( Person p : people )
      {
         sum += p.age;
      }
      return sum / people.size();
   }


   //d
   public static void findTheYoungestAndOldestPerson( List<Person> people )
   {
      int youngest = 10001;
      int oldest = -1;
      for ( Person p : people )
      {
         if ( p.age > oldest )
         {
            oldest = p.age;
         }
         if ( p.age < youngest )
         {
            youngest = p.age;
         }
      }
      System.out.println( "The youngest age is: " + youngest );
      System.out.println( "The oldest age is: " + oldest );
   }


   // e
   public static boolean personIsMajor( Person person )
   {
      return person.age >= 18;
   }


   // f
   public static List<Person> printMajorPeople( List<Person> people )
   {
      List<Person> majorPeople = new ArrayList<Person>();
      for ( Person p : people )
      {
         if ( Exercise2.personIsMajor( p ) )
         {
            majorPeople.add( p );
         }
      }
      return majorPeople;
   }


   public static void main( String args[] )
   {
      System.out.println( "The list of people conttains Ana: " + Exercise2.lookForAna( Exercise2.getPeople() ) );
      System.out.println( "Average age of the people: " + Exercise2.calculateAverage( Exercise2.getPeople() ) );
      Exercise2.findTheYoungestAndOldestPerson( Exercise2.getPeople() );
      Person p = Exercise2.getPeople().get( 5 );
      System.out
            .println( "The person " + p.name + ", with age " + p.age + " is major: " + Exercise2.personIsMajor( p ) );
      System.out.println( "Major people: " + Exercise2.printMajorPeople( Exercise2.getPeople() ) );
   }
}
