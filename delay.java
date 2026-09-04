import java.util.Scanner;
class delay{
public static void main(String[] args){
Scanner sc= new Scanner(System.in);

int number;
System.out.println("enter delayeddays:");
number =sc.nextInt();
if (number >0){
System.out.println("fine is to be paid");
System.out.println("the fine is:"+ number * 10);
}
else{
System.out.println("NO FINE");
}
}
}
