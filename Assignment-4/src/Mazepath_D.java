import java.util.Scanner;

public class Mazepath_D {
    static int count = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        boolean[][] board = new boolean[n1][n2];
        solve(board, "", 0, 0);
        System.out.print("\n"+count);
        // syso

    }

    static void solve(boolean[][] board, String ans, int x, int y) {
        if (x == board.length-1 && y == board[0].length-1) {
            System.out.print(ans + " ");
            count = count + 1;
            return;
        }
        if (x < 0 || y < 0 || x >= board.length || y >= board[0].length || board[x][y] == true) {

			return;
		}
        int r[] = {  1, 0, 1, };
        int c[] = {  0, 1, 1 };
        char ch[] = {  'V',  'H', 'D'};
        board[x][y]=true;
        
        for (int i = 0; i < c.length; i++) {
            solve(board, ans+ch[i], x + r[i], y + c[i]);
        }
        board[x][y]=false;

    }
}
