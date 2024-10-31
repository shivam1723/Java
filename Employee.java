import java.time.LocalDate;

class Details {
    String name;
    int salary;
    int hiringYr;

    Details(String name, int salary, int hiringYr) {
        this.name = name;
        this.salary = salary;
        this.hiringYr = hiringYr;
    }

    void yearOfService() {
        LocalDate today = LocalDate.now();
        int currentYear = today.getYear();  // Get the current year
        int yearsOfService = currentYear - this.hiringYr;  // Calculate years of service
        System.out.println("Your years of Service: " + yearsOfService);  // Print years of service
    }
}

public class Employee {
    public static void main(String[] args) {
        Details emp = new Details("Shivam", 2000, 2004);
        emp.yearOfService();
    }
}
