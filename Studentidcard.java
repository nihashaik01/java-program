import java.util.Scanner;
class Studentidcard{
public static void main(String rags[]){
Scanner sc = new Scanner(System.in);
String firstname ;
String lastname ;
System.out.println("enter first name:");
firstname=sc.nextLine();
System.out.println("enter last name:");
lastname=sc.nextLine();
System.out.println("***STUDENT ID CARD***");
System.out.println("first name: "+firstname);
System.out.println("last name: "+lastname);
System.out.println("full name: "+(firstname +" "+lastname));
}
}