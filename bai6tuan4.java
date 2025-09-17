import  java.util.Scanner;
public class bt6tuan4 {
        public static int ucln(int a, int b) {
            while (b != 0) {
                int temp = b;
                b = a % b;
                a = temp;
            }
            return Math.abs(a);
        }
        public static int bcnn(int a, int b) {
            return Math.abs(a * b) / ucln(a, b);
        }
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Nhập số nguyên thứ nhất: ");
            int so1 = scanner.nextInt();
            System.out.print("Nhập số nguyên thứ hai: ");
            int so2 = scanner.nextInt();
            int u = ucln(so1, so2);
            int b = bcnn(so1, so2);
            System.out.println("UCLN của " + so1 + " và " + so2 + " là: " + u);
            System.out.println("BCNN của " + so1 + " và " + so2 + " là: " + b);
            scanner.close();
        }
    }

