import java.util.Scanner;
class library{
public static void main(String[] args){
Scanner sc= newScanner(System.in);

int number;
System.out.println("enter delayed days:");
number =sc.nextInt();
if (number >0){

System.out.println("BOOK RERETURNED AFTER DUE DATE");
}
else{
System.out.println("NO FINE");
}
}
}
