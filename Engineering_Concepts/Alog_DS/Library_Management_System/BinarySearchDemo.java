package Engineering_Concepts.Alog_DS.Library_Management_System;

public class BinarySearchDemo {

    static int binarySearch(Book books[],
                            String key) {

        int low = 0;
        int high = books.length - 1;

        while (low <= high) {

            int mid = (low + high) / 2;

            int result =
                    books[mid].title
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

        Book books[] = {

                new Book(
                        103,
                        "DBMS",
                        "Korth"),

                new Book(
                        101,
                        "Java",
                        "James Gosling"),

                new Book(
                        102,
                        "Python",
                        "Guido van Rossum")
        };

        int index =
                binarySearch(books, "Java");

        if (index != -1) {

            System.out.println("Book Found:");

            books[index].display();
        }
        else {

            System.out.println(
                    "Book Not Found");
        }
    }
}