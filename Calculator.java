class calculator{
public int add(int a,int b){
return a+b;}

public static void main(String[]args){
calculator calc=new calculator();
int result=calc.add(5,10);
	System.out.println("sum:" +result);
}
}
