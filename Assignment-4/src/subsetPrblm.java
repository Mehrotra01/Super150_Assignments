import java.util.Arrays;
import java.util.Scanner;

public class subsetPrblm {
            // Your Code Here
             static int count=0;
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int[] arr= new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            int target=sc.nextInt();
            Arrays.sort(arr);
            solve(arr,target,"",0);
            System.out.println(count);
            sc.close();
    
        }
        static void solve(int[] arr, int target,String ans,int index){
            if (target==0) {
                count=count+1;
               System.out.println(ans+" ");
                return;
            }
            for (int i = index; i < arr.length; i++) {
                    if(target>=arr[i]){
                    
                    solve(arr,target-arr[i],ans+arr[i]+ " ",i+1);
                }
            }
        }
    }
    