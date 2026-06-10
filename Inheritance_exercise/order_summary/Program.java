public class Program {
        public static void main(String[] args) {
            products.Book book1 = new products.Book("Dune", 2017, "United States", 56.30, 680, "Frank Herbert", 1);
            products.Book book2 = new products.Book("One of Us Is Lying", 2018, "United States", 34.93, 384,
                    "Karen McManus", 1);
            products.Book book3 = new products.Book("War And Peace", 1869, "United States", 31.70, 272,
                    "Leo Tolstoy", 1);

            products.Dvd dvd1 = new products.Dvd("Underworld - Blood Wars", 2016, "United States", 16.90,
                    "Anna Foerster",
                    "Action", 91);
            products.Dvd dvd2 = new products.Dvd("Annabelle - Creation", 2017, "United States", 39.90,
                    "Jame Wan and Peter Safran",
                    "Horror",
                    109);

                // Order 1
                ItemOrder[] itemsOrder1 = new ItemOrder[] {
                                new ItemOrder(book1, 1),
                                new ItemOrder(dvd2, 1)
                };

                Order order1 = new Order(0, itemsOrder1);

                order1.presentOrderSummary();

                // Order 2
                ItemOrder[] itemsOrder2 = new ItemOrder[] {
                                new ItemOrder(book1, 1),
                                new ItemOrder(dvd2, 1)
                };

                Order order2 = new Order(10, itemsOrder2);

                order2.presentOrderSummary();

                // Order 3
                ItemOrder[] itemsOrder3 = new ItemOrder[] {
                                new ItemOrder(book2, 1),
                                new ItemOrder(book3, 2),
                                new ItemOrder(dvd1, 1)
                };

                Order order3 = new Order(5, itemsOrder3);

                order3.presentOrderSummary();

                // Order 4
                ItemOrder[] itemsOrder4 = new ItemOrder[] {
                                new ItemOrder(book2, 1),
                                new ItemOrder(book2, 1),
                                new ItemOrder(book3, 2),
                                new ItemOrder(dvd1, 1),
                                new ItemOrder(dvd2, 2)
                };

                Order order4 = new Order(5, itemsOrder4);

                order4.presentOrderSummary();
        }
    }