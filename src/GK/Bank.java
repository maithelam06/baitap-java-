package GK;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Bank {

    private int id;

    private String nameBank;

    private List<User> users;


    public Bank(int id, String nameBank) {
        this.id = id;
        this.nameBank = nameBank;
        users = new ArrayList<User>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameBank() {
        return nameBank;
    }

    public void setNameBank(String nameBank) {
        this.nameBank = nameBank;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public void addUser(User user) {
        users.add(user);
    }

    public void printBank(){
        System.out.println("Bank ID: " + id);
        System.out.println("Bank Name: " + nameBank);
    }

    public void listUser(){
        System.out.println("Danh sach nguoi dung theo ngan hang: ");
        for(User user : users){
            System.out.println(user);
        }
    }
    public double totalAmount(){
        double total=0;
        for(User user : users){
            total=total+user.getBalance();
        }
        return total;
    }

    //sap xep nguoi dung trong ngan hang theo so du
    public void sapxep(){
        Collections.sort(users,new Comparator<User>(){
            @Override
            public int compare(User o1, User o2) {
                return Double.compare(o2.getBalance(), o1.getBalance());
            }
        });
        for(User user : users){
            System.out.println(user);
        }
    }

    @Override
    public String toString() {
        return "Bank{" +
                "id=" + id +
                ", nameBank='" + nameBank + '\'' +
                ", users=" + users.toString() +
                '}';
    }
}
