import java.util.Scanner;

public class EquationSolver {

    // Giải phương trình bậc nhất (linear equation) với một ẩn
    public static void solveFirstDegree(double a, double b) {
        if (a == 0) {
            if (b == 0) {
                System.out.println("Phuong trinh co vo so nghiem (moi x deu la nghiem).");
            } else {
                System.out.println("Phuong trinh vo nghiem.");
            }
        } else {
            double x = -b / a;
            System.out.println("Nghiem cua phuong trinh la: x = " + x);
        }
    }

    // Giải hệ phương trình bậc nhất với hai ẩn
    public static void solveLinearSystem(double a11, double a12, double b1, double a21, double a22, double b2) {
        double D = a11 * a22 - a21 * a12;
        double D1 = b1 * a22 - b2 * a12;
        double D2 = a11 * b2 - a21 * b1;
        
        if (D == 0) {
            if (D1 == 0 && D2 == 0) {
                System.out.println("He phuong trinh co vo so nghiem.");
            } else {
                System.out.println("He phuong trinh vo nghiem.");
            }
        } else {
            double x1 = D1 / D;
            double x2 = D2 / D;
            System.out.println("nghiem cua he phuong trinh la: x1 = " + x1 + ", x2 = " + x2);
        }
    }

    // Giải phương trình bậc hai với một ẩn
    public static void solveSecondDegree(double a, double b, double c) {
        if (a == 0) {
            System.out.println("Day khong phai phuong trinh bac 2, giai phuong trinh bac nhat:");
            solveFirstDegree(b, c);
            return;
        }
        
        double delta = b * b - 4 * a * c;
        if (delta > 0) {
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("Phuong trinh co hai nghiem phan biet: x1 = " + x1 + ", x2 = " + x2);
        } else if (delta == 0) {
            double x = -b / (2 * a);
            System.out.println("Phuong trinh co nghiem kep: x = " + x);
        } else {
            System.out.println("Phuong trinh vo nghiem (khong co nghiem thuc).");
        }
    }

    // Main program
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)){
        
        while (true) {
            System.out.println("\nChon phuong trinh de giai:");
            System.out.println("1. Phuong trinh bac nhat voi mot an (ax + b = 0)");
            System.out.println("2. He phuong trinh bac nhat voi hai an");
            System.out.println("3. Phuong trinh bac hai voi hai an (ax^2 + bx + c = 0)");
            System.out.println("4. Exit");
            
            int choice = scanner.nextInt();
            
            if (choice == 1) {
                // Phương trình bậc nhất
                System.out.print("Nhap a: ");
                double a = scanner.nextDouble();
                System.out.print("Nhap b: ");
                double b = scanner.nextDouble();
                solveFirstDegree(a, b);
                
            } else if (choice == 2) {
                // Hệ phương trình bậc nhất
                System.out.print("Nhap a11: ");
                double a11 = scanner.nextDouble();
                System.out.print("Nhap a12: ");
                double a12 = scanner.nextDouble();
                System.out.print("Nhap b1: ");
                double b1 = scanner.nextDouble();
                System.out.print("Nhap a21: ");
                double a21 = scanner.nextDouble();
                System.out.print("Nhap a22: ");
                double a22 = scanner.nextDouble();
                System.out.print("Nhap b2: ");
                double b2 = scanner.nextDouble();
                solveLinearSystem(a11, a12, b1, a21, a22, b2);
                
            } else if (choice == 3) {
                // Phương trình bậc hai
                System.out.print("Nhap a: ");
                double a = scanner.nextDouble();
                System.out.print("Nhap b: ");
                double b = scanner.nextDouble();
                System.out.print("Nhap c: ");
                double c = scanner.nextDouble();
                solveSecondDegree(a, b, c);
                
            } else if (choice == 4) {
                System.out.println("Exit.");
                break;
                
            } else {
                System.out.println("Lua chon khong phu hop, thu lai.");
            }
        }
        
        scanner.close();
    }
}
}
