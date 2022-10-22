class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        
        int[] arr=new int[26];
        
        int mlen=magazine.length();
        int rlen=ransomNote.length();
        
        for(int i=0;i<mlen;i++){
            arr[magazine.charAt(i)-97]++;
        }
        
        for(int i=0;i<rlen;i++){
            if(--arr[ransomNote.charAt(i)-97]<0)
                return false;
        }
        
       return true; 
    }
}