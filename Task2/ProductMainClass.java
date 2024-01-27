package Task2;

public class ProductMainClass {

    public static void main(String[] args) {

        Product[] products = new Product[5];
        for (int i = 0; i < 5; i++) {
            // For simplicity, you can take user input for pid, price, and quantity
            // Here, we are just using example values
            int pid = i + 1;
            double price = 10.0 * (i + 1);
            int quantity = 5+ i;
            products[i] = new Product(pid, price, quantity);
        }

        // b. Find Pid of the product with the highest price
        int highestPricePid = findHighestPricePid(products);
        System.out.println("Product with the highest price has PID: " + highestPricePid);

        // c. Calculate and return the total amount spent on all products
        double totalAmountSpent = calculateTotalAmountSpent(products);
        System.out.println("Total amount spent on all products: $" + totalAmountSpent);
    }

    // Helper method to find Pid of the product with the highest price
    private static int findHighestPricePid(Product[] products) {
        int highestPricePid = -1;
        double highestPrice = Double.MIN_VALUE;

        for (Product product : products) {
            if (product.getPrice() > highestPrice) {
                highestPrice = product.getPrice();
                highestPricePid = product.getPid();
            }
        }

        return highestPricePid;
    }

    // Helper method to calculate and return the total amount spent on all products
    private static double calculateTotalAmountSpent(Product[] products) {
        double totalAmountSpent = 0.0;

        for (Product product : products) {
            totalAmountSpent += product.getPrice() * product.getQuantity();
        }

        return totalAmountSpent;
    }

}
