package core;

/*final class A {
	final void disp() {
		System.out.println("Display Method");
	}
}*/

public class FDemo{

 final double pi;
 
 FDemo()
 {
	 pi = 3.145;
 }

 void disp()

 {

 //pi=3.22;

 System.out.println(pi);

 }

 public static void main(String[] args) {

 FDemo ob=new FDemo();

 ob.disp();

 }

}