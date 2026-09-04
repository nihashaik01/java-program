import java.util.Scanner;
class Payloadreport{
public static void main(String[]arg){
Scanner sc= new Scanner(System.in);
Float instrument1;
Float instrument2;
Float instrument3;

System.out.print("enter instrument1:");
instrument1 =sc.nextFloat();
System.out.print("enter instrument2:");
instrument2 =sc.nextFloat();
System.out.print("enter instrument3:");
instrument3 =sc.nextFloat();

System.out.println("***PAYLOAD REPORT***");
System.out.println("instrument1:"+instrument1+"kg");
System.out.println("instrument2:"+instrument2+"kg");
System.out.println("instrument3:"+instrument3+"kg");
System.out.println("totalpayload:"+(instrument1+instrument2+instrument3)+"kg");
sc.close();
}
}