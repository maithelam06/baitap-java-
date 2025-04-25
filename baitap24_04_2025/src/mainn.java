import java.util.*;
import java.util.stream.Collectors;

public class mainn {
    public static void main(String[] args) {
        List<studen1> list1 = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số lượng học sinh:");
        int n = sc.nextInt();
        sc.nextLine(); // clear dòng thừa sau nextInt()

        while (n > 0) {
            studen1 s1 = new studen1();
            System.out.println("Tên học sinh: ");
            String name = sc.nextLine();
            s1.setName(name);

            System.out.println("Nhập điểm học sinh: ");
            int score = sc.nextInt();
            s1.setScore(score);
            sc.nextLine(); // clear dòng thừa sau nextInt()

            list1.add(s1);
            n--;
        }

        // Điểm cao nhất
        list1.stream()
                .max(Comparator.comparingInt(studen1::getScore))
                .ifPresent(s -> System.out.println("Điểm cao nhất: " + s.getName() + ", " + s.getScore()));

        // Điểm trung bình
        double dtb = list1.stream()
                .mapToInt(studen1::getScore)
                .average()
                .orElse(0);
        System.out.println("Điểm trung bình: " + dtb);

        // Phân loại Pass / Fail
        Map<String, List<studen1>> ketqua = list1.stream()
                .collect(Collectors.groupingBy(s -> s.getScore() >= 50 ? "Pass" : "Fail"));

        System.out.println("Danh sách phân loại:");
        ketqua.forEach((k, v) -> {
            System.out.println(k + ":");
            v.forEach(s -> System.out.println(" - " + s.getName() + " (" + s.getScore() + ")"));
        });
    }
}
