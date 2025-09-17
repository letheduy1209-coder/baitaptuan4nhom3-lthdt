
    import java.util.ArrayList;
import java.util.Scanner;
    public class bt9tuan4 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("nhap so phan tu");
            int n=sc.nextInt();
            ArrayList<Integer> ds=new ArrayList<>();
            for (int i = 1; i <= n; i++) {
                System.out.println("nhap phan tu thu " +i);
                int a=sc.nextInt();
                ds.add(a);
            }
            System.out.println("in danh sach");
            for (int  a:ds) {
                System.out.print(a+" ");
            }
        }
    }

