package baitap;

public class Account5 {
    private int id;
    private Customer5 customer;
    private double balance=0.0;
    public Account5 (int id, Customer5 customer, double balance) {
        this.id = id;
        this.customer = customer;
        this.balance = balance;
    }
    public Account5(int id,Customer5 customer){
        this.id=id;
        this.customer=customer;
    }
     int getId(){
        return id;
     }
     Customer5 customer(){
        return customer;
     }
     double getBalance(){
        return balance;
     }
     void setBalance(double balance){
        this.balance=balance;
     }
     public String toString(){
        return customer.toString()+String.format("balance=$%.2f",balance);
     }
     String getCustomerName(){
        return customer.getName();
     }
     Account5 deposit(double amount){
        this.balance+=amount;
        return this;
     }
     Account5 withdraw(double amount){
        if(balance>=amount){
            balance-=amount;
        }
        else {
            System.out.println("amount withdrawn exceeds the current balance!");
        }
        return this;
     }
}
