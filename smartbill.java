import java.util.Scanner;
class smartbill{
public static void main(String[]args){
Scanner sc= new Scanner(System.in);
 
String ProductName;
int Quantity;
int Price;

 System.out.print("Enter ProductName:");
 ProductName =sc.nextLine();
 
 System.out.print("Enter Quantity:");
 Quantity =sc.nextInt();

 System.out.print("Enter Price:");
 Price =sc.nextInt();

System.out.println("***SMART BILL***");
System.out.println("PRODUCT NAME :"+ ProductName);
System.out.println("QUANTITY: "+ Quantity);
System.out.println("PRICE: "+ Price);
System.out.println("TOTAL: "+(Quantity*Price));

 sc.close();
}
}