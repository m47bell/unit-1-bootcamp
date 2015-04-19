import java.util.Random;

/**
 * Created by alexandraqin on 4/14/15.
 */
public class Methods {


    public static String toLowerCase(String str){

        String newStr = str.toLowerCase();

        return newStr;
    }

    public static boolean isMultiple(int x, int y){

        if(x % y == 0 || y % x == 0) {
            return true;
        } else {
            return false;
        }
    }

    //Pretty Integer
    public static void prettyInteger (int x){

        String star = "";

        for(int i = 1; i <= x;i++){

            star += "*";
        }
        System.out.println(star + " " + x + " " + star);
    }

    //Random
    //    Write a method called random that takes 2
    //ints as parameters and returns a random int within that range.

    public static int randomNum(int x, int y) {
        int value;
        Random rand = new Random();
        if(y<x){
            return 0;
        }
        else
        {
            value = rand.nextInt((y - x) + 1) + x;
        }

        return value;
    }



    public static void main (String args[]) {
        System.out.println(toLowerCase("HELLO"));
        System.out.println(isMultiple(2, 3));
        prettyInteger(4);
        System.out.println(randomNum(2,25));

  }

}