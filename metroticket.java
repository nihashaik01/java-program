import java.util.Scanner;
class metroticket{
public static void main(String[]args){
Scanner sc= new Scanner(System.in);
int zone;

System.out.print("ENTER ZONE NO:");
zone=sc.nextInt();

System.out.println("***METRO TICKET***");

switch(zone) {
case 1:
System.out.println("DESTINATION: CENTRAL PARK ");
System.out.println("TICKET FARE:RS. 20");break;

case 2:
System.out.println("DESTINATION: CITY MALL ");
System.out.println("TICKET FARE: RS.35");break;
 
case 3:
System.out.println("DESTINATION:AIRPORT ");
System.out.println("TICKET FARE: RS.60");break;


case 4:
System.out.println("DESTINATION: UNIVERSITY ");
System.out.println("TICKET FARE: RS.35"); break;

case 5:
System.out.println("DESTINATION: IT PARK ");
System.out.println("TICKET FARE: RS.50"); break;

default: 
System.out.println("OTHER DESTINATION");
}
}
}







