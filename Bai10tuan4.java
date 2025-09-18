import java.util.ArrayList;
import java.util.Scanner;

public class Bai10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        System.out.print("Nhap so luong phan tu: ");
        int n = scanner.nextInt();

        System.out.println("Nhap cac phan tu:");
        for (int i = 0; i < n; i++) {
            System.out.print("Phan tu " + (i + 1) + ": ");
            list.add(scanner.nextInt());
        }

        System.out.print("Nhap vi tri can xoa (bat dau tu 0): ");
        int index = scanner.nextInt();

        if (index >= 0 && index < list.size()) {
            int removed = list.remove(index);
            System.out.println("Da xoa phan tu: " + removed);
        } else {
            System.out.println("Vi tri khong hop le!");
        }

        System.out.println("Danh sach sau khi duoc xoa:");
        for (int num : list) {
            System.out.print(num + " ");
        }
    }
}