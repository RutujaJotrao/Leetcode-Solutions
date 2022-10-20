class Solution 
{
public:
    bool isPalindrome(int x) 
    {
        long num,rem=0;
        long reversenum=0;
        num=x;
        while(x>0)
        {
            rem=x%10;
            reversenum=reversenum*10+rem;
            x=x/10;
        }
        
        if(num==reversenum)
        {
                return true;
        }
        else
        {       return false;
        }
    }
};