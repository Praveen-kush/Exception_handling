import java.util.InputMismatchException;
import java.util.Scanner;

// Custom Exception Class
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

public class AgeValidation {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        try {
            System.out.print("Enter your age: ");
            int age = sc.nextInt();
            validateAge(age);
            System.out.println("Your age is valid: " + age);
        } catch (InvalidAgeException e) {
            System.out.println("Invalid Age: " + e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("Error: Please enter a valid integer for age.");
        } finally {
            sc.close();
            System.out.println("Program execution completed.");
        }
    }

    // Method to validate age
    public static void validateAge(int age) throws InvalidAgeException {
        if (age < 0 || age > 150) {
            throw new InvalidAgeException("Age must be between 0 and 150.");
        }
    }
}
