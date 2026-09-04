import java.util.Scanner;
public class waterelse{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);

int TankCapacity;

System.out.print("Enter Tank Capacity: ");
TankCapacity =sc.nextInt();

int CurrentCap=0;


while(TankCapacity>CurrentCap){
System.out.println("Enter Water adding:");
int wateradded= sc.nextInt();
CurrentCap += wateradded;
}
if (CurrentCap>TankCapacity){
System.out.println("Extra Water added");
}
else{
System.out.println("TANK FILLED SUCCESSFULLY");
}
}
}
