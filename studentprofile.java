class studentprofile{
static String university = "ABC engineering university";

String rollno = "23ECE101";
String studentname = "anjali";
public static void main(String[]args){
String department = "CSE";
System.out.println("*** STUDENT PROFILE***");
System.out.println("UNIVERSITY: "+university);

studentprofile obj=new studentprofile();
System.out.println("ROLLNO: "+obj.rollno);
System.out.println("STUDENT NAME: "+obj.studentname);
System.out.println("DEPARTMENT: "+department);
}
}
