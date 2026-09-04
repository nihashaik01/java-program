class ArithmeticException{
static void method() throws ArithmeticException{
}
public void myMethod() {
return;
System.out.println("Inside the method()"); 
}
public void myMethod() {
throw new ArithmeticException("Throwing ArithmeticException");
System.out.println("Hello");
}
public static void main(String args[]){
try{
method();
}catch(ArithmeticException err){
System.out.println("Caught in main()method");
}
}
}