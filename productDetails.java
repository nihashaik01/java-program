import java.util.Scanner;
public class productDetails {
String productId;
String product;
double price;
productDetails() {
productId = "P100";
product = "Laptop";
price = 50000;
}
public productDetails(String id, String name, double p) {
productId = id;
product = name;
price = p;
}
void display() {
System.out.println("Product Id : " + productId);
System.out.println("Product : " + product);
System.out.println("Price : " + price);
}
public static void main(String args[]) {
Scanner sc = new Scanner(System.in);
System.out.println("***PRODUCT DETAILS***");
System.out.println("\nUsing Default constructor");
productDetails p1 = new productDetails();
p1.display();
System.out.println("\nUsing Parameterized constructor");
System.out.print("Enter product id: ");
String id = sc.nextLine();
System.out.print("enter product name: ");
String name = sc.nextLine();
System.out.print("enter price: ");
double price = sc.nextDouble();
productDetails p2 = new productDetails(id, name, price);
p2.display();
sc.close();
}
}