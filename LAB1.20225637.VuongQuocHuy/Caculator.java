import javax.swing.JOptionPane;

public class Caculator {
    public static void main(String[] args) {
        // Yêu cầu người dùng nhập số thứ nhất thông qua hộp thoại
        String strNum1 = JOptionPane.showInputDialog("Nhập số thứ nhất:");
        double num1 = Double.parseDouble(strNum1); // Chuyển chuỗi thành số thực

        // Yêu cầu người dùng nhập số thứ hai thông qua hộp thoại
        String strNum2 = JOptionPane.showInputDialog("Nhập số thứ hai:");
        double num2 = Double.parseDouble(strNum2); // Chuyển chuỗi thành số thực

        // Tính toán và hiển thị kết quả
        double tong = num1 + num2;
        double hieu = num1 - num2;
        double tich = num1 * num2;

        // Hiển thị kết quả tính toán
        JOptionPane.showMessageDialog(null, "Tổng: " + tong);
        JOptionPane.showMessageDialog(null, "Hiệu: " + hieu);
        JOptionPane.showMessageDialog(null, "Tích: " + tich);

        // Kiểm tra mẫu số trước khi tính thương
        if (num2 != 0) {
            double thuong = num1 / num2;
            JOptionPane.showMessageDialog(null, "Thương: " + thuong);
        } else {
            JOptionPane.showMessageDialog(null, "Lỗi: Không thể chia cho 0.");
        }
    }
}
