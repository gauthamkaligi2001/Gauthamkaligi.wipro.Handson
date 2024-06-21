package day2;

import java.util.Scanner;

class Person {
    private String firstName;
    private String lastName;
    private String gender;
    private int age;
    private double weight;

    public Person(String firstName, String lastName, String gender, int age, double weight) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.age = age;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Person Details:\n" +
               "____________\n" +
               "First Name: " + firstName + "\n" +
               "Last Name: " + lastName + "\n" +
               "Gender: " + gender + "\n" +
               "Age: " + age + "\n" +
               "Weight: " + weight;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter First Name: ");
        String firstName = scanner.nextLine();

        System.out.print("Enter Last Name: ");
        String lastName = scanner.nextLine();

        System.out.print("Enter Gender (M/F): ");
        String gender = scanner.nextLine();
        if (!gender.equalsIgnoreCase("M") && !gender.equalsIgnoreCase("F")) {
            System.out.println("Invalid Gender. Program exiting.");
            System.exit(1);
        }

        System.out.print("Enter Age: ");
        int age = scanner.nextInt();
        if (age < 0) {
            System.out.println("Invalid Age. Program exiting.");
            System.exit(1);
        }

        System.out.print("Enter Weight: ");
        double weight = scanner.nextDouble();
        if (weight < 0) {
            System.out.println("Invalid Weight. Program exiting.");
            System.exit(1);
        }

        Person person = new Person(firstName, lastName, gender, age, weight);
        System.out.println(person);

        scanner.close();
    }
}
