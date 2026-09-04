class bufferappend{
public static void main (String args[]){
StringBuffer sb=new StringBuffer();
System.out.println(sb.capacity());
sb.append("HelloNiha");
System.out.println(sb.capacity());
sb.append("java is my fav lang");
System.out.println(sb.capacity());
}
}