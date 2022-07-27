import java.io.FileInputStream;



public class FIStreamDemo {

 public static void main(String[] args) throws Exception{

 FileInputStream fis=new FileInputStream("d:\\testout.txt");

 int i=0;

 while((i=fis.read())!=-1)

 {

 System.out.print((char)i);}

 }

}













