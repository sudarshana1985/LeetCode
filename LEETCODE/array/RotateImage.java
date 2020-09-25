package LEETCODE.array;

public class RotateImage {

    public static void main(String arg[]){
        RotateImage rotateImage = new RotateImage();
        int[][] input ={{1, 2, 3},
                {4,5, 6},
                {7,8,9}};
        //System.out.println(rotateImage.rotate(input));
    }
    public void rotate(int[][] matrix) {
        if(matrix.length==0)
            return;
        int len=matrix.length;

        for(int i=0;i<len;i++){
            for(int j=i;j<len;j++){
                int temp= matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]= temp;
            }
        }
        for(int i=0;i<len;i++){
            for(int j=0;j<len/2;j++){
                int temp= matrix[i][j];
                matrix[i][j]=matrix[i][len-1-j];
                matrix[i][len-1-j]= temp;
            }
        }
    }
}
