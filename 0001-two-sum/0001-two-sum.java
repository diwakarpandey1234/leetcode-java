class Solution {
    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer,Integer>num_position=new HashMap<>();


        int first_position=-1;
        int sec_position=-1;
        for(int i=0;i<nums.length;i++){

            if(num_position.size()==0)num_position.put(nums[i],i);
            else{
                int required=target-nums[i];
                
                if(num_position.get(required)!=null && num_position.get(required)!=i)
                {
                    first_position=num_position.get(required);
                    sec_position=i;
                    break;
                }
                num_position.put(nums[i],i);
            }
        }
        return new int[]{first_position,sec_position};
    }
}