 class Exh3Demo

{

 public static void main(String[] args)

 {

 int a=10, b;

 try

 {

 System.out.println("int the outer try block");

 b=Integer.parseInt(args[0]);

  int c=0;

  try

  {

  System.out.println("in the inner try");

   c=a/b;

   String s=args[1];

  }

  catch(ArithmeticException ae)

  {

  System.out.println(ae.toString());

  }

 System.out.println("c value is "+c);

 System.out.println("end of outer try");

 }

 catch(ArrayIndexOutOfBoundsException aioe)

 {

  System.out.println(aioe.toString());

 }

 catch(Exception e)

 {

  System.out.println(e.toString());

 }

 finally

 {

  System.out.println(" finally block");

 }

 System.out.println("end of the prg");

 }

}

