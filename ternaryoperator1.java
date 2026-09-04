import java.util.Scanner;
public class ternaryoperator1{
public static void main (String args[]){
Scanner sc= new Scanner(System.in);
int a;
System.out.print("enter the number: ");
a=sc.nextInt();
String result= (a>0)? "POSITIVE" : "NEGATIVE";
System.out.println("the number is : "+ result");
}
}
