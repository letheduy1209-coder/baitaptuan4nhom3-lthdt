import java.util.Scanner;

public class bai1tuan4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap mot so: ");
        double so = scanner.nextDouble();

        if (so > 0) {
            System.out.println("So duong.");
        } else if (so < 0) {
            System.out.println("So am.");
        } else {
            System.out.println("So bang 0.");
        }
    }
}