package NaiveApproach;
import java.util.*;
public class NaiveApproach {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int min = arr[0];
        for(int i=0 ; i<n ; i++){
            if(i<n-1 && arr[i] > arr[i+1]){
                min = arr[i+1];
                break;
            }
        }

       System.out.println(min);
    }
}