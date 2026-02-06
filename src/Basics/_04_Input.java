package Basics;
import java.util.Scanner;

public class _04_Input {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Radios of circle : ");
        double r = sc.nextDouble();
        double a = 3.14 * r * r;
        System.out.print("Area is : ");
        System.out.println(a);
    }
}
