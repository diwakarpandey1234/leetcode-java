class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] ans={-1,-1};
        ans[0]=binarySearch(nums,target,true);
        ans[1]=binarySearch(nums,target,false);
        return ans;
    }
    public int binarySearch(int[] nums,int target,boolean flag){
        int s=0;
        int e=nums.length-1;
        int ans=-1;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(nums[mid]>target){
                e=mid-1;
            }else if(nums[mid]<target){
                s=mid+1;
            }else{
                ans=mid;
                if(flag){
                    e=mid-1;
                }else{
                    s=mid+1;
                }
            }
        }
        return ans;
    }
}