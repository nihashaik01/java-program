class RailwayTicketSystem1 {
public static void main(String[] args) {
StringBuffer sb =new StringBuffer("Passenger: Priya\n");
System.out.println("***Railway Ticket***");
sb.append("Coach:B1");
System.out.println("Original Ticket" +sb);

int n = sb.indexOf("B1"); 
sb.replace(n,n+2,"A1");

System.out.println("Updated Ticket" +sb);
}
}