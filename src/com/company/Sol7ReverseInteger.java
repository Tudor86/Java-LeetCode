package com.company;
/*

Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.

Assume the environment does not allow you to store 64-bit integers (signed or unsigned).



Example 1:

Input: x = 123
Output: 3210

Example 2:

Input: x = -123
Output: -321
Example 3:

Input: x = 120
Output: 21*/
public class Sol7ReverseInteger {
    public int reverse(int x){
        int number = Math.abs(x);
        int reversed = 0;

        while(number != 0){
            int digit = number % 10;
            if(reversed > (Integer.MAX_VALUE - digit) / 10)
                return 0;
            reversed = reversed * 10 + digit;
            number = number / 10;
        }

        if(x<0)
            return -reversed;
        else
            return reversed;
    }
}
