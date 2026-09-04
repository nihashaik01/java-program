class breakandcontinue{
public static void main (String args[]){
int n=5;
for(int i=1;i<=n;i++){
if(n*i>10){
System.out.println("Exiting loop"+(n*i));
break;

}//if()
System.out.println(i+"x"+n+" = "+(n*i));
}//for()

int i=0;
while(++i<10){
if(i%2==0){
}//else{
continue;

}
System.out.println(i);
}
}
