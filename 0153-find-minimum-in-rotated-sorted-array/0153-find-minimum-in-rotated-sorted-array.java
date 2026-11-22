class Solution {
    public int findMin(int[] nums) {
        // Arrays.sort(nums);
        // return nums[0];
        // int least=Arrays.stream(nums).min().getAsInt();
        // return least;
        int low=0;
        int high=nums.length-1;
        int ans=Integer.MAX_VALUE;

        while(low<=high){

            int mid=low+(high-low)/2;
            if(nums[mid]>=nums[low]){
                ans=Math.min(ans,nums[low]);
                low=mid+1;
            }else{
                ans=Math.min(ans,nums[mid]);
                high=mid-1;
            }
        }
        
        return ans;
    }
}