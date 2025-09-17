import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập một số nguyên: ");
        int n = sc.nextInt();

        if (n > 0) {
            System.out.println(n + " là số dương.");
        } else if (n < 0) {
            System.out.println(n + " là số âm.");
        } else {
            System.out.println("Số vừa nhập bằng 0.");
        }

        sc.close();
    }
}
