package com.example.shoppingcartapi.model;

/**
 * Represents an item in the shopping cart.
 */
public class Item {
  private String name;
  private double price;
  private int quantity;

  /**
   * Creates an item object with no attributes.
   */
  public Item(){
  }

  /**
   * Creates an item object with a provided name, price, and quantity.
   *
   * @param name the name of the item
   * @param price the price of the item
   * @param quantity the quantity of the item
   */
  public Item(String name, double price, int quantity) {
    this.name = name;
    this.price = price;
    this.quantity = quantity;
  }

  /**
   * Gets the name of the item.
   *
   * @return the name of the item
   */
  public String getName() {
    return name;
  }

  /**
   * Sets the name of the item.
   *
   * @param name the new name of the item
   */
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Gets the price of the item.
   *
   * @return the price of the item
   */
  public double getPrice() {
    return price;
  }

  /**
   * Sets the price of the item.
   *
   * @param price the new price of the item
   */
  public void setPrice(double price) {
    this.price = price;
  }

  /**
   * Gets the quantity of the item.
   *
   * @return the quantity of the item
   */
  public int getQuantity() {
    return quantity;
  }

  /**
   * Sets the quantity of the item.
   *
   * @param quantity the new quantity of the item
   */
  public void setQuantity(int quantity) {
    this.quantity = quantity;
  }


}
