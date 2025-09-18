package quiz01;

import java.util.Arrays;
import java.util.Scanner;

public class Quiz05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int m = scan.nextInt();

        int [] arr = new int[n];
        for (int a = 0; a < n; a++){
            arr[a] = a + 1;
        }

        for (int b = 1; b <= m; b++){
            int i = scan.nextInt() - 1;
            int j = scan.nextInt() - 1;

            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

        }
        for (int a = 0; a < arr.length; a++){
            System.out.print(arr[a] + " ");
        }
    }
}

