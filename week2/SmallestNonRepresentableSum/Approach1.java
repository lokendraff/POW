package week2.SmallestNonRepresentableSum;
import java.util.*;
public class Approach1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        int smallestNonRepresentableSum = 1;
        for (int i = 0; i < n; i++) {
            if (arr[i] > smallestNonRepresentableSum) {
                break;
            }
            smallestNonRepresentableSum += arr[i];
        }
        
        System.out.println(smallestNonRepresentableSum);
    } 
    
}
