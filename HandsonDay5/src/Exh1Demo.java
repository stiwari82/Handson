 class Exh1Demo

{

 public static void main(String[] args)

 {

 int a,b,c=0;

 a=10;

 b=Integer.parseInt(args[0]);

 try

 {

  System.out.println("in the try block");

  c=a/b;

 }

 catch(ArithmeticException ae)

 {

  System.out.println("arithmatic error -catch block");

 }

 System.out.println("c value is "+c);

 System.out.println("end of the prg");

 }

}