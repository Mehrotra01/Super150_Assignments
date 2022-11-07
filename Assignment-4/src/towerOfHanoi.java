import java.util.*;

public class towerOfHanoi {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        towerOfHano(n, 'A', 'B', 'C');

    }

    static void towerOfHano(int n, char A,char B, char C) {
        if (n == 0) {
            return;
        }
        towerOfHano(n - 1, A, C, B);
        System.out.println("Move disk " + n + " from rod "
                + A + " to rod "
                + B);
        towerOfHano(n - 1, C, B, A);
    }

}