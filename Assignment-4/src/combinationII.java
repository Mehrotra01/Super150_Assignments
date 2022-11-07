import java.util.Arrays;

public class combinationII {
    public static void main(String[] args) {
        int[] arr = {10,21,1,6,2,7,6,5,1};
        int target =8;
        Arrays.sort(arr);
        solve(arr, target,"",0);
    }
    static void solve(int[] arr, int target, String ans,int index){
        if(target==0){
            System.out.println(ans);
            return;
        }
        for(int i=index;i<arr.length;i++){

            if(target>= arr[i]){
                solve(arr,target-arr[i],ans+arr[i]+" ",i+1);
            }
            
        }
    }
}
