
import java.io.FileOutputStream;

public class FileOutputStreamExample {

  public static void main(String args[]){

      try{

       FileOutputStream fout=new FileOutputStream("D:\\testout.txt");
       String s ="Hello how are you";
       byte b[] = s.getBytes();
       fout.write(b);

       fout.close();

       System.out.println("success...");

      }catch(Exception e){System.out.println(e);}

   }

}



