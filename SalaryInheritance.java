interface Gross {
    double calculateGross();
}

class Employee {
    int id;
    String name;

    Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    void displayEmployee() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
    }
}

class Salary extends Employee implements Gross {
    double basic, hra, da;

    Salary(int id, String name, double basic, double hra, double da) {
        super(id, name);
        this.basic = basic;
        this.hra = hra;
        this.da = da;
    }

    public double calculateGross() {
        return basic + hra + da;
    }

    void displaySalary() {
        displayEmployee();
        System.out.println("Basic: " + basic);
        System.out.println("HRA: " + hra);
        System.out.println("DA: " + da);
        System.out.println("Gross Salary: " + calculateGross());
    }
}

public class SalaryInheritance {
    public static void main(String[] args) {
        Salary s = new Salary(101, "Rahul", 30000, 5000, 2000);
        s.displaySalary();
    }
}