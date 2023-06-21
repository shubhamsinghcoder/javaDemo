package Inheritance;
class Animal1{

  void food(){
    System.out.println("Animal need food");
  }
}

class Tiger extends Animal1{

}
class Monkey extends Animal1{

}
class Dear extends Animal1{

}

public class HierarchicalInheritance {
  public static void main(String[] args) {
    
    Dear d = new Dear();
    d.food();
  }
  
}
