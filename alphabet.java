import java.util.Scanner;
public class alphabet{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
String alpha;

System.out.println("***Enter alphabet*** : ") ;
alpha=sc.nextLine();
switch(alpha){

case "A" :
System.out.println("VOWEL") ; break;

case "E" :
System.out.println("VOWEL") ; break;

case "I" :
System.out.println("VOWEL") ; break;

case "O" :
System.out.println("VOWEL") ; break;

case "U" :
System.out.println("VOWEL") ; break;

default:
System.out.println("CONSONANT"); break;
}
}
}







