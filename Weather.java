import java.util.Arrays;
import java.util.Scanner;
class Weather{
    public static void main(String rags[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of Data points");
        int n = sc.nextInt();
        int[] sa = new int[n];
        int[] sb = new int[n];
        for (int i = 0; i < n; i++){
            System.out.println("Enter station A Data points");
            sa[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++){
            System.out.println("Enter station B Data points");
            sb[i] = sc.nextInt();            
        }
        if(Arrays.equals(sa,sb)){
            System.out.println("Both Datasets are Same");   
        }
        else{
            System.out.println("Datasets are Distinct");    
        }
        int[] Arr = new int[n];
        Arrays.fill(Arr,25);
        System.out.println("Filled Array" + Arr);        
    } 
}