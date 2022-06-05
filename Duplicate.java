import java.util.*;
// class Duplicate
// {
//     public static void main(String args[])
//     {
//         Scanner in = new Scanner(System.in);
//         int n = in.nextInt();
//         int arr[] = new int[n];
//         for(int i=0;i<n;i++)
//             arr[i]=in.nextInt();
        
//         for(int i=0;i<n;i++)
//         {
//             int ele = Math.abs(arr[i]);
//             if(arr[ele]<0)
//                 return ele;
            
//             arr[ele] = -arr[ele];
//         }
        
//         return n;
            
        
//     }
// }

class Solution {
    public int findDuplicate(int[] nums) {
    // slow and fast pointer approach
        int slow = nums[0],fast = nums[0];
        
        do
        {
            slow = nums[slow];
            fast = nums[nums[fast]];
        }
        while(slow!=fast);
        
        fast = slow[0];
        
        while(slow!=fast)
        {
            slow = nums[slow];
            fast = nums[fast];
        }
        
    }
    
}
  
