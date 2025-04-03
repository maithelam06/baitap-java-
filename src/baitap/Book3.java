package baitap;

public class Book3 {

    private String isbn,name;

    private Author3 author;

    private double price;

    private int qty=0;

    public Book3(String isbn, String name, Author3 author, double price) {
        this.isbn = isbn;
        this.name = name;
        this.author = author;
        this.price = price;
    }
    public Book3(String isbn, String name, Author3 author, double price, int qty) {
        this.isbn = isbn;
        this.name = name;
        this.author = author;
        this.price = price;
        this.qty = qty;
    }
    String getIsbn(){
        return isbn;
    }
    String getName(){
        return name;
    }
    Author3 getAuthor3(){
        return author;
    }
    double getPrice(){
        return price;
    }
    void setPrice(double price){
        this.price=price;
    }
    int getQty(){
        return qty;
    }
    void setQty(int qty){
        this.qty=qty;
    }
    String getAuthorName(){
        return author.getName();
    }
    public String toString(){
        return "Book[isbn="+isbn+",name="+name+",Author"+author+",price="+price+",qty="+qty+"]";
    }
}

