package LEETCODE.array;

/**
 * The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this: (you may want to display this pattern in a fixed font for better legibility)
 *
 * P   A   H   N
 * A P L S I I G
 * Y   I   R
 * And then read line by line: "PAHNAPLSIIGYIR"
 *
 * Write the code that will take a string and make this conversion given a number of rows:
 *
 * string convert(string s, int numRows);
 * Example 1:
 *
 * Input: s = "PAYPALISHIRING", numRows = 3
 * Output: "PAHNAPLSIIGYIR"
 * Example 2:
 *
 * Input: s = "PAYPALISHIRING", numRows = 4
 * Output: "PINALSIGYAHRPI"
 * Explanation:
 *
 * P     I    N
 * A   L S  I G
 * Y A   H R
 * P     I
 */
public class ZigZagConversion {
    public static void main(String arg[]){
        ZigZagConversion valid = new ZigZagConversion();
        String s = "PAYPALISHIRING";
        System.out.println(valid.convert(s,3));
    }

    public String convert(String s, int numRows) {
        if(s.length()==0)
            return "";
        if(numRows==1)
            return s;
        char [][] dp = new char[numRows][s.length()/2];
        int col=0,x=0;
        boolean zig = true;
        while(x<s.length()){
            if(zig){
                for(int i=0;i<numRows;i++){
                    dp[i][col]= s.charAt(x);
                    x++;
                }
                col++;
                zig= false;
            }
            else{
                for(int row=numRows-1;row>=0;row--){
                    dp[row][col]= s.charAt(x);
                    col++;
                    x++;
                }
                zig=true;
            }
        }
        char space =' ';
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<numRows;i++){
            for(int j=0;j<dp[numRows].length;j++){
                if(dp[i][j] != space)
                    sb.append(dp[i][j]);
            }
        }
        return sb.toString();
    }
}
