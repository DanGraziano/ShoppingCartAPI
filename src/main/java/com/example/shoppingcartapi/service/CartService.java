package com.example.shoppingcartapi.service;

import com.example.shoppingcartapi.model.Item;
import java.util.ArrayList;
import java.util.List;

public class CartService {
  private final List<Item> cartItems = new ArrayList<>();


  /**
   * Adds an item to the shopping cart.
   *
   * @param item the item to be added
   */
  public void addItem(Item item) {
    cartItems.add(item);
  }

  /**
   * Creates an item and adds it to the shopping cart.
   *
   * @param name the name of the item
   * @param price the price of the item
   * @param quantity the quantity of the item
   */
  public void addItem(String name, double price, int quantity) {
    Item item = new Item(name, price, quantity);
    cartItems.add(item);
  }

  /**
   * Gets all items in the shopping cart.
   *
   * @return a list of items in the shopping cart
   */
  public List<Item> getItems() {
    return new ArrayList<>(cartItems);
  }

  /**
   * Updates the quantity of an item in the shopping cart.
   *
   * @param name the name of the item to be updated
   * @param quantity the new quantity of the item
   */
  public void updateItemQuantity(String name, int quantity) {
    for (Item item : cartItems) {
      if (item.getName().equals(name)) {
        item.setQuantity(quantity);
        return;
      }
    }
  }

  /**
   * Removes an item from the shopping cart.
   *
   * @param name the name of the item to be removed
   */
  public void removeItem(String name) {
    cartItems.removeIf(item -> item.getName().equals(name));
  }

}


