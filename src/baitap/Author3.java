package baitap;

public class Author3 {
    private String name;
    private String email;
    public Author3(String name,String email ){
        this.name=name;
        this.email=email;
    }
    String getName(){
        return name;
    }
    String getEmail(){
        return email;
    }
    void setEmail(String email){
        this.email=email;
    }
    public String toString(){
        return "Author[name="+name+",email="+email+"]";
    }
}
