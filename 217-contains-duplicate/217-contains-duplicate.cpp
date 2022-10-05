#include<array>
class Solution 
{
public:    
    bool containsDuplicate(vector<int>& nums) 
    {
    
        sort(nums.begin(),nums.end());
        int lenn=end(nums)-begin(nums);
        
        for(int i=0;i<lenn-1;i++)
        {
            while(nums[i]==nums[i+1])
            {
                return true;
            }        
        }
        return false;
    }
};

    