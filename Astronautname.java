import java.util.Scanner;
public class Astronautname{
public static void main(String[]args){
Scanner sc= new Scanner(System.in);
String astronautName;
int Age;
String Country;
int Missionnumber;
//Input
System.out.print("Enter Astronaut name:");
astronautName = sc.nextLine();

System.out.print("Enter Age:");
Age = sc.nextInt();

System.out.print("Enter Country:");
Country = sc.nextLine();

System.out.print("Enter Mission number:");
Missionnumber = sc.nextInt();

sc.close();
}
}