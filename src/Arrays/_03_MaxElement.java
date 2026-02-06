package Arrays;
import java.util.Scanner;
public class _03_MaxElement {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int MaxElement = Integer.MIN_VALUE;
        System.out.println("Enter Arrays Size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            if (MaxElement < arr[i]) {
                MaxElement = arr[i];
            }


        }
        System.out.println(MaxElement);
    }
}
