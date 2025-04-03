package GK;


public class User implements GK{

    private int id;

    private String name;

    private int years;

    private String idBank;

    private String  recipientAccount;

    private double balance;

    private String address;

    private boolean isLoyalCustomer;

    public User(int id, String name, int years, String idBank, String recipientAccount, double balance, String address) {
        this.id = id;
        this.name = name;
        this.years = years;
        this.idBank = idBank;
        this.recipientAccount = recipientAccount;
        this.balance = balance;
        this.address = address;
        this.isLoyalCustomer = balance>10000000;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYears() {
        return years;
    }

    public void setYears(int years) {
        this.years = years;
    }

    public String getIdBank() {
        return idBank;
    }

    public void setIdBank(String idBank) {
        this.idBank = idBank;
    }

    public String getRecipientAccount() {
        return recipientAccount;
    }

    public void setRecipientAccount(String recipientAccount) {
        this.recipientAccount = recipientAccount;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
        this.isLoyalCustomer = balance>10000000;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public boolean isLoyalCustomer() {
        return isLoyalCustomer;
    }


@Override
    public double recharge(double amount){
        this.balance+=amount;
        if(!isLoyalCustomer()){
            this.balance-=2000;
        }
        return balance;
    }


@Override
    public double transfer(double amount,User id){
        if(amount<=10000){
            System.out.println("Phai chuyen tren 10000");
        }
        else{
            if(amount<balance){
                this.balance-=amount;
                id.setBalance(id.getBalance()+amount);
            }
            else{
                System.out.println("Ban ngheo, khong du tien de chuyen");
            }
        }
    return balance;
    }


@Override
    public double withdraw(double amount){
        if(amount<=50000){
            System.out.println("Phai rut tren 50000");
        }
        else{
            if(amount<balance){
                this.balance-=amount;
            }
            else{
                System.out.println("Ban ngheo, khong du tien de rut");
            }
        }
    return balance;
    }


@Override
    public double checkBalance(){
        return balance;
    }



    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", years=" + years +
                ", recipientAccount=" + recipientAccount +
                ", balance=" + balance +
                ", address='" + address + '\'' +
                '}';
    }
}
