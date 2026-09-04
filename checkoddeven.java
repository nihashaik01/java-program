import java.util.Scanner;
class checkoddeven{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);

int number = sc.nextInt();

System.out.println("The number is" + number);


if (number/2==0){
 System.out.println("even");
}
else{
System.out.println("odd");
}
System.out.println("DONE");

}
}