package baitap;

public class tets {
    public static void main(String[] args) {
        Author aa1 = new Author("hai", "haiiiii@sfd", 'm'); // Tạo một đối tượng Author
        Author[] authors = {aa1}; // Tạo mảng tác giả
        AuthorandBook a1 = new AuthorandBook("hai", authors, 23); // Tạo một đối tượng AuthorandBook
        System.out.println(a1.getAuthors()); // Lấy danh sách tác giả từ đối tượng a1
    }
}
