class Solution {
    public int[][] matrixReshape(int[][] nums, int r, int c) {
        int m = nums.length, n = nums[0].length, o = m * n;
        if (r * c != o) return nums;
        int[][] res = new int[r][c];
        for (int i = 0; i < o; i++) res[i / c][i % c] = nums[i / n][i % n];
        return res;        
    }
}