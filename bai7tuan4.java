import java.util.Scanner;

public class Bai7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập số phần tử của mảng: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Nhập phần tử arr[" + i + "]: ");
            arr[i] = sc.nextInt();
        }

        int tong = 0;
        for (int i = 0; i < n; i++) {
            tong += arr[i];
        }

        System.out.println("Tổng các phần tử trong mảng là: " + tong);

        sc.close();
    }
}
