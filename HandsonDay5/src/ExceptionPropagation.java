public class ExceptionPropagation {



 void m()

 {

 int c=5/0;

 }

 void n()

 {

 m();

 }

 void p()

 {

 try {

 n();

 }catch (Exception e) {

  e.printStackTrace();

 }

 }

 public static void main(String[] args) {

 ExceptionPropagation ob=new ExceptionPropagation();

 ob.p();

 System.out.println("end of the program");

 }

}



