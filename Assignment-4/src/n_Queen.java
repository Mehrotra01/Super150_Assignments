import java.util.Scanner;

public class n_Queen {
    static int count=0;
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        boolean[][] board = new boolean[n][n];
        sc.close();
        solve(n,0,0,new String(),board);
        System.out.println(count);

    }
    static void solve(int n,int x,int y,String ans,boolean[][] board){
        if(n==0){
            System.out.println(ans+" ");
            count++;
            return ;
        }       
        
        if(x<0||y<0||x>board.length-1||y>board[0].length){
            return;
        }
    }
}
