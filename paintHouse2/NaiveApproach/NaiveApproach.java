package paintHouse2.NaiveApproach;
import java.util.Scanner;

public class NaiveApproach {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[][] costs = new int[n][k];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < k; j++) {
                costs[i][j] = sc.nextInt();
            }
        }
        
        System.out.println(minCost(costs));
        sc.close();
    }

    public static int minCost(int[][] costs) {
        if (costs == null || costs.length == 0) {
            return 0;
        }
        return solve(0, -1, costs);
    }

    private static int solve(int houseIndex, int prevColorIndex, int[][] costs) {
        if (houseIndex == costs.length) {
            return 0;
        }

        int minCostForThisPath = Integer.MAX_VALUE;
        int k = costs[0].length;
        for (int color = 0; color < k; color++) {
            if (color == prevColorIndex) {
                continue; 
            }
            int currentPathCost = costs[houseIndex][color] + solve(houseIndex + 1, color, costs);
            
            minCostForThisPath = Math.min(minCostForThisPath, currentPathCost);
        }

        return minCostForThisPath;
    }
}