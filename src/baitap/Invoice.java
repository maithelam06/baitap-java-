package baitap;

public class Invoice {
    private int id;
    private Customer customer;
    private double amount;
    public Invoice(int id, Customer customer, double amount) {
        this.id=id;
        this.customer=customer;
        this.amount=amount;
    }
    int getId(){
        return id;
    }
    Customer getCustomer(){
        return customer;
    }
    void setCustomer(Customer customer){
        this.customer=customer;
    }
    double getAmount(){
        return amount;
    }
    void setAmount(double amount){
        this.amount=amount;
    }
    int getCustomerId(){
        return customer.getId();
    }
    String getCustomerName(){
        return customer.getName();
    }
    int getCustomerDiscount(){
        return customer.getDiscount();
    }
    double getAmountAfterDiscount(){
        return amount-(amount*customer.getDiscount()/100);
    }
    public String toString(){
        return "Invoice[id="+id+",customer="+customer+",amount="+amount+"]";
    }

}
