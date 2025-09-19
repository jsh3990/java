package quiz01;

import java.util.Scanner;

public class Quiz07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int x = scan.nextInt();

        int a = scan.nextInt();
        int b = scan.nextInt();

        if(x == (a*b)*n) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }
}
