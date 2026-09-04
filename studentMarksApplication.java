import java.util.Scanner;

class studentMarksApplication{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);

System.out.println("Enter the number of student:");
int rows=sc.nextInt();

System.out.println("Enter the number of subject:");
int cols=sc.nextInt();

int[][] table=new int[rows][cols];
for(int i=0; i< rows; i++){
for(int j=0; j<cols; j++){
System.out.println("Enter Student" + i + "marks of subject" + j );
int marks = sc.nextInt();
table[i][j]= marks;
}
}
System.out.println("+++ABC College Report+++");
for(int i=0; i < rows; i++){
for(int j=0; j < cols; j++){
System.out.println("Student" + i + "marks : "+ table[i][j]);
}
System.out.println();
}
}
}

