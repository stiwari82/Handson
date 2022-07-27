import java.io.*;

class Persist{

 public static void main(String args[]){

 try{

 //Creating the object

 Student s1 =new Student(211,"pankaj");

 //Creating stream and writing the object

 FileOutputStream fout=new FileOutputStream("a.txt");

 ObjectOutputStream out=new ObjectOutputStream(fout);

 out.writeObject(s1);

 out.flush();

 //closing the stream

 out.close();

 FileInputStream fis=new FileInputStream("a.txt");

 ObjectInputStream ois=new ObjectInputStream(fis);

 Student s=(Student)ois.readObject();

 System.out.println(s.id+" "+s.name);

 System.out.println("success");

 }catch(Exception e){System.out.println(e);}

 }

}





