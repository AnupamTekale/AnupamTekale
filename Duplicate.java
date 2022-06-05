import java.util.*;
class Duplicate
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
            arr[i]=in.nextInt();
        
        for(int i=0;i<n;i++)
        {
            int ele = Math.abs(arr[i]);
            if(arr[ele]<0)
                return ele;
            
            arr[ele] = -arr[ele];
        }
        
        return n;
            
        
    }
}
        
  
