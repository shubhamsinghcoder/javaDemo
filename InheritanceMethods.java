package Inheritance;

class AeroPlane{

 public void takeOff(){
      System.out.println("Aeroplane is taking off");
  }

 public void fly(){ // overridden method
      System.out.println("Aeroplane is flying");
  }
}

class CargoPlane extends AeroPlane{
  public void fly(){ // method override
    System.out.println("Cargoplane flies at lower height ");

   }

  public void CarryGoods(){ // specialized method
    System.out.println("Cargoplane carries goods");

   }
}
class PassingerPlan extends AeroPlane{
   public void fly(){
    System.out.println("Passenger plane flies at medium height");

    }
   public void CarryPassinger(){ // specialized method
    System.out.println("Passenger plane carries passengers");

    }
}

public class InheritanceMethods {
  public static void main(String[] args) {
    
    CargoPlane cp = new CargoPlane();
    cp.takeOff();
    cp.fly();

    PassingerPlan pp = new PassingerPlan();
    pp.takeOff();
    pp.fly();
  }
  
}
