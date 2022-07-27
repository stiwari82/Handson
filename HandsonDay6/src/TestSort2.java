import java.util.*;

class TestSort2{

public static void main(String args[]){

ArrayList<String> al=new ArrayList<>();

    al.add("Viru");

    al.add("Saurav");

    al.add("Mukesh");

    al.add("Tahir");

    Collections.sort(al,Collections.reverseOrder());

   // Collections.sort(al);

    Iterator i=al.iterator();

    while(i.hasNext())

    {

      System.out.println(i.next());

    }

}

}  







