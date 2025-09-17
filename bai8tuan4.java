import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class bai8tuan4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap so phan tu cua mang: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        System.out.println("Nhap cac phan tu:");
        for (int i = 0; i < n; i++) {
            System.out.print("Phan tu " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }

        Map<Integer, Integer> freqMap = new HashMap<>();
        for (int num : arr) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        int maxFreq = 0;
        int mostFrequent = arr[0];
        for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
            if (entry.getValue() > maxFreq) {
                maxFreq = entry.getValue();
                mostFrequent = entry.getKey();
            }
        }

        System.out.println("Phan tu xuat hien nhieu nhat la: " + mostFrequent + " (xuat hien " + maxFreq + " lan)");
    }
}