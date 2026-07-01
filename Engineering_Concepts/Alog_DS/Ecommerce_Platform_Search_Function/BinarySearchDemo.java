package Engineering_Concepts.Alog_DS.Ecommerce_Platform_Search_Function;

public class BinarySearchDemo {

    static int binarySearch(Product arr[],
                            String key) {

        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {

            int mid = (low + high) / 2;

            int result =
                    arr[mid].productName
                            .compareToIgnoreCase(key);

            if (result == 0) {

                return mid;
            }
            else if (result < 0) {

                low = mid + 1;
            }
            else {

                high = mid - 1;
            }
        }

        return -1;
    }

    public static void main(String args[]) {

        Product products[] = {

                new Product(103,
                        "Laptop",
                        "Electronics"),

                new Product(102,
                        "Mouse",
                        "Electronics"),

                new Product(101,
                        "Shoes",
                        "Fashion")
        };

        int index =
                binarySearch(products, "Mouse");

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