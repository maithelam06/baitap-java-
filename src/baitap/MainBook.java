package baitap;

public class MainBook {
    public static void main(String[] args) {
        Author a2 = new Author("Tan Ah Teck", "ahteck@nowhere.com", 'm');
        System.out.println(a2);  // Author's toString()

        Book b1 = new Book("Java for dummy", a2, 19.95, 99);  // Test Book's Constructor
        System.out.println(b1);  // Test Book's toString()

// Test Getters and Setters
        b1.setPrice(29.95);
        b1.setQty(28);
        System.out.println("name is: " + b1.getName());
        System.out.println("price is: " + b1.getPrice());
        System.out.println("qty is: " + b1.getQty());
        System.out.println("Author is: " + b1.getAuthor());  // Author's toString()
        System.out.println("Author's name is: " + b1.getAuthor().getName());
        System.out.println("Author's email is: " + b1.getAuthor().getEmail());

        // Use an anonymous instance of Author to construct a Book instance
        Book anotherBook = new Book("more Java",
                new Author("Paul Tan", "paul@somewhere.com", 'm'), 29.95);
        System.out.println(anotherBook);  // toString()
    }
}
