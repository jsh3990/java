package quiz01;

import java.util.Scanner;

public class Quiz07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int len = scan.nextInt();

        int[] arr = new int[len];
        for(int i = 0; i < len; i++) {
            arr[i] = scan.nextInt();
        }

        int max = arr[0];
        int index = 0;
        for(int i = 1; i < arr.length; i++) {
            if(arr[i] > max) {
                max = arr[i];
                index = max+1;
            }
        }
        System.out.println(max);
        System.out.println(index);
    }
}
