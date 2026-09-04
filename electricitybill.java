import java.util.Scanner;
public class electricitybill{
public static void main(String[]args){
Scanner sc= new Scanner(System.in);
String consumername;
int previousreading;
int currentreading;
float costperunit;

System.out.print("enter consumer name:");
consumername =sc.nextLine();

System.out.print("enter previous reading:");
previousreading =sc.nextInt();

System.out.print("enter current reading:");
currentreading =sc.nextInt();

System.out.print("enter cost per unit:");
costperunit =sc.nextFloat();

System.out.println("***ELECTRICITY BILL***");
System.out.println("consumername: "+consumername);
System.out.println("units used: "+(currentreading-previousreading));
System.out.println("cost per unit: "+costperunit);
System.out.println("total bill:"+((currentreading-previousreading)*costperunit));
sc.close();
}
}

