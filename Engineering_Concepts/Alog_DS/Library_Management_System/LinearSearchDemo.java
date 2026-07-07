package Engineering_Concepts.Alog_DS.Library_Management_System;

public class LinearSearchDemo {

    static int linearSearch(Book books[],
                            String key) {

        for (int i = 0; i < books.length; i++) {

            if (books[i].title
                    .equalsIgnoreCase(key)) {

                return i;
            }
        }

        return -1;
    }

    public static void main(String args[]) {

        Book books[] = {

                new Book(
                        101,
                        "Java",
                        "James Gosling"),

                new Book(
                        102,
                        "Python",
                        "Guido van Rossum"),

                new Book(
                        103,
                        "DBMS",
                        "Korth")
        };

        int index =
                linearSearch(books, "Python");

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
