
public class Person
{
        public String name;
        public int age;

        public Person(String aName, int anAge){
                name = aName;
                age = anAge;
        }

        public boolean isAna(){
                return name.equals( "Ana" );
        }

        public boolean isMajor(){
                return age >= 18;
        }
}
