import java.util.*;



public class SetDemo {

  public static void main(String a[])

  {

   //Set ob=new HashSet();

  // Set ob=new LinkedHashSet();

   Set ob=new TreeSet();

    ob.add(89);

    //ob.add("Vijay");

    boolean v=ob.add(55);

    ob.add(22);

    boolean x= ob.add(89);

    System.out.println(v+" "+ob.size()+ " "+x);

    Iterator it=ob.iterator();

    while(it.hasNext())

    {

     Object e=it.next();

     System.out.println(e);

    }

  /*	Employee ob1=new Employee(10,"vijay", 55500);

   Employee ob2=new Employee(10,"vijay", 55500);

   Employee ob3=new Employee(10,"vijay", 55500);

     Set <Employee>ob=new HashSet<>();

     ob.add(ob1);

     boolean v=ob.add(ob2);

     ob.add(ob3);

     System.out.println(v+" "+ob.size());

     Iterator<Employee> it=ob.iterator();

     while(it.hasNext())

     {

     Employee e=it.next();

       System.out.println(e.getEno()+" "+e.getName()+" "+e.getSal());

     }

     */

    }

}



