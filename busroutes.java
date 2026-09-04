import java.util.Scanner;
class busroutes.java{
public static void main(String args[]);
Scanner sc=new Scanner(System.in);

System.out.println("Enter number of routes : ");
int numRoutes = sc.nextInt();

int[][] busRoutes = new int[numRoutes][];

for(int i = 0; i < numRoutes; i++){
System.out.print("Route" + (i + 1) + " Stops: ");
int stops =sc.nextInt();
busRoutes[i]=new int[stops];

for(int j=0; j< stops; j++){
busRoutes[i][j] =sc.nextInt();
}
}
System.outprintln("=== BUS ROUTES ===");
for (int i=0; i< routes; i++){
System.out.print("Route" + (i+1) + " : ");
for (int j=0; j< busRoutes[i].length; j++){
System.out.print(busRoutes[i][j] + " ");
}
System.out.println();
}
}
}

