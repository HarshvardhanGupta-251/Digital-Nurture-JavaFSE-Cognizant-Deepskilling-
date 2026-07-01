package Engineering_Concepts.Alog_DS.Inventory_Management_System;


    class Product {
    int productId;
    String productName;
    int quantity;
    double price;

    Product(int productId, String productName,
            int quantity, double price) {

        this.productId = productId;
        this.productName = productName;
        this.quantity = quantity;
        this.price = price;
    }

    public void display() {
        System.out.println(
            productId + " " +
            productName + " " +
            quantity + " " +
            price
        );
    }
}
    

