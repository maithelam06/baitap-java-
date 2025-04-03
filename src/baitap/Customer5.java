package baitap;

public class Customer5 {
    private int id;
    private String name;
    private char gender;            //'m' or 'f'
    public Customer5(int id,String name,char gender){
        this.id=id;
        this.name=name;
        this.gender=gender;
    }
    int getId(){
        return id;
    }
    String getName(){
        return name;
    }
    char getGender(){
        return gender;
    }
    public String toString(){
        return "name("+ id+")";
    }
}
