import java.util.*;

public class HashTableDemo{

  public static void main(String a[])

  {

    Hashtable ob=new Hashtable();

    ob.put(50, "e");

    ob.put(10, "a");

    ob.put(20,"b");

    ob.put(30, "c");

    ob.put(40,"d");

    //ob.put(544,null);

    /*Enumeration e=ob.keys();

    while(e.hasMoreElements())

    {

      Object key=e.nextElement();

 System.out.println(key+" "+ob.get(key));

    }*/

    Enumeration e1=ob.elements();

    while(e1.hasMoreElements())

    {

      System.out.println(e1.nextElement());

    }

 /* Set se=ob.entrySet();

    Iterator it=se.iterator();

    while(it.hasNext())

    {

      System.out.println(it.next());

    }

    ob.clear();

    Set se1=ob.keySet();

    Iterator it1=se1.iterator();

    while(it1.hasNext())

    {

      Object key=it1.next();

      System.out.println(key+" keyset method "+ob.get(key));

    }

    */

  }

}









