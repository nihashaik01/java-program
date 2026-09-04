class RailwayTicketSystem {
public static void main(String[] args) {
System.out.println("Original Ticket");
System.out.println(ticket);
System.out.println(); 
String newCoach = "B2";
int startIndex = ticket.indexOf(oldCoach);

ticket.replace(startIndex, startIndex + oldCoach.length(), newCoach);
}
System.out.println("Updated Ticket");
System.out.println(ticket);
}
}