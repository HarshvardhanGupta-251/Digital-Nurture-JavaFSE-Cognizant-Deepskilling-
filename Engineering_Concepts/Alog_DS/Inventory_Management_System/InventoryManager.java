package Engineering_Concepts.Alog_DS.Inventory_Management_System;

import java.util.HashMap;

public class InventoryManager {

    HashMap<Integer, Product> inventory =
            new HashMap<>();

    // Add Product
    public void addProduct(Product p) {
        inventory.put(p.productId, p);
        System.out.println("Product Added");
    }

    public void updateProduct(int id, int quantity) {

        if (inventory.containsKey(id)) {

            inventory.get(id).quantity = quantity;

            System.out.println("Updated Successfully");
        }
        else {
            System.out.println("Product Not Found");
        }
    }


    public void deleteProduct(int id) {

        if (inventory.containsKey(id)) {

            inventory.remove(id);

            System.out.println("Product Deleted");
        }
        else {
            System.out.println("Product Not Found");
        }
    }

  
    public void displayProducts() {

        for (Product p : inventory.values()) {
            p.display();
        }
    }

    public static void main(String[] args) {

        InventoryManager obj =
                new InventoryManager();

        obj.addProduct(
            new Product(101,
                        "Laptop",
                        10,
                        50000)
        );

        obj.addProduct(
            new Product(102,
                        "Mouse",
                        50,
                        500)
        );

        obj.displayProducts();

        obj.updateProduct(101, 15);

        obj.deleteProduct(102);

        obj.displayProducts();
    }
}
