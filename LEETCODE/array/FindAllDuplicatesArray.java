package LEETCODE.array;

import java.util.ArrayList;
import java.util.List;

public class FindAllDuplicatesArray {
    public static void main(String arg[]){
        FindAllDuplicatesArray  findAllDuplicatesArray= new FindAllDuplicatesArray();
        int[] input ={4,3,2,7,8,2,3,1};

        System.out.println(findAllDuplicatesArray.findDuplicates(input));
    }

    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> ans = new ArrayList<>();

        for (int num : nums) {
            if (nums[Math.abs(num) - 1] < 0) { // seen befoif (nums[Math.abs(num) - 1] < 0) { // seen before
                ans.add(Math.abs(num));
            }
            nums[Math.abs(num) - 1] *= -1;
        }

        return ans;
    }

}
