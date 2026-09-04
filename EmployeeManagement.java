public class EmployeeManagement {

    // Static variable (shared across all instances)
    static String companyName = "ABC Technologies";

    // Instance variables (unique to each instance)
    String employeeId;
    String employeeName;

    // Constructor to initialize instance variables
    public EmployeeManagement(String id, String name) {
        this.employeeId = id;
        this.employeeName = name;
    }

    // Method to display the employee details
    public void displayDetails() {
        // Local variable (declared inside a method)
        String departmentName = "Software Development";

        System.out.println("== EMPLOYEE DETAILS ==");
        System.out.println("Company Name : " + companyName);
        System.out.println("Employee ID : " + employeeId);
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Department : " + departmentName);
    }

    // Main method to run the application
    public static void main(String[] args) {
        // Creating an object of EmployeeManagement
        EmployeeManagement emp = new EmployeeManagement("E1025", "Priya Sharma");

        // Displaying the formatted report
        emp.displayDetails();
    }
}