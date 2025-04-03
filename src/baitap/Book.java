package baitap;

public class Book {
    private String name;
    private Author author;
    private double price;
    private int qty=0;
    public Book(String name,Author author,double price){
        this.name=name;
        this.author=author;
        this.price=price;
    }
    public Book(String name,Author author,double price,int qty){
        this.name=name;
        this.author=author;
        this.price=price;
        this.qty=qty;
    }
    String getName(){
        return name;
    }
    Author getAuthor(){
        return author;
    }
    double getPrice(){
        return price;
    }
    int getQty(){
        return qty;
    }
    void setPrice(double price){
        this.price=price;
    }
    void setQty(int qty){
        this.qty=qty;
    }
    //@Override
    public String toString(){
        return "Book[name="+name+
                ",author=[name="+author.getName() +
                ",email="+ author.getEmail()+
                ",gender="+author.getGender()+
                "],price="+price+",qty="+qty+"]";
    }
}
