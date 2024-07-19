import java.util.Scanner;

public class ExceptionHandlingDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Divide by zero");
            System.out.println("2. Array index out of bounds");
            System.out.println("3. Null pointer exception");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    handleDivideByZero();
                    break;
                case 2:
                    handleArrayIndexOutOfBounds();
                    break;
                case 3:
                    handleNullPointerException();
                    break;
                case 4:
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 4.");
            }
        } while (choice != 4);
        
        scanner.close();
    }

    private static void handleDivideByZero() {
        try {
            int no;
            System.out.print("Enter number : ");
            Scanner sc = new Scanner(System.in);
            no = sc.nextInt();
            int result =no / 0; // Attempting to divide by zero
        } catch (ArithmeticException e) {
            System.out.println("You shouldn’t divide a number by zero.");
        }
    }

    private static void handleArrayIndexOutOfBounds() {
        try {
            int[] array = {1, 2, 3, 4, 5, 6};
            int value = array[7]; // Accessing index which does not exist
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("OOPs!!! Array Index 7 out of bounds for length 6.");
        }
    }

    private static void handleNullPointerException() {
        try {
            String str = null;
            int length = str.length(); // Attempting to find the length of a null string
        } catch (NullPointerException e) {
            System.out.println("Null Pointer Exception arises!!");
        }
    }
}
