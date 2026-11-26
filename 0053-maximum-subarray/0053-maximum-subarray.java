class Solution {
  //  int maxSum=Integer.MIN_VALUE;

    // public int subarray(int[] nums,int ind,int[]  dp,int sum){
    //     if(ind>=nums.length)return 0;

    //     if(dp[i]!=-1)return dp[i];

    //     int subarr1=subarray(nums,ind+1,dp,sum+nums[i]);
    //     int subarr2=subarray(nums,ind+1,dp,nums[i]);

    //     dp[ind]=Math.max(subarr1,subarr2);
    //     maxSum=Math.max(maxSum,dp[ind]);        
        
    // }
    public int maxSubArray(int[] nums) {
        int[] dp=new int[nums.length];
        Arrays.fill(dp,-1);
       // return subarray(nums,0,dp);
       int sum=nums[0];
       dp[0]=nums[0];
       int maxSum=dp[0];

       for(int i=1;i<nums.length;i++){

          dp[i]=Math.max(nums[i],dp[i-1]+nums[i]);

          maxSum=Math.max(dp[i], maxSum);
          

       }

    return maxSum;





//        int currentSum=0;
//        int GlobalMaxSum=Integer.MIN_VALUE;

//        for(int i=0;i<nums.length;i++){

//         if(currentSum+nums[i]<nums[i]){
//             currentSum=nums[i];
            
//         }else{
//             currentSum+=nums[i];
//         }

//         if(currentSum>GlobalMaxSum){
//             GlobalMaxSum=currentSum;
//         }
//        }

//        return GlobalMaxSum;
    }
 }