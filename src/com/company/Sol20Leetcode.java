package com.company;

import java.util.Stack;
class Sol20Leetcode {
    public boolean isValid(String s) {
        if(s==null || s.length()==0)
            return true;
        Stack<Character> stiva = new Stack<>();
        char curC;
        for(int i=0; i< s.length();i++){
            curC = s.charAt(i);
            if((curC == '(') || (curC == '[') || (curC == '{'))
            { stiva.push(curC);
                continue;}
            if(!stiva.isEmpty())
            {
                char topC = stiva.peek();
                if((curC ==')' && topC != '(') || (curC ==']' && topC != '[') || (curC =='}' && topC != '{'))
                    return false;
                else
                    stiva.pop();
            }
            else
                return false;
        }
        return stiva.isEmpty();
    }

}
/*
    Sol20Leetcode sol = new Sol20Leetcode();
    System.out.print(sol.isValid("[]()[)]"));
 */