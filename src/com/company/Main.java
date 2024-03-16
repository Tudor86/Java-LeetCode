package com.company;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

       List<String> myList = new ArrayList<>();
        Sol22GenerateParentheses sol = new Sol22GenerateParentheses();
        myList = sol.generateP(4);
        for(String elemn : myList)
            System.out.print(elemn + " ");
        System.out.println(myList.size());







    }
}


