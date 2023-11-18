package domain;

public class Employee {
    public String name;
    private double gross_salary;
    public Employee(String name, double gross_salary) {
        this.name = name;
        this.gross_salary = gross_salary;
    }
    public void IncreaseSalary(double percentage) {
        this.gross_salary += (percentage / 100) * this.gross_salary;
    }
    public double getTotal() {
        double tax = 1000;
        return this.gross_salary - tax;
    }

 public void printInfo() {
        System.out.printf("Name: %s, Salary: %s%n", this.name, this.getTotal());
 }
}
