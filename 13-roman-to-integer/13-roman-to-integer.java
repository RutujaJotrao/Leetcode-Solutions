class Solution {
    public int romanToInt(String s) {
     HashMap<String,Integer> a=new HashMap<>();
        a.put("I",1);
        a.put("V",5);
        a.put("X",10);
        a.put("L",50);
        a.put("C",100);
        a.put("D",500);
        a.put("M",1000);
    
        int num=0; 
        int v=0;
        
    for(int i=0;i<s.length();i++)
    {
       
        if(i!=s.length()-1 && a.get(s.charAt(i)+"")<a.get(s.charAt(i+1)+""))
        {
               System.out.println(a.get(s.charAt(i)+""));
               num-=a.get(s.charAt(i)+"");
        }
        
        else
        {
           num+=a.get(s.charAt(i)+"");
        }
    }
    return num;
    }    
}