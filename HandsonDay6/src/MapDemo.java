import java.util.*;

import java.util.Map.Entry;

public class MapDemo {

  public static void main(String a[])

  {

   //Main use of Generics is Type safety

   // It uses Generic concept it will accept only String

  //if use list without <String> it will accept any Object of any type   

  // Map ob=new HashMap();//Here key and value can be any Object

  	Map <Integer,String> ob=new TreeMap<>(); //It will accept integer as key and String as value

  // Map ob=new LinkedHashMap();// based on Insertion order of key value

    //Map ob=new TreeMap(); //sorted order based on keys

    

   

    ob.put(80,"vijay"); // key should not be duplicate value & value can be duplicate

       // key and value can be null

    ob.put(20,"chandra");

    ob.put(30,"sekhar");

    ob.put(5,"vijay");

    //ob.put(10,"hfdkjf");

    ob.put(10, "Hello");

     

   Set<Map.Entry<Integer,String>> map= ob.entrySet();//Entry is the inner interface inside Map just like inner class

           

    for(Map.Entry<Integer, String> it: map)

    {

    System.out.println(it.getKey()+" "+it.getValue());

    }

    

  

  

 /* Set s=ob.entrySet(); // get key and values 

  Iterator it=s.iterator();

  while(it.hasNext()) { 

   System.out.println(it.next()); }

    
*/
     

  

 /* Set <Integer> s1= ob.keySet(); // only keys 

  Iterator <Integer>it1=s1.iterator(); 

  while(it1.hasNext()) { 

   int o= it1.next();

  //Integer o= it1.next();

   

  System.out.println(o+" "+ob.get(o)); }  

  */

    

  }

}