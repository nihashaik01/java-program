public class squarecalculator{
public static int findsquare(int number){
return number* number;
}
public static void main(String[]args){
int input=8;

int result=findSquare(input);
System.out.println("The square of " +input+ "is: "+result);
}
}