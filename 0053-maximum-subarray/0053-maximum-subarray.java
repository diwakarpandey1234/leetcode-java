class Solution {

    public int subarray(int[] nums,int ind){
        if(ind>=nums.length)return 0;

        int subarray1=nums[ind]+subarray(nums,ind+1);
        int subarray2=subarray(nums,ind+1);

        return Math.max(subarray1,subarray2);
    }
    public int maxSubArray(int[] nums) {
       // return subarray(nums,0);
       int currentSum=0;
       int GlobalMaxSum=Integer.MIN_VALUE;

       for(int i=0;i<nums.length;i++){

        if(currentSum+nums[i]<nums[i]){
            currentSum=nums[i];
            
        }else{
            currentSum+=nums[i];
        }

        if(currentSum>GlobalMaxSum){
            GlobalMaxSum=currentSum;
        }
       }

       return GlobalMaxSum;
    }
}