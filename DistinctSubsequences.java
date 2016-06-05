package com.company;

/**
 * Created by jason on 16/6/4.
 */
public class DistinctSubsequences {
    public int numDistinct(String s, String t) {
        if(s.length() == 0 || t.length() == 0)
            return 0;
        int[][] dp = new int[s.length()+1][t.length()+1];
        for(int i = 0 ; i <= s.length();i++)
            dp[i][0] = 1;
        for(int i = 1; i <= s.length(); i++)
            for(int j = 1; j <= t.length(); j++)
            {
                if(s.charAt(i - 1) == t.charAt(j - 1))
                {
                    dp[i][j] = dp[i -1][j - 1]+ dp[i - 1][j];
                }
                else
                    dp[i][j] = dp[i -1][j];
            }
        return dp[s.length()][t.length()];
    }
    public static void main(String[] args)
    {
        DistinctSubsequences distinctSubsequences = new DistinctSubsequences();
        System.out.println(distinctSubsequences.numDistinct("fff","ffff"));
    }
}
