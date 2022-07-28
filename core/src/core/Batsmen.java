package core;

class Batsmen

{

 int bid;

 int pscore;

 static	int tscore;

 static

 {

 tscore=0;

 System.out.println("hello");

 }

 void getRuns(int id ,int r)

 {

  bid=id;

 pscore=r;

 tscore=tscore+pscore;

 System.out.println("pscore is "+pscore);

 }

 static	void scoreBoard()

 {

 System.out.println(" team score is "+tscore);

 }//score Board

 public static void main(String[] args)

 {

 System.out.println("this is main");

 Batsmen sachin=new Batsmen();

 sachin.getRuns(10,89);

 scoreBoard();

 Batsmen gangu=new Batsmen();

 gangu.getRuns(2,4);

 Batsmen.scoreBoard();

 }

}
