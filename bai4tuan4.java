import java.util.Scanner;

public class bai4tuan4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap n: ");
        int n = sc.nextInt();
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        System.out.println("Tong tu 1 đen " + n + " la: " + sum);
        sc.close();
    }
}
