import java.util.Scanner;
public class productDetails{
String proudctId;
String product;
Double price;
productDetails(){
productId = "P100";
product = "Laptop";
price += 50000;
public void productDetails(String id, String name, double p) {
}
proudctId = id;
product = name;
price = p;
}
void display(){
System.out.println("Product Id : " + Product Id);
System.out.println("Product : " + Product);
System.out.println("Price : " + Price);
}
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("***PRODUCT DETAILS***");
System.out.println("\nUsing Default constructor");
productDetails p1= new productDetails();
p1.display();
System.out.println("\nUsing Parameterized constructor");
System.out.print("Enter product id: ");
String id=sc.nextLine();
System.out.print("enter product name: ");
String name= sc.nextLine();
System.out.print("enter print: ");
String name= sc.nextDouble();
productDetails p2= new productDetails(id, name,price);
p2.display();
}
}

