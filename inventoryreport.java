import java.util.Scanner;

public class inventoryreport{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
System.out.println("enter the no.of items: ");

int n =sc.nextInt();
int[] arr= new int[n];
int total=0;
for(int i=0; i<n; i++){
System.out.println("Enter the quantity if item "+ i + "=");
int Quantity =sc.nextInt(); 
arr [i] = Quantity;
total += arr[i];
}
System.out.println("report");
for(int i=0; i<n; i++){
System.out.println("Item"+ i+ "Quantity is: " + arr[i]);
}
System.out.println("total Items: " + total);
}
}
