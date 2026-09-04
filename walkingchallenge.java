import java.util.Scanner;

class walkingchallenge{
public static void main(String[]args){
Scanner sc= new Scanner(System.in);

System.out.println("Enter number of days:");
int days= sc.nextInt();

int totalSteps=0;

for (int i=1; i<= days; i++){
System.out.println("Day" + i + "Steps :");
int steps= sc.nextInt();
totalSteps += steps;
}

System.out.println("***FITNESS REPORT***");
System.out.println("Total Days : "+days);
System.out.println("Total Steps Walked: "+ totalSteps);

}
}

