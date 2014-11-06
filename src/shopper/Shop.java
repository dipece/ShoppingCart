//Qazi Ahmed
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package shopper;
import java.util.ArrayList;
import java.util.Scanner;
 
public class Shop
{
    public static void main (String[] args)
    {
      ArrayList<Item> cart = new ArrayList<Item>();
        //ShoppingCart n = new ShoppingCart();
      Item item;
      String itemName;
      double itemPrice;
      int quantity;
      double totalPrice=0;
 
      Scanner scan = new Scanner(System.in);
 
      String keepShopping = "y";
 
      do
          {
            System.out.print ("Enter the name of the item: ");
            itemName = scan.next();
 
            System.out.print ("Enter the unit price: ");
            itemPrice = scan.nextDouble();
 
            System.out.print ("Enter the quantity: ");
            quantity = scan.nextInt();
 
            // *** create a new item and add it to the cart
            item = new Item(itemName,itemPrice,quantity);
            cart.add(item);
            System.out.println(cart.toString());
 
            // *** print the contents of the cart object using println
 
 
            System.out.print ("Continue shopping (y/n)? ");
            keepShopping = scan.next();
          }
      while (keepShopping.equals("y"));
       //System.out.println("Please pay $"+n.getTotalPrice());
      
      for(Item s:cart)
      {
          System.out.println(s.toString());
          totalPrice+=(s.getPrice()*s.getQuantity());
      }
System.out.println(totalPrice);
 
    }
}