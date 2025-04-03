package GK;

public class Test {

    public static void main(String[] args) {
        Bank bank=new Bank(1001,"Agribank");
        User user1= new User(1001,"Nguyen Huynh Hai",2006,"20001625577","400234347",100000,"Phu Loc, Thua Thien Hue");
        bank.addUser(user1);
        User user2= new User(1205,"Nguyen Huynh Quyen",2007,"2045601625577","400234324",10000,"Phu Loc, Thua Thien Hue");
        bank.addUser(user2);
        System.out.println(bank);
        bank.listUser();
        bank.printBank();
        System.out.println(bank.totalAmount());
        System.out.println(user1.recharge(10000.0));
        System.out.println(user1.transfer(100,user2));
        System.out.println(user1.withdraw(10000000));
        System.out.println(user1.withdraw(100));
        System.out.println(user1.transfer(1000,user2));
        bank.sapxep();
    }
}
