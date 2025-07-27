package week2.LCS_OfThreeStrings.approach2;
import java.util.*;
public class Approach2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        String s3 = sc.nextLine();
        int n1 = s1.length();
        int n2 = s2.length();
        int n3 = s3.length();
        int dp[][][] = new int[n1 + 1][n2 + 1][n3 + 1];
        
        for(int i=1; i<=n1; i++) {
            for(int j=1; j<=n2; j++) {
                for(int k=1; k<=n3; k++) {
                    if(s1.charAt(i-1) == s2.charAt(j-1) && s2.charAt(j-1) == s3.charAt(k-1)) {
                        dp[i][j][k] = 1 + dp[i-1][j-1][k-1];
                    } else {
                        dp[i][j][k] = Math.max(dp[i-1][j][k], Math.max(dp[i][j-1][k], dp[i][j][k-1]));
                    }
                }
            }
        }
        
        System.out.println(dp[n1][n2][n3]);
    }
}
