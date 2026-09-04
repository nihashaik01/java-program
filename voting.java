import java.util.Scanner;
class voting{
public static void main (String args[]){
Scanner sc = new Scanner(System.in);
int age;
System.out.print("enter age: ");
age=sc.nextInt();
String result=(age>=18)?  "ELIGIBLE TO VOTE" : "NOT ELIGIBLE TO VOTE";
System.out.println(result); 
}
}