//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-->0)
        {
            int n = sc.nextInt();
            int[] nums = new int[n];
            for(int i = 0; i < n; i++)
                nums[i] = sc.nextInt();
            Solution ob = new Solution();
            int[] ans = ob.common_digits(nums);
            for(int i = 0; i < ans.length; i++)
                System.out.print(ans[i] + " ");
            System.out.println();
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    public int[] common_digits(int[] nums)
    {
        HashSet<Integer> hs=new HashSet<>();
        for(int x:nums)
        {
            // int rem=0;
            while(x!=0)
            {
                hs.add(x%10);
                x=x/10;
            }
        }
        int arr[]=new int[hs.size()];
        int a=0;
        for(int i:hs)
        {
            arr[a++]=i;
        }
        return arr;
    }
}