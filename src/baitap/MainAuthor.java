package baitap;

public class MainAuthor {
    public static void main(String[] args) {
        Author a1=new Author("Nguyễn Huỳnh Hải","nguyenhuynhhai969@gmail.com",'m');
        System.out.println(a1);
        System.out.println("name is: "+a1.getName());
        System.out.println("email is: "+a1.getEmail());
        System.out.println("gender is: "+a1.getGender());
        a1.setEmail("nguyenhuynhhai91@gmail.com");
        System.out.println(a1);
    }
}
