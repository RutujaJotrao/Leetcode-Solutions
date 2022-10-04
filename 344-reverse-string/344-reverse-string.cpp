class Solution {
public:
    void reverseString(vector<char>& s) {
        int len=s.size();
        int st=0;
        int en=len-1;
        while(st<en)
        {
            swap(s[st++],s[en--]);
        }
    }
};