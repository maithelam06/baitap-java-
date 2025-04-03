package baitap;

public class MainAuthorandBook {
    public static void main(String[] args) {
        Author[] authors = new Author[2];
        authors[0] = new Author("Tan Ah Teck", "AhTeck@somewhere.com", 'm');
        authors[1] = new Author("Paul Tan", "Paul@nowhere.com", 'm');


// Declare and allocate a Book instance
        AuthorandBook a1 = new AuthorandBook("Java for Dummy",authors,19.99, 99);
        System.out.println(a1.getAuthorNames());
    }
}
