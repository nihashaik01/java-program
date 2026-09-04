class duparray{
void find_dup_loop(int arr[]){
int n;
n=arr.length;
for (int i=0; i<n-1; i++){
for (int j=i+1; j<n; j++){
if (arr[i]==arr[j]){
System.out.println("dup: "+arr[i]);
}
}
}
}
void find_dup_set(int arr[]) {
HashSet<Integer> s=new HashSet<>();
for(int x: arr)
{
if(s.add(x)==false){
System.out.println("dup"+x);
}
}
}
public static void main(String args[]){
System.out.println("Enter num of elemnts:");
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int arr[]=new int[n];
System.out.println("enter data");
for(int i=0; i<n; i++)
{
arr[i]=sc.nextInt();
}
dupArray obj=new dupArray();
obj.find_dup_loop(arr);
System.out.println("Using Hashset");
obj.find_dup_set(arr);
}
}