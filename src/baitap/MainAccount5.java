package baitap;

public class MainAccount5 {
    public static void main(String[] args) {
        Customer5 c1=new Customer5(22,"hhh",'m');
        Account5 a1=new Account5(256,c1,250);
        System.out.println(a1);
    }
}
