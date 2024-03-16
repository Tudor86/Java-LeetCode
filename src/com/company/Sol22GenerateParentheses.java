package com.company;
import java.util.List;
import java.util.ArrayList;

public class Sol22GenerateParentheses {

    public List<String> generateP(int n) {
        List<String> solutie = new ArrayList<>();
        btGen(solutie, 0, 0, "", n);
        return solutie;

    }

    public void btGen(List<String> sol, int left, int right, String s, int len) {
        if (s.length() == len * 2) {
            sol.add(s);
            return;
        }
        if(left < len)
            btGen(sol, left+1, right,s + "{", len);
        if(right < left)
            btGen(sol, left, right + 1, s + "}",len);
    }
}
