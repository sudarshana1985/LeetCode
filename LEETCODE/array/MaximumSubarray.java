package LEETCODE.array;

public class MaximumSubarray {
    public static  void main(String [] arg){
        MaximumSubarray maximumSubarray = new MaximumSubarray();
        int[] nums={-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maximumSubarray.maxSubArray(nums));
    }

    public int maxSubArray(int[] nums) {
        if(nums.length==0)
            return 0;
        int sum=nums[0];
        int max=nums[0];

        for(int i=0;i<nums.length;i++){
            sum= Math.max(nums[i], sum+nums[i]);
            max= Math.max(max,sum);
        }
        return max;
    }
}
