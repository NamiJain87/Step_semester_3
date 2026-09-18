package main.java.oop.assignment_problems;

public class Company {

    String empName;
    double salary;

    static String companyName = "Bright Horizon Technologies";
    static int employeeCount = 0;

    Company(String empName, double salary) {
        this.empName = empName;
        this.salary = salary;
        employeeCount++;
    }

    static void printCompanyInfo() {
        System.out.println(companyName);
        System.out.println("Employees on record: " + employeeCount);
    }

    public static void main(String[] args) {

        Company emp1 = new Company("Arun", 50000);
        Company emp2 = new Company("Priya", 60000);
        Company emp3 = new Company("Rahul", 55000);

        System.out.println("3 Employee objects created");

        Company.printCompanyInfo();
    }
}