/**
 * Created by alexandraqin on 4/14/15.
 */
public class Variables {

    public static boolean isOdd(int num){

        return true;
    }

    public static void printHelloWorld(){

        System.out.println("Hello World");
    }

    public static int greatestCommonFactor(int x, int y){
        int result=0;

        return result;
    }

    public static void printVariables(){
        int roomNum= 113;
        double e = 2.71828;
        String className= "Computer Science";

        System.out.println("This is room # "+ roomNum);
        System.out.println("e is close to "+ e);
        System.out.println("I am learning a bit about "+className);

    }

  public static void main (String args[]) {

    printVariables();
      printHelloWorld();
      greatestCommonFactor(3,5);
      isOdd(5);




  }
}
