import java.util.Scanner;

public class TrianglePattern {
    public static void main(String[] args) {
        // Tạo đối tượng Scanner để nhập dữ liệu từ người dùng
        try(Scanner scanner = new Scanner(System.in)){

        // Yêu cầu người dùng nhập chiều cao của tam giác
        System.out.print("Nhập chiều cao của tam giác: ");
        int n = scanner.nextInt();

        // Vòng lặp để in các dòng của tam giác
        for (int i = 1; i <= n; i++) {
            // Sử dụng System.out.print nhiều lần thay vì tạo chuỗi tạm thời
            System.out.print(" ".repeat(n - i));  // In khoảng trắng
            System.out.println("*".repeat(2 * i - 1));  // In sao và xuống dòng
        }

        // Đóng đối tượng Scanner
        //scanner.close();
    }
}
}
