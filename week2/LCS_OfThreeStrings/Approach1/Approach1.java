package week2.LCS_OfThreeStrings.Approach1;
import java.util.*;
public class Approach1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        String s3 = sc.nextLine();
        int n1 = s1.length();
        int n2 = s2.length();
        int n3 = s3.length();
        int dp[][][] = new int[n1][n2][n3];
        for (int i = 0; i < n1; i++) {
              for (int j = 0; j < n2; j++) {
                 Arrays.fill(dp[i][j], -1);
    }
}
        System.out.println(lcs(s1, s2, s3, 0, 0, 0, n1, n2, n3, dp));
    }

    public static int lcs(String s1, String s2, String s3, int i, int j, int k, int n1, int n2, int n3, int dp[][][]) {
        if (i == n1 || j == n2 || k == n3) {
            return 0;
        }
        if (dp[i][j][k] != -1) {
            return dp[i][j][k];
        }
        if (s1.charAt(i) == s2.charAt(j) && s2.charAt(j) == s3.charAt(k)) {
            return dp[i][j][k] = 1 + lcs(s1, s2, s3, i + 1, j + 1, k + 1, n1, n2, n3, dp);
        } 
        int choice1 = lcs(s1, s2, s3, i + 1, j, k, n1, n2, n3, dp);
        int choice2 = lcs(s1, s2, s3, i, j + 1, k, n1, n2, n3, dp);
        int choice3 = lcs(s1, s2, s3, i, j, k + 1, n1, n2, n3, dp);
        return dp[i][j][k] = Math.max(choice1, Math.max(choice2, choice3)); 
    }
}
