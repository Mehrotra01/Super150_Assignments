import java.util.Scanner;

public class dictionaryOrderSmaller {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str =   sc.next();
        sc.close();
        int max=lexSum(str);
        solve(str,max,new String(),0);
    }

    static void solve(String str, int max,String out, int currLex){
        if(max>currLex){
            System.out.println(out);
            return;
        }
        for(int i=0;i<str.length();i++){    
            
        }
    }

    static int lexSum(String str) {
        int sum=0;
        for (int i = 0; i < str.length(); i++) {
            sum += str.charAt(i);
            
        }
        return sum;
    }
}

