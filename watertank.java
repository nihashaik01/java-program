import java.util.Scanner;
public class watertank{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);

System.out.print("Enter Tank Capacity: ");
double tankCapacity=sc.nextDouble();
double totalWaterStored=0;

while(totalWaterStored< tankCapacity){
System.out.print("Water Added: ");
double waterAdded = sc.nextDouble();

totalWaterStored += waterAdded;
}

System.out.println("***TANK STATUS***");
System.out.println("Tank Capacity : "+ (int)tankCapacity + "Litres");
System.out.println("Water Stored : "+ (int)totalWaterStored + "Litres");
System.out.println("Tank Filled Successfully");

sc.close();
}
}

