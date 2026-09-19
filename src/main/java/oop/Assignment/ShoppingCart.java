package main.java.oop.Assignment;

public class ShoppingCart {

    private final int cartId;
    private double[] prices;
    private int itemCount;

    public ShoppingCart(int cartId, int capacity) {
        this.cartId = cartId;
        prices = new double[capacity];
        itemCount = 0;
    }

    public void addItem(double price) {
        if (itemCount < prices.length) {
            prices[itemCount] = price;
            itemCount++;
        } else {
            System.out.println("Cart is full.");
        }
    }

    public double getTotal() {
        double total = 0;

        for (int i = 0; i < itemCount; i++) {
            total = total + prices[i];
        }

        return total;
    }

    public int getItemCount() {
        return itemCount;
    }

    public int getCartId() {
        return cartId;
    }

    public static void main(String[] args) {

        ShoppingCart cart = new ShoppingCart(101, 5);

        cart.addItem(100.50);
        cart.addItem(250.00);
        cart.addItem(49.50);

        System.out.println("Cart ID: " + cart.getCartId());
        System.out.println("Item Count: " + cart.getItemCount());
        System.out.println("Total: " + cart.getTotal());
    }
}