import java.util.Scanner;
class checkpassfail{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);

int marks = sc.nextInt();

System.out.println("The mark is" + marks);

System.out.println("***RESULT***");

if (marks>=50){
 System.out.println("PASS");
}
else{
System.out.println("FAIL");
}
System.out.println("DONE");

}
}