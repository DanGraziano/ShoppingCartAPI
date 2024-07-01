package com.example.shoppingcartapi.service;

import static org.junit.jupiter.api.Assertions.*;
import com.example.shoppingcartapi.model.Item;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CartServiceTest {
  private CartService cartService;

  @BeforeEach
  public void setup() {
    cartService = new CartService();
  }

  @Test
  public void testAddItem() {
    Item item = new Item("Test Item", 2.99, 1);
    cartService.addItem(item);

    List<Item> items = cartService.getItems();
    assertTrue(items.contains(item));
  }

  @Test
  public void testGetItems() {
    Item item1 = new Item("Test Item 1", 2.99, 1);
    Item item2 = new Item("Test Item 2", 4.99, 2);
    cartService.addItem(item1);
    cartService.addItem(item2);

    List<Item> items = cartService.getItems();

    assertEquals(2, items.size());
    assertTrue(items.contains(item1));
    assertTrue(items.contains(item2));
  }

  @Test
  public void testUpdateItemQuantity() {
    Item item = new Item("Test Item", 2.99, 1);
    cartService.addItem(item);

    cartService.updateItemQuantity(item.getName(), 5);

    List<Item> items = cartService.getItems();
    Item updatedItem = null;
    for (Item currentItem : items) {
      if (currentItem.getName().equals(item.getName())) {
        updatedItem = currentItem;
        break;
      }
    }
    assertNotNull(updatedItem);
    assertEquals(5, updatedItem.getQuantity());
  }

  @Test
  public void testRemoveItem() {
    Item item = new Item("Test Item", 2.99, 1);
    cartService.addItem(item);

    cartService.removeItem(item.getName());

    List<Item> items = cartService.getItems();
    assertFalse(items.contains(item));
  }
}