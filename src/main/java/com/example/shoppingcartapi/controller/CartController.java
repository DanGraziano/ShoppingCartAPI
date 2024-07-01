package com.example.shoppingcartapi.controller;

import com.example.shoppingcartapi.model.Item;
import com.example.shoppingcartapi.service.CartService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * REST controller for interacting with shopping cart view.
 */
@RestController
@RequestMapping("/api/cart/items")
public class CartController {

  @Autowired
  private CartService cartService;

  /**
   * Adds an item to the shopping cart.
   *
   * @param item the item to be added
   * @return a response entity with a status message saying what was added to the cart
   */
  @PostMapping
  public ResponseEntity<String> addItem(@RequestBody Item item) {
    cartService.addItem(item);
    return new ResponseEntity<>(item.getName() + " added to the cart", HttpStatus.CREATED); // status code 201

  }

  /**
   * Gets all items in the shopping cart.
   *
   * @return a response entity containing the list of items
   */
  @GetMapping
  public ResponseEntity<List<Item>> getItems() {
    List<Item> items = cartService.getItems();
    return new ResponseEntity<>(items, HttpStatus.OK); // Status code 200
  }

  /**
   * Updates the quantity of an item in the shopping cart.
   *
   * @param name the name of the item to be updated
   * @param quantity the new quantity of the item
   * @return a response entity with a status message saying what was updated
   */
  @PatchMapping("/{name}")
  public ResponseEntity<String> updateItemQuantity(@PathVariable String name, @RequestParam int quantity) {
    cartService.updateItemQuantity(name, quantity);
    return new ResponseEntity<>(name + " quantity updated to " + quantity, HttpStatus.OK);
  }

  /**
   * Deletes an item from the shopping cart.
   *
   * @param name the name of the item to be removed
   * @return a response entity with a status message saying what has been removed from the cart
   */
  @DeleteMapping("/{name}")
  public ResponseEntity<String> removeItem(@PathVariable String name) {
    cartService.removeItem(name);
    return new ResponseEntity<>(name + " removed from the cart", HttpStatus.OK);
  }
}