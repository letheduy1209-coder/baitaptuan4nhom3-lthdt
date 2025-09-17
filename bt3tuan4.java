import java.util.Scanner;
public class bt3tuan4 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            double so1, so2, ketQua = 0;
            char phepTinh;
            System.out.println("Nhập phép tính muốn thực hiện (+, -, *, /): ");
            phepTinh = scanner.next().charAt(0);
            System.out.print("Nhập số thứ nhất: ");
            so1 = scanner.nextDouble();
            System.out.print("Nhập số thứ hai: ");
            so2 = scanner.nextDouble();
            if (phepTinh == '+') {
                ketQua = so1 + so2;
                System.out.println("Kết quả: " + so1 + " + " + so2 + " = " + ketQua);
            } else if (phepTinh == '-') {
                ketQua = so1 - so2;
                System.out.println("Kết quả: " + so1 + " - " + so2 + " = " + ketQua);
            } else if (phepTinh == '*') {
                ketQua = so1 * so2;
                System.out.println("Kết quả: " + so1 + " * " + so2 + " = " + ketQua);
            } else if (phepTinh == '/') {
                if (so2 != 0) {
                    ketQua = so1 / so2;
                    System.out.println("Kết quả: " + so1 + " / " + so2 + " = " + ketQua);
                } else {
                    System.out.println("Lỗi: Không thể chia cho 0!");
                }
            } else {
                System.out.println("Phép tính không hợp lệ!");
            }

            scanner.close();
        }
    }


