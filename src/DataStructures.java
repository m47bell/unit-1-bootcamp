import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by alexandraqin on 4/14/15.
 */
public class DataStructures {
//most frequent element
public static ArrayList<Integer>numList(){
    ArrayList<Integer> numList = new ArrayList<Integer>();
    numList.add(1);
    numList.add(2);
    numList.add(3);
    numList.add(2);
    numList.add(5);

    return numList;
}

//fixme
public static void mostFrequentElement(ArrayList<Integer>numList)
{
    numList = new ArrayList<Integer>();

    HashMap<Integer, Integer> countOccurances = new HashMap<Integer, Integer>();

    for(Integer element : numList)
    {
        Integer i = countOccurances.get(element);
        if(i == null)
        {
            i = 0;
        }
        countOccurances.put(element, i + 1);
    }

}


public static ArrayList<Cat>catList(){
    ArrayList<Cat> catList = new ArrayList<Cat>();
    Cat cat1 = new Cat("Garfield");
    Cat cat2 = new Cat("Pink Panther");
    Cat cat3 = new Cat("Molly");
    Cat cat4 = new Cat("Whiskers");
    Cat cat5 = new Cat("Fizz");

    catList.add(cat1);
    catList.add(cat2);
    catList.add(cat3);
    catList.add(cat4);
    catList.add(cat5);

    return catList;
}

public static void printCatList(ArrayList<Cat>catList){

    for(Cat cat : catList){
        System.out.println(cat.getName());
    }
}
//Pod Hash

public static HashMap<String, Integer>podList(){

  HashMap<String,Integer> podList=new HashMap<String, Integer>();

    podList.put("Sarah", 23);
    podList.put("Elvis", 25);
    podList.put("John", 23);
    podList.put("Allison",27);
    podList.put("Marbella",24);

    return podList;
}

    public static void printPodList(HashMap<String,Integer>podList){

       for(String name:podList.keySet()){
           System.out.println("Name: "+ name + " Age: "+ podList.get(name));

       }

    }

 //canRentACar

    public static boolean canRentACar(HashMap<String, Integer>podList)
    {
        for(Integer age:podList.values()){
          if (age >= 25){
                 return true;
          }
        }
        return false;
    }
  public static void main (String args[]) {
//      printCatList(catList());
//      mostFrequentElement(numList());
//      printPodList(podList());
        System.out.println(canRentACar(podList()));

      //todo
      //wordsWithoutList
      //How many clumps?

  }
}
