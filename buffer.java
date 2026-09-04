class buffer{
public static void main(String args[]){
StringBuffer sb1=new StringBuffer();
System.out.println("sb1 (default capacity): "+ sb1.capacity());
StringBuffer sb2=new StringBuffer("NihaReddy");
System.out.println("sb2(with string):" +sb2);
StringBuffer sb3 = new StringBuffer(20);
System.out.println("sb3(with capacity 20): "+sb3.capacity());
}
}