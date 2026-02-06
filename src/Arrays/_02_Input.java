package Arrays;
import java.sql.SQLOutput;
import java.util.Scanner;

public class _02_Input {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements in arrays: ");
        int  n = sc.nextInt();
        int[] arr = new int[50];
        for(int i = 0 ; i < n ; i++ ){
            System.out.println("Enter the Elements: "+(i+1));
            arr[i] = sc.nextInt();
        }
    }
}
