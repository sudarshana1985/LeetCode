package LEETCODE.array;

public class ContainerWithMostWater {
    public int maxArea(int[] height) {
        if(height.length==0)
            return 0;
        int maxArea=0;
        int l=0;int r=height.length-1;
        while(l<r){
            maxArea= Math.max(maxArea, Math.min(height[l],height[r])* (r-l));
            if(height[l]<height[r])
                l++;
            else r--;
        }

        return maxArea;
    }
    public static void main(String arg[]){
        ContainerWithMostWater container = new ContainerWithMostWater();
        int[] input ={1,8,6,2,5,4,8,3,7};
        System.out.println(container.maxArea(input));
    }
}
