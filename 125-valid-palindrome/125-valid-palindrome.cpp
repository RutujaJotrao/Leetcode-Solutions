class Solution {
public:
     string removeSpaces(string str)
    {   
        str.erase(remove(str.begin(), str.end(), ' '), str.end());
        return str;
    }
    
    bool isPalindrome(string s) 
    {
        s=removeSpaces(s);
        
        int j = 0;
        
        for (int i = 0; i < s.size(); i++) {
        if ((s[i] >= 'A' && s[i] <= 'Z') || (s[i] >='a' && s[i] <= 'z') || (int(s[i])>=48 && int(s[i])<=57))
        {
            s[j] = s[i];
            j++;
        }
    }
    s=s.substr(0, j);
        transform(s.begin(),s.end(),s.begin(),::tolower);
        string ans=s;
        reverse(s.begin(),s.end());
        if(ans==s)
            return true;
        
        return false;
    }
};