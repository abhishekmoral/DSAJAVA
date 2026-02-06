package Basics;
import java.util.Scanner;

public class _07_SI {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();
        int r = sc.nextInt();
        int t = sc.nextInt();
        double Si = p*r*t/100.0 ;
        System.out.println(Si);
    }
    }

