class Solution {
    public int findUnsortedSubarray(int[] nums) {
        if(nums.length==0 || nums.length==1) return 0;
        int n=nums.length;
        int maxleft=Integer.MIN_VALUE;
        int minright=Integer.MAX_VALUE;
        int start =0;
        int end=-1;

        for(int i=0;i<nums.length;i++){
            maxleft=Math.max(maxleft,nums[i]);
            if(nums[i]<maxleft){
                end=i;
            }
        }
        if(end==-1) return 0;

        for(int i=nums.length-1;i>=0;i--){
            minright=Math.min(minright,nums[i]);
            if(nums[i]>minright){
                start=i;
            }
        }
        return (end)-(start)+1;
        

        
    }
}