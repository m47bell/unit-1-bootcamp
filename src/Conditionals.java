/**
 * Created by alexandraqin on 4/14/15.
 */
public class Conditionals {

    public static boolean isOdd(int n)
    {
        boolean isODD = false;

        if(n % 2 == 0)
        {
            return  isODD;
        }
        else
        {
            return true;
        }
    }
    public static boolean isMultipleOfThree(int n) {
        //  a is a multiple of b if a % b == 0 is true
        if(n % 3==0)
            return true;
        else
            return false;
    }

    public static boolean isOddAndIsMultipleOfThree(int n) {

        if(isOdd(n)==true &&isMultipleOfThree(n)==true)
            return true;
        else
            return false;
    }

    public static boolean whereYouFrom(Person person){
       return person.getCity().equalsIgnoreCase("london");
    }

    public static void personName(Person person){
        if(person.getName().length()<=5){
            System.out.println("Name is too short");
        }else{
            System.out.println(person.getName());
        }
    }



  public static void main (String args[]) {
      System.out.println(isOddAndIsMultipleOfThree(9));
      System.out.println(isOdd(3));
      System.out.println(isMultipleOfThree(12));

      Person molly= new Person("Molly");

      molly.setCity("Boston");
      System.out.println(whereYouFrom(molly));

      Person garfield= new Person("Garfield");

      personName(molly);
      personName(garfield);

      //toDO
      //Cigar Party
      //caught speeding
      //alarm clock


  }
}
