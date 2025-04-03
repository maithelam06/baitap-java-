package GK;

public interface GK {

    double recharge(double amount);

    double transfer(double amount,User id);

    double withdraw(double amount);

    double checkBalance();
}
