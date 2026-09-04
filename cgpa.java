import java.util.Scanner;
class cgpa{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
float cgpa;
System.out.print("enter CGPA");
cgpa= sc.nextFloat();

System.out.println("===RECRUITMENT REPORT===");

if (cgpa>=9.0){
System.out.println("PERFORMANCE CATRGORY: EXCELLENT");
}

else if(cgpa>=8.0){
System.out.println("PERFORMANCE CATRGORY: VERY GOOD");
}

else if(cgpa>=7.0){
System.out.println("PERFORMANCE CATRGORY: GOOD");
}

else if(cgpa>=6.0){
System.out.println("PERFORMANCE CATRGORY:NEED IMPROVEMENT");
}
}
}
