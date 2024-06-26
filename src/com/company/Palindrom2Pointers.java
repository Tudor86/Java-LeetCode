package com.company;

public class Palindrom2Pointers {
    public boolean isPalindrome(String str){
        int i = 0;
        int j = str.length()-1;
        while(i <= j){
            if(str.charAt(i) != str.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }
}
