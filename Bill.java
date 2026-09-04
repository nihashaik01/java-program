import java.util.Scanner;
class Bill{
public static void main(String[] args){
Scanner sc= new Scanner(System.in);
String pname=sc.nextLine();
System.out.println("quantity: ");
int quantity=sc.nextInt();
System.out.println("price per item: ");
double price=sc.nextDouble();
System.out.println("***Billing***");
System.out.println("product name: "+pname);
System.out.println("quantity: "+quantity);
System.out.println("price per item: "+price);
System.out.println("total: "+quantity*price);
}
}