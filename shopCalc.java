import java.util.Scanner;

public class shopCalc {
    public static final double TAX_RATE = 0.12;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // HEADER
        System.out.println("  ----- SHOPPING CALCULATOR -----");

        // INPUT SECTION
        System.out.print("Enter customer name: ");
        String customer_name = input.nextLine();

        System.out.print("Enter product name: ");
        String product_name = input.nextLine();

        System.out.print("Enter product price: PHP");
        double price = input.nextDouble();

        System.out.print("Enter quantity: ");
        int quantity = input.nextInt();

        System.out.print("Enter discount (%): ");
        double discount = input.nextDouble();

        // CALCULATIONS
        double subtotal = price * quantity;
        double discount_amount = subtotal * discount / 100;
        double after_discount = subtotal - discount_amount;
        double tax = after_discount * TAX_RATE;
        double final_total = after_discount + tax;

        // RECEIPT SECTION
        System.out.println();
        System.out.println("        ----- RECEIPT -----");
        System.out.println("Customer: " + customer_name);
        System.out.println("Product: " + product_name);
        System.out.println("Price: PHP" + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Subtotal: PHP" + subtotal);
        System.out.println("Discount: PHP" + discount_amount);
        System.out.println("Tax: PHP" + tax);
        System.out.println("-------------------------------------");
        System.out.println("Final Amount: PHP" + final_total);



    }
}