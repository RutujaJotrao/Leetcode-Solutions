class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        
        int peak=arr[0],x=0;
        
        for(int i=1;i<arr.length-1;i++)
        {
            peak=arr[i];
            
            if(arr[i-1] < peak && peak > arr[i+1])
            {
                x=i;
            }
        }
        return x;
    }
}