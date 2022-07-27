 class Exh2Demo

{

 public static void main(String[] args)

 {

 int a,b;

 a=10;

 try

 {

 System.out.println("in the try block");

 System.out.println("before parseInt");

 b=Integer.parseInt(args[0]);

 System.out.println("after parseInt");

  int c;

  c=a/b;

System.out.println("c value is "+c);

System.out.println("end of try");

 }

 catch(ArithmeticException ae)

 {

 System.out.println("arithmetic error -catch block");

 }

 catch(ArrayIndexOutOfBoundsException aioe)

 {

  System.out.println(aioe.toString());

 }

 catch(Exception e)

 {

  e.printStackTrace();

 }

 finally

 {

  System.out.println(" finally block");

 }

 System.out.println("end of the prg");

 }

}

