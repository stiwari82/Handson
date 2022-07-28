package core;
class A

{

  void x()

 {

 System.out.println("x of A class");

 }

}

class B extends A

{

  void x()

 {

 System.out.println("x of B class");

 }

 void y()

 {

 System.out.println("y of B class");

 }

}

class C extends A

{

 void x()

 {

 System.out.println("x of c class");

 }

 void z()

 {

 System.out.println("z of c class");

 }

}

public class BaseRefTest

{

 public static void main(String args[])

 {

 A a=new A();

 a.x();

 a=new B();

 a.x();

 //a.y();

 a=new C();

 a.x();

   }

}

