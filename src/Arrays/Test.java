package Arrays;

import java.util.Scanner;

public class Test {


    public static void main(String[] args) {
        //code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int MaxElement = Integer.MIN_VALUE;
        int MinElement = Integer.MAX_VALUE;
        for(int i = 0 ; i < arr.length; i++){
            if(MaxElement< arr[i]){
                MaxElement = arr[i];
            }
            if(MinElement> arr[i]){
                MinElement = arr[i];
            }


        }
        System.out.println(MaxElement);
        System.out.println(MinElement);

    }
}

