import products.Products;

public class ItemOrder {
  private Products product;
  private int quantity;

  public ItemOrder(Products product, int quantity) {
    this.product = product;
    this.quantity = quantity;
  }

  public Products getProduct() {
    return this.product;
  }

  public int getQuantity() {
    return this.quantity;
  }
}