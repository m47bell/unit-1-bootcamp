/**
 * Created by alexandraqin on 4/14/15.
 */
public class Loops {
    // Write a method that prints the numbers 1 through 10 using a different kind of loop

    //LOOPS
    public static void printNumbers(int x){

        int result=0;
        for(int i=1;i<=x;i++){

            result =+i;
            System.out.println(result);
        }

    }
    public static void printSumNumbers(int x){

        int result;
        for(int i=1;i<=x;i++){
            result =+i;
            System.out.println(result);
        }

    }

    public static void printNumber(int n){

        for(int i = 1; i <= n; i++ ){

            System.out.println(i);
        }
    }


    public static void printEvenNumber(int n){
        for(int i = 1; i <= n; i++){
            if(i % 2 == 0){
                System.out.println(i);
            }
        }

    }
    public static void printNumberUptoN (int n){
        int sum = 0;
        for(int i= 0; i<=n;i++){
            sum+=i;
        }
        System.out.println(sum);

    }
    //prints String n times on each line
    public static void printStrNtimes1(int n, String input){


        if(n<0){
            System.out.println("");
        }else{
            for(int i = 0; i < n;i++){
                System.out.println(input);
            }
        }
    }


    //concatenates and prints string N times
    public static void printStrNtimes(int n, String input){

        StringBuilder str = new StringBuilder(n * input.length());

        for(int i = 0; i < n;i++){

            str.append(input);

        }
        System.out.println(str);
    }

    //Prints out the first Nth fibonnacci numbers

    public static void printfibNum(int number){
        int fibNum1 = 1, fibNUm2= 0,result =0;

        for(int i = 0; i < number; i++){
            result= fibNum1+fibNUm2;
            fibNum1=fibNUm2;
            fibNUm2=result;
            System.out.println(result);
        }

    }

    //Prints put the sum of the Nth fib number
    public static void printSumfibNum(int number){
        int fibNum1 = 1, fibNUm2= 1,result =1;

        if(number ==1 || number== 2){
            System.out.println(1);
        }

        for(int i = 3; i<=number; i++){
            result= fibNum1+fibNUm2;
            fibNum1=fibNUm2;
            fibNUm2=result;
            result+=fibNum1;
        }
        System.out.println(result);

    }




    public static void main (String args[]) {
    printNumber(3);
//    printEvenNumber(4);
//    printNumberUptoN(25);
//    printStrNtimes1(-1, "hello");
//    printStrNtimes(3,"hello");
//    printfibNum(10);
//    printSumfibNum(10);

   //todo
   //sumNumbers
    //is Not
    //Between Words


  }
}
