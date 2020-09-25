package LEETCODE.string;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class MinimumRemoveValidParentheses {
    public static void main(String arg[]){
        MinimumRemoveValidParentheses valid = new MinimumRemoveValidParentheses();
        String s = "lee(t(c)o)de)";
        System.out.println(valid.minRemoveToMakeValid(s));
    }

    public String minRemoveToMakeValid(String s) {
          if(s.length() ==0)
              return "";
          Stack<Integer> stack = new Stack<>();
          Set<Integer> set = new HashSet<>();
          StringBuffer sb = new StringBuffer();
          for(int i=0;i<s.length();i++){
              char c=s.charAt(i);
              if('('==(c))
                  stack.push(i);
              else if(')'==c){
                  if(!stack.isEmpty())
                      stack.pop();
                  else
                      set.add(i);
              }
          }
          while(!stack.isEmpty()){
              set.add(stack.pop());
          }
          for(int i=0;i<s.length();i++){
              if(!set.contains(i))
                  sb.append(s.charAt(i));
          }
          return sb.toString();
    }
}
