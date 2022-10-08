class Solution {
public:
    vector<int> intersection(vector<int>& nums1, vector<int>& nums2) {
        
        map<int,int> m1; 
        vector<int> ans;
        
        for(int i=0;i<nums1.size();i++)
        {
            for(int j=0;j<nums2.size();j++)
            {
                if(nums1[i]==nums2[j])
                {
                    m1[nums1[i]]=0;
                    break;
                }
            }
        }
        for(auto x:m1)
        {
            ans.push_back(x.first);    
        }
        
        return ans;
    }
};
