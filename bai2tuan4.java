import java.util.Scanner;

public class bai2tuan4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap a: ");
        int a = sc.nextInt();
        System.out.print("Nhap b: ");
        int b = sc.nextInt();
        System.out.print("Nhap c: ");
        int c = sc.nextInt();

        int min = a;
        if (b < min) min = b;
        if (c < min) min = c;

        System.out.println("So nho nhat la: " + min);
        sc.close();
    }
}
