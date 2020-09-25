package LEETCODE.array;

public class SortColors {
    public static void main(String arg[]){
        SortColors sortColors = new SortColors();
        int[] input ={1,0,2};
        System.out.println(sortColors.sortColors(input));
    }
    public int[] sortColors(int[] nums) {
        if(nums.length==0)
            return nums;
        int L=0,R= nums.length-1, curr=0;
        while(curr<R){
            if(nums[curr]==0){
                int temp= nums[L];
                nums[L++]= nums[curr];
                nums[curr++]=temp;
            }
            else if(nums[curr]==2){
                int temp= nums[R];
                nums[R--]= nums[curr];
                nums[curr]=temp;
            }
            else curr++;

        }
        return nums;
    }
    public void swap(int[] nums,int L,int R){
        int temp=nums[L];
        nums[L]=nums[R];
        nums[R]=temp;
    }
}
