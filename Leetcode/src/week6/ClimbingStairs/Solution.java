/*
 * Climbing Stairs - Apr 3 '12
You are climbing a stair case. It takes n steps to reach to the top.

Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
 */

package week6.ClimbingStairs;

public class Solution {
    public int climbStairs(int n) {
        if(n == 0) return 0;
        if(n == 1) return 1;
        int[] res = new int[n];
        res[0] = 1;
        res[1] = 2;
        
        for(int i = 2; i < n; i++) res[i] = res[i-1] + res[i-2];
        
        return res[n-1];
    }
}
