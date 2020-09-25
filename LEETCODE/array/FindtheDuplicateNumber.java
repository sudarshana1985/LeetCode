package LEETCODE.array;

public class FindtheDuplicateNumber {
    public static  void main(String [] arg){
        FindtheDuplicateNumber findtheDuplicateNumber = new FindtheDuplicateNumber();
        int[] input ={1,3,4,2,2};
        System.out.println(findtheDuplicateNumber.findDuplicate(input));
    }

    public int findDuplicate(int[] nums) {
        if(nums.length==0)
            return 0;
        int tortoise = nums[0];
        int hare = nums[0];
        do {
            tortoise = nums[tortoise];
            hare = nums[nums[hare]];
        } while (tortoise != hare);

        // Find the "entrance" to the cycle.
        tortoise = nums[0];
        while (tortoise != hare) {
            tortoise = nums[tortoise];
            hare = nums[hare];
        }

        return hare;    }
}
