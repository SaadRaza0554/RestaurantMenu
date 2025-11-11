import java.util.Scanner;

public class RestaurantMenu {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to Mr Café!");
        System.out.println("Menu:");
        System.out.println("1. Burger");
        System.out.println("2. Pizza");
        System.out.println("3. Pasta");
        System.out.println("4. Sandwich");

        String i;

        do {
            System.out.print("Enter your choice (1-4): ");
            int choice = input.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("You ordered a Burger. Price: Rs. 350");
                    break;
                case 2:
                    System.out.println("You ordered a Pizza. Price: Rs. 700");
                    break;
                case 3:
                    System.out.println("You ordered Pasta. Price: Rs. 450");
                    break;
                case 4:
                    System.out.println("You ordered a Sandwich. Price: Rs. 300");
                    break;
                default:
                    System.out.println("Invalid choice! Please select a valid menu number.");
            }

            System.out.print("Do you want to add more? (Y/N): ");
            input.nextLine(); // consume leftover newline
            i = input.nextLine();

        } while (i.equalsIgnoreCase("y"));

        System.out.println("Thank you for visiting Mr Café!");
        input.close();
    }
}
