import java.util.*;
public class NaiveApproach {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        System.out.println(subarraySum(arr, k));
    }
    public static int subarraySum(int[] nums, int k) {
        int ans = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]==k){
                ans++;
            }
            int c=0;
            for(int j=i+1; j<nums.length; j++){
                c+=nums[j];
                if(nums[i]+c==k){
                    ans++;
                    
                }
            }
        }
        return ans;
    }
}