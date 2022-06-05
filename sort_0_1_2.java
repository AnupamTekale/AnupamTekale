class Solution {
    public void sortColors(int[] nums) {
        int ones=0,two=0,zero=0;
        
        for(int i : nums)
        {
            if(i==0)
                zero++;
            else if(i==1)
                ones++;
            else
                two++;
        }
        
        int j=0;
        while(zero--!=0)
            nums[j++]=0;
        
        while(ones--!=0)
            nums[j++]=1;
        
        while(two--!=0)
            nums[j++]=2;
        
        
    }
}
