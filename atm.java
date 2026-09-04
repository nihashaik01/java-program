import java.util.Scanner;
class atm{
public static void main(String[] args){
int rpin=1515;
int upin;
Scanner sc=new Scanner(System.in);

System.out.println("enter upin");
upin=sc.nextInt();

System.out.println("==ATM==");
if (upin== rpin){

System.out.println("ACCESS GRANTED");
}
else{
 System.out.println("WRONG PIN");
sc.close();
}
}
}
