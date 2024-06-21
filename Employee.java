package day2;

import java.util.Scanner;

class Employee {
    private int id;
    private String name;
    private String gender;
    private int age;
    private double salary;
    private String designation;
    private String insuranceScheme;

    public Employee(int id, String name, String gender, int age, double salary, String designation) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.salary = salary;
        this.designation = designation;
        this.insuranceScheme = determineInsuranceScheme();
    }

    private String determineInsuranceScheme() {
        if (salary > 5000 && salary < 20000 && designation.equals("System Associate")) {
            return "Scheme C";
        } else if (salary >= 20000 && salary < 40000 && designation.equals("Programmer")) {
            return "Scheme B";
        } else if (salary >= 40000 && designation.equals("Manager")) {
            return "Scheme A";
        } else if (salary < 5000 && designation.equals("Clerk")) {
            return "No Scheme";
        } else {
            return "No Scheme";
        }
    }

    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", gender=" + gender + ", age=" + age 
               + ", salary=" + salary + ", designation=" + designation + ", insuranceScheme=" + insuranceScheme + "]";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter 5-digit Id: ");
        int id = scanner.nextInt();
        if (String.valueOf(id).length() != 5) {
            System.out.println("Invalid Id. Program exiting.");
            System.exit(1);
        }
        scanner.nextLine();  // Consume newline

        System.out.print("Enter Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Gender (Male/Female): ");
        String gender = scanner.nextLine();
        if (!gender.equalsIgnoreCase("Male") && !gender.equalsIgnoreCase("Female")) {
            System.out.println("Invalid Gender. Program exiting.");
            System.exit(1);
        }

        System.out.print("Enter Age (less than 60): ");
        int age = scanner.nextInt();
        if (age >= 60) {
            System.out.println("Invalid Age. Program exiting.");
            System.exit(1);
        }

        System.out.print("Enter Salary (not greater than 40000): ");
        double salary = scanner.nextDouble();
        if (salary > 40000) {
            System.out.println("Invalid Salary. Program exiting.");
            System.exit(1);
        }
        scanner.nextLine();  // Consume newline

        System.out.print("Enter Designation (System Associate/Programmer/Manager/Clerk): ");
        String designation = scanner.nextLine();
        if (!isValidDesignation(designation, salary)) {
            System.out.println("Invalid Designation for the given salary. Program exiting.");
            System.exit(1);
        }

        Employee employee = new Employee(id, name, gender, age, salary, designation);

        System.out.println(employee);

        scanner.close();
    }

    private static boolean isValidDesignation(String designation, double salary) {
        switch (designation) {
            case "System Associate":
                return salary > 5000 && salary < 20000;
            case "Programmer":
                return salary >= 20000 && salary < 40000;
            case "Manager":
                return salary >= 40000;
            case "Clerk":
                return salary < 5000;
            default:
                return false;
        }
    }
}


 