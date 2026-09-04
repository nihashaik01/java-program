import java.util.Scanner;

public class grocerybillingsystem{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

 //Accepting product information from the user

System.out.print("Product Name : ");
String productName = sc.nextLine();

System.out.print("Quantity : ");
int quantity = sc.nextInt();

System.out.print("Price per Item : ");
double unitPrice = sc.nextDouble();

// Calculating total bill amount
double totalAmount = quantity * unitPrice;

// Displaying the formatted sample output 
System.out.println("\n--- CUSTOMER BILL ---");
System.out.println("Product Name : " + productName);
System.out.println("Quantity     : " + quantity);
System.out.printf("Unit Price    : %.2f\n", unitPrice);
System.out.printf("Total Amount  : %.2f\n", totalAmount);

sc.close();
 }
}


