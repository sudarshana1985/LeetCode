package LEETCODE.array;

public class MinimumPathSum {
    public static  void main(String [] arg){
        MinimumPathSum minimumPathSum = new MinimumPathSum();
        int[][] input ={{1, 3,1},
                {1,5, 1},
                {4,2,1}};
        System.out.println(minimumPathSum.minPathSum(input));
    }

    public int minPathSum(int[][] grid) {
        if(grid.length==0)
            return 0;
        int[][] dp = new int[grid.length][grid[0].length];
        for(int i=0;i< grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                dp[i][j] +=grid[i][j];
                if(i>0 && j>0){
                    dp[i][j] += Math.min(dp[i][j-1],dp[i-1][j]);
                }
                else if(i>0)
                    dp[i][j] +=dp[i-1][j];
                else if(j>0)
                    dp[i][j] += dp[i][j-1];
            }
        }

        return dp[dp.length-1][dp[0].length-1];
    }
}
