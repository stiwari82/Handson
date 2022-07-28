package core;
abstract class T

{

 abstract void disp();

 void m1()

 {

System.out.println("m1 method");

 }

}

public class Q extends T

{

 void disp()

 {

 System.out.println("disp method");

 }

 public static void main(String[] args)

 {

 Q ob=new Q();

 ob.disp();

 ob.m1();

 }

}



