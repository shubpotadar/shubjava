import java.lang.*;
import java.util.*;

class Box<T> {
   T t;

   void add(T t) {
      this.t = t;
   }
   T getFirst() {
      return t;
   } 
}

public class generic{
   public static void main(String[] args) {
      Box<Integer> box = new Box<Integer>();
      box.add(Integer.valueOf(10));
      System.out.println("Integer Value :"+box.getFirst());

      Box<String> box1 = new Box<String>();
      box1.add("Hello World");
      System.out.println("String Value :"+box1.getFirst());
   }
}

