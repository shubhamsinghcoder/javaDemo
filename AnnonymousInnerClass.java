package Interface;

@FunctionalInterface
interface Car{

  void drive(int age, int ts);
}
public class AnnonymousInnerClass {
  public static void main(String[] args) {

    // Annonymous inner class
    // Car obj = new Car()
    //  {
    //   public void drive(){
    //     System.out.println("Driving...");
    //   }
    // };

    // Lambda expressions

    Car obj = (age,ts) -> {
      System.out.println("hello..... " + age +" "+ ts );
    }
    ;
    obj.drive(20,400);
  }
  
}
