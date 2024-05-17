package com.company;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

//        Sol2224 sol = new Sol2224();
//        System.out.println(sol.convertTime("02:30","04:35"));
        String s = "abcd";
        //System.out.println(s.substring(0,4));
        for(int i = 0; i < s.length();i ++)
            for(int j = i + 1; j <= s.length(); j++)
                System.out.println(s.substring(i,j));


    }
}


