import java.util.Arrays;

class arraytoprint{

public static void main(String[] args){
int[] arr1 = new int[] {1, 2, 3, 4};
System.out.println(Arrays.toString(arr1));

int[][] arr2 = new int[][] {{10, 20, 30}, {40,50,60}, {70,80,90}};

System.out.println(Arrays.deepToString(arr2));
System.out.println(Arrays.toString(arr2));
}
}