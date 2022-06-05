class Solution {
    public void nextPermutation(int[] arr) {
        if(arr.length==1)
            return;
        
       int i=arr.length-2;
        
        while(i>=0 && arr[i]>=arr[i+1]) 
            i--;
        
        if(i>=0)
        {
            int j=arr.length-1;
            while(arr[j]<=arr[i])
                j--;
            
            swap(arr,i,j);
        }
        
        reverse(arr,i+1,arr.length-1);
        
    }
    
    public void swap(int arr[],int x,int y)
    {
        arr[x]=arr[x]^arr[y];
        arr[y]=arr[x]^arr[y];
        arr[x]=arr[x]^arr[y];
    }
    
    public void reverse(int arr[],int start,int end)
    {
        while(start<end)
            swap(arr,start++,end--);
    }
}
