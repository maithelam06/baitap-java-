package baitap;

public class Customer {

    private int id;

    private String name;

    private int discount;

    public Customer(int id,String name,int discount){
        this.id=id;
        this.name=name;
        this.discount=discount;
    }
    int getId(){
        return id;
    }
    String getName(){
        return name;
    }
    int getDiscount(){
        return discount;
    }
    void setDiscount(int discount){
        this.discount=discount;
    }
    public String toString(){
        return name+"("+id+")("+discount+"%)";
    }
}
