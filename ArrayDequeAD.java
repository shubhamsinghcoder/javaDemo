package Collection;
import java.util.*;

public class ArrayDequeAD {
  public static void main(String[] args) {
    
    ArrayDeque ad = new ArrayDeque();
    ad.add(25);
    ad.add(79);
    ad.add(15);
    System.out.println(ad);

    ArrayDeque ad1 = new ArrayDeque();
    ad1.add("HELLO");
    ad1.add(50);
    ad1.add(4.8);
    System.out.println(ad1);
    ad1.addAll(ad);
    System.out.println(ad1);
    ad1.addFirst(1000);
    System.out.println(ad1);
    ad1.addLast(0);
    System.out.println(ad1);
  }
  
}
