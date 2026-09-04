import java.util.Scanner;
public class monthfinder{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
System.out.println("ENTER A NUMBER(1-12):");
int num=sc.nextInt();
String month;
switch(num){
case 1 : month= "january"; break;
case 2 : month= "februray"; break;
case 3 : month= "march"; break;
case 4 : month= "april"; break;
case 5 : month= "may"; break;
case 6 : month= "June"; break;
case 7 : month= "July"; break;
case 8 : month= "august"; break;
case 9 : month= "September"; break;
case 10 : month= "october"; break;
case 11 : month= "november"; break;
case 12 : month= "december"; break;


default: month= "invalid input";

System.out.println("month: "+month);
}
}
}

