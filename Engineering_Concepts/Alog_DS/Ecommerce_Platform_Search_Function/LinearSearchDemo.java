package Engineering_Concepts.Alog_DS.Ecommerce_Platform_Search_Function;

public class LinearSearchDemo {

    static int linearSearch(Product arr[],
                            String key) {

        for (int i = 0; i < arr.length; i++) {

            if (arr[i].productName
                    .equalsIgnoreCase(key)) {

                return i;
            }
        }

        return -1;
    }

    public static void main(String args[]) {

        Product products[] = {

                new Product(101,
                        "Laptop",
                        "Electronics"),

                new Product(102,
                        "Mouse",
                        "Electronics"),

                new Product(103,
                        "Shoes",
                        "Fashion")
        };

        int index =
                linearSearch(products, "Mouse");

        if (index != -1) {

            System.out.println("Product Found:");

            products[index].display();
        }
        else {

            System.out.println(
                    "Product Not Found");
        }
    }
}