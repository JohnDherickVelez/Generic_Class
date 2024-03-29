import java.util.Scanner;
import Arithmetic.*;
import Map.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Arithmetic Example
        System.out.println("*** Arithmetic Operations ***");
        System.out.print("Enter the first number (any numeric type): ");
        Number num1 = getNumberFromUser(scanner);

        System.out.print("Enter the second number (any numeric type): ");
        Number num2 = getNumberFromUser(scanner);

        Arithmetic<Number, Number> calculator = new Arithmetic<>(num1, num2);

        System.out.println("Addition: " + calculator.add());
        System.out.println("Subtraction: " + calculator.subtract());
        System.out.println("Multiplication: " + calculator.multiply());
        System.out.println("Division: " + calculator.divide());
        System.out.println("Minimum: " + calculator.getMin());
        System.out.println("Maximum: " + calculator.getMax());

        // MyMap Example
        System.out.println("\n*** MyMap Operations ***");
        MyMap<String, Integer> myMap = new MyMap<>();

        System.out.print("Enter a key (String): ");
        String key = scanner.nextLine();

        System.out.print("Enter a value (Integer): ");
        int value = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        myMap.put(key, value);
        System.out.println("Value for the given key: " + myMap.get(key));

        System.out.print("Enter a key to remove: ");
        String keyToRemove = scanner.nextLine();
        System.out.println("Removed value: " + myMap.remove(keyToRemove));

        scanner.close();
    }

    private static Number getNumberFromUser(Scanner scanner) {
        while (true) {
            try {
                String input = scanner.nextLine();
                if (input.contains(".")) {
                    return Double.parseDouble(input);
                } else {
                    return Integer.parseInt(input);
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number.");
            }
        }
    }
}
