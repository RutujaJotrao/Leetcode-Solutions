//{ Driver Code Starts
import java.io.*;
import java.util.*;
import java.util.Map.Entry;

class GFG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) a[i] = sc.nextInt();
            Solution g = new Solution();
            ArrayList<Integer> ans = g.duplicates(a, n);
            for (Integer val : ans) System.out.print(val + " ");
            System.out.println();
        }
    }
}

// } Driver Code Ends


class Solution {
    public static ArrayList<Integer> duplicates(int arr[], int n) {
    int flag=0;
    ArrayList<Integer> a1=new ArrayList<Integer>();
    
    Arrays.sort(arr);
    for(int i=0;i<arr.length-1;i++)
    {
        if(arr[i]==arr[i+1])
        {
            //a1.remove(arr[i]); 
            a1.add(arr[i]);
            flag=1;
        }
    }    
    if(flag==0)
    {
        a1.add(-1);
    }
    HashSet<Integer> hset = new HashSet<Integer>(a1);
    ArrayList<Integer> a2=new ArrayList<Integer>(hset);
    
    Collections.sort(a2);
    return(a2);
    }
}
