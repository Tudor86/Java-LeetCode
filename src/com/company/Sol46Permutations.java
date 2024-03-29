package com.company;
import java.util.List;
import java.util.ArrayList;

public class Sol46Permutations {
    public List<String> permute(String myStr){
        List<String> solutie = new ArrayList<>();
        btGen("",myStr, solutie);
        return solutie;
    }

    private void btGen(String prefix, String sufix,List<String> sol){
        if(sufix.equals("")) {
            sol.add(prefix);
            return;
        }
        int size = sufix.length();
        for(int i = 0; i < size; i++){
            btGen(prefix + sufix.charAt(i),sufix.substring(0,i) + sufix.substring(i+1,size),sol);
        }

    }
}

/*        Sol46Permutations sol = new Sol46Permutations();
        List<String> myList = sol.permute("abcd");
        for(String elem : myList)
            System.out.println(elem);*/