class Solution {
    public int[] numberOfPairs(int[] nums) {
        HashMap<Integer,Integer> a=new HashMap<>();
        
        int removed=0,remain=0;
    
        for(int i:nums)
        {
            if(a.containsKey(i))
            {
                a.remove(i);
                removed++;
            }
            else
            {
                a.put(i,1);
            }
        }
        remain=nums.length-removed*2;
        int arr[]=new int[]{removed,remain};
        return arr;
    }
}