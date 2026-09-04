import java.util.Scanner;
class leapyear{
public static void main (String args[]){
Scanner sc = new Scanner(System.in);
int year;
System.out.print("enter year: ");
year=sc.nextInt();
String result=(year%4==0)?  "LEAP YEAR" : "NOT LEAP YEAR";
System.out.println(result); 
}
}