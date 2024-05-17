package com.company;

public class PalindromRecursive {
    boolean isPalindrom(String str){
        return isPalindromRec(str,0,str.length()-1);
    }
    boolean isPalindromRec(String str,int left,int right){
        if(left>=right)
            return true;
        if(str.charAt(left) != str.charAt(right))
            return false;
        return isPalindromRec(str,left + 1, right - 1);
    }
}
