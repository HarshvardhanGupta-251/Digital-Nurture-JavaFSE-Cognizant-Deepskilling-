package Engineering_Concepts.Alog_DS.Ecommerce_Platform_Search_Function;

class Product {

    int productId;
    String productName;
    String category;

    Product(int productId, String productName, String category) {
        this.productId = productId;
        this.productName = productName;
        this.category = category;
    }

    void display() {
        System.out.println(productId + " "
                + productName + " "
                + category);
    }
}