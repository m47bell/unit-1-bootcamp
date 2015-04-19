/**
 * Created by alexandraqin on 4/14/15.
 */
public class ClassesAndObjects {

//isOlder
 public static boolean isOlder(Cat cat1,Cat cat2){

    return(cat1.getAge() > cat2.getAge());
 }
//best friends
    public static void makeBestFriends( Cat cat1, Cat cat3){

    cat1.setFavoriteFood("Lasagna");
    cat3.setFavoriteFood(cat1.getFavoriteFood());

    }


//kitten
    public static void makeKitten(Cat cat2, Cat cat3){
     Cat kitten = new Cat(cat2.getName()+cat3.getName());
        kitten.setAge(0);

        System.out.println("A cat named " + kitten.getName()+ " with age of "+ kitten.getAge());

    }

//adoption
    public static void adoption(Cat cat, Person person){

    cat.setOwner(person);
    System.out.println(person.getName()+ " is now "+ cat.getName()+"'s owner!");

    }


  public static void main (String args[]) {

   //Cool cats
    Cat cat1 = new Cat("Garfield");
    Cat cat2 = new Cat("Pink Panther");
    Cat cat3 = new Cat("Catwoman");

    cat1.setFavoriteFood("Lasagna");

    cat2.setFavoriteFood("Hamburger");

    cat3.setFavoriteFood("Tuna");

    cat1.setAge(7);
    cat2.setAge(6);
    cat3.setAge(5);

  //isOlder
      System.out.println(isOlder(cat1, cat2));

  //makeKitten
      makeKitten(cat2,cat3);

  //adoption
  Person peter = new Person("Peter");
  adoption(cat1,peter);

    //todo
      //is free
      //is sibling



  }
}
