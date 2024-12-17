import java.util.InputMismatchException;
import java.util.Scanner;
public class MultipleExceptions{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter an integer: ");
            int input = sc.nextInt();
            int result = 100/input;
            System.out.println("Result: " + result);
        }catch(ArithmeticException e){
            System.out.println("Error: Division by zero is not allowed.");
            }catch(InputMismatchException e){
                System.out.println("Erro: Please enter a valid integer");
            }catch(Exception e){
                System.out.println("An unexpected error occurred" + e.getMessage());
            }finally{
                sc.close():
                System.out.println("Program exception completed.");
            }

        }

    }
