import java.util.Scanner;
public class studentmarks{
public static void main(String[] args){

int n;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number of students");
n=sc.nextInt();

int[] arr= new int[n];
for(int i=0;  i<n; i++){

System.out.println("Enter the marks of "+i+"students");
int marks =sc.nextInt();
arr[i] = marks;
}
System.out.println("***STUDENT MARKS***");
for(int i=0; i<n; i++){
 System.out.println("MARKS OF STUDENT"+i+arr[i]);

}
}
}




