class Solution {
    public int[] getConcatenation(int[] nums) {
    
        int[] arr=new int[nums.length*2];
        int len=nums.length;
        
        for(int i=0;i<nums.length;i++)
        {
            arr[i]=nums[i];
            arr[i+len]=nums[i];
        }
        return arr;  
    }
}