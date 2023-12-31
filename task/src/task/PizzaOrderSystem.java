package task;
import java.util.Scanner;

public class PizzaOrderSystem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String continueOrder = null;
        double totalCost = 0;
        int totalPizzasOrdered = 0;
        boolean freeCokeOffer = false;

        do {
            System.out.println("Pizza Size Options:");
            System.out.println("1. Small - Rs.150");
            System.out.println("2. Medium - Rs.250");
            System.out.println("3. Large - Rs.500");
            System.out.println("4. Monster - Rs.700");

            System.out.print("Enter the size number of the pizza: ");
            int sizeOption = input.nextInt();

            double price;
            switch (sizeOption) {
                case 1:
                    price = 150;
                    break;
                case 2:
                    price = 250;
                    break;
                case 3:
                    price = 500;
                    break;
                case 4:
                    price = 700;
                    break;
                default:
                    price = 0;
                    System.out.println("Invalid size option. Please choose a valid option.");
                    continue;
            }

            System.out.print("Enter the quantity: ");
            int quantity = input.nextInt();

            totalPizzasOrdered += quantity;
            double offerPrice = quantity * price;

            if (totalPizzasOrdered >= 4 && !freeCokeOffer) {
                
                freeCokeOffer = true;
                System.out.println("Congratulations! You get a free 500ml coke with your order.");
            }

            totalCost += offerPrice;

            System.out.println("Your order: " + quantity + " " + getSizeName(sizeOption) + " pizza(s) = Rs." + offerPrice);
            System.out.println("Total Cost: Rs." + totalCost);

            System.out.print("Do you want to purchase more? (Y/N): ");
            continueOrder = input.next().toUpperCase();

        } while (continueOrder.equals("Y"));

        System.out.println("Thank you for your order. Your total bill is: Rs." + totalCost);
    }

    // Helper method to get the size name based on the size option
    public static String getSizeName(int sizeOption) {
        switch (sizeOption) {
            case 1:
                return "Small";
            case 2:
                return "Medium";
            case 3:
                return "Large";
            case 4:
                return "Monster";
            default:
                return "Unknown";
        }
    }
}
