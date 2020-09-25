package LEETCODE.string;

import java.util.Stack;

public class BasicCalculator {
    public static void main(String arg[]){
        BasicCalculator valid = new BasicCalculator();
        String s = "3+2*2";
        System.out.println(valid.calculate(s));
    }

    public int calculate(String s) {
        if(s.length()==0)
            return 0;
        Stack<Integer> stack = new Stack<>();
        int num=0;
        char sign = '+';
        for(int i=0;i<s.length();i++){
            if(Character.isDigit(s.charAt(i))){
                num= num*10+s.charAt(i)-'0';
            }
            if((!Character.isDigit(s.charAt(i)) &&' '!=s.charAt(i)) || i==s.length()-1){
                if(sign=='+'){
                    stack.push(+num);
                }
                if(sign=='-'){
                    stack.push(-num);
                }
                if(sign=='*'){
                    stack.push(stack.pop()*num);
                }
                if(sign=='/'){
                    stack.push(stack.pop()/num);
                }
                sign=s.charAt(i);
                num=0;
            }
        }
        int re = 0;
        for(int i:stack){
            re += i;
        }
        return re;
    }
}
