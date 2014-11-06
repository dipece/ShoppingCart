/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package shopper;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;

public class Shopper {
    public static void main(String[] args) {
        ShoppingCart shoppingCart = new ShoppingCart();


        Item item;
        String itemName;
        double itemPrice;
        int quantity;

        Scanner scan = new Scanner(System.in);

        String keepShopping;

        do {
            System.out.print("Enter the name of the item: ");
            itemName = scan.next();

            System.out.print("Enter the unit price: ");
            itemPrice = scan.nextDouble();

            System.out.print("Enter the quantity: ");
            quantity = scan.nextInt();
            item = new Item(itemName, itemPrice, quantity);
            // *** create a new item and add it to the cart
            shoppingCart.addToCart(item);


            // *** print the contents of the cart object using println


            System.out.print("Continue shopping (y/n)? ");
            keepShopping = scan.next();
        }
        while (keepShopping.equals("y"));
        System.out.println("Please pay $" + shoppingCart.getTotalPrice());
    }

}
