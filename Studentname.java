import java.util.Scanner;
public class Studentname{
public static void main(String[]args){
Scanner sc= new Scanner(System.in);
String StudentName;
String RollNumber;
String Department;
int Semester;
float CGPA;
//Input
System.out.print("Enter Student Name:");
String studentName =sc.nextLine();

System.out.print("Enter Roll Number:");
String rollNumber =sc.nextLine();

System.out.print("Enter Department:");
String department =sc.nextLine();

System.out.print("Enter Semester:");
int semester = sc.nextInt();

System.out.print("Enter CGPA:");
CGPA = sc.nextFloat();

sc.close();
}
}

