class Solution {
public:
    int thirdMax(vector<int>& nums) {
        
        sort(nums.begin(),nums.end());
        reverse(nums.begin(),nums.end());
        
        int cnt=1;
        int prev=nums[0];
        
        for(int i=1;i<nums.size();i++)
        {
            if(nums[i]!=prev)
            {
                cnt+=1;
                prev=nums[i]; 
            }
            
            
            if(cnt==3)
            {
                return nums[i];
            }
        }
        
        return nums[0];
    }
};