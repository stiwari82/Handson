import java.util.*;

public class VectorDemo {

  public static void main(String a[]) {

    Vector v = new Vector();

System.out.println("capacity of the vector " +v.capacity());

    v.add("uuuuu");

    v.add(99);

    v.add(8.88);

    v.add('g');

    v.add(8.88);

    v.add(null);

System.out.println("capacity of the vector" + v.capacity());

System.out.println("vector size=" + v.size());

    v.add(99);

    v.add(8.88);

    v.add('g');

    v.add(8.88);

    v.add(null);

System.out.println("after adding 10 elements vector capacity is=" + v.capacity());

    System.out.println("vector size=" + v.size());

    Enumeration e = v.elements();

    while(e.hasMoreElements()) {

      System.out.println(e.nextElement());

    }

  }

}





