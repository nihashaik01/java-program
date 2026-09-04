import java.util.Scanner;
class result{
public static void main(String[] args){
Scanner sc= new Scanner(System.in);

int tm;
int pm;

System.out.println("enter THEORY MARKS");
tm=sc.nextInt();

System.out.println("enter PRACTICAL MARKS");
pm=sc.nextInt();

System.out.println("TOTAL MARKS:" +(tm+pm));

System.out.println("***RESULT***");
if (tm>=35){
 System.out.println("THEORY: PASS");
}
 
if (pm>=35){
System.out.println("PRACTICAL: PASS");
}

if (tm+pm>=150){
System.out.println("DISTINCTION");
}
}
}
