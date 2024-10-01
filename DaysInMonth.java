import java.util.Scanner;

public class DaysInMonth {
    // Phương thức kiểm tra xem năm có phải là năm nhuận hay không
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    // Phương thức lấy số ngày trong một tháng cụ thể theo năm
    public static int getDaysInMonth(String monthInput, int year) {
        int month = 0;
        String monthLower = monthInput.toLowerCase(); // Chuyển đổi thành chữ thường để so sánh

        switch (monthLower) {
            case "january":
            case "jan":
            case "1":
                month = 1;
                break;
            case "february":
            case "feb":
            case "2":
                month = 2;
                break;
            case "march":
            case "mar":
            case "3":
                month = 3;
                break;
            case "april":
            case "apr":
            case "4":
                month = 4;
                break;
            case "may":
            case "5":
                month = 5;
                break;
            case "june":
            case "jun":
            case "6":
                month = 6;
                break;
            case "july":
            case "jul":
            case "7":
                month = 7;
                break;
            case "august":
            case "aug":
            case "8":
                month = 8;
                break;
            case "september":
            case "sep":
            case "9":
                month = 9;
                break;
            case "october":
            case "oct":
            case "10":
                month = 10;
                break;
            case "november":
            case "nov":
            case "11":
                month = 11;
                break;
            case "december":
            case "dec":
            case "12":
                month = 12;
                break;
            default:
                return -1; // Nhập tháng không hợp lệ
        }

        // Trả về số ngày dựa trên tháng và năm
        switch (month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                return 31; // Tháng có 31 ngày
            case 4: case 6: case 9: case 11:
                return 30; // Tháng có 30 ngày
            case 2:
                return isLeapYear(year) ? 29 : 28; // Tháng Hai
            default:
                return -1; // Không nên đến đây
        }
    }

    // Phương thức chính
    public static void main(String[] args) {
       try( Scanner scanner = new Scanner(System.in)){
        int year = -1;
        String monthInput;

        // Vòng lặp nhập năm và tháng
        while (true) {
            System.out.print("Nhap mot nam (4chuso): ");
            String yearInput = scanner.nextLine();
            // Kiểm tra dữ liệu đầu vào của năm
            if (yearInput.matches("\\d{4}")) {
                year = Integer.parseInt(yearInput);
                if (year >= 0) {
                    break;
                }
            }
            System.out.println("Nam khong hop le, vui long nhap lai.");
        }

        while (true) {
            System.out.print("Nhap mot thang( ten day du, viet tat, so): ");
            monthInput = scanner.nextLine();

            int days = getDaysInMonth(monthInput, year);
            if (days != -1) {
                System.out.println("Thang " + monthInput + " trong nam " + year + " co " + days + " ngay.");
                break;
            } else {
                System.out.println("Thang khong hop le, vui long nhap lai.");
            }
        }

        scanner.close();
    }
}
}