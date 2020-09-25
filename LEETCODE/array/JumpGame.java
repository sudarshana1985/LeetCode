package LEETCODE.array;

public class JumpGame {
    public static  void main(String [] arg){
        JumpGame jumpGame = new JumpGame();
        int[] input ={2,3,1,1,4};
        System.out.println(jumpGame.canJump(input));
    }

    public boolean canJump(int[] nums) {
        if(nums.length==0)
            return  false;

        int len=nums.length-1; int lastPosition=len;
        for(int i=len;i>=0;i--){
            if(i+nums[i] >=lastPosition) {

                lastPosition = i;
            }
        }
        return lastPosition==0;
    }
}
