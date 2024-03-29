package com.company;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class Sol118Pascal {

    private List<List<Integer>> field;

    public void setField(List<List<Integer>> field) {
        this.field = field;
    }

    public List<List<Integer>> getField(){
        return field;
    }

    public void printRez(List<List<Integer>> lists){
        for(List<Integer> list : lists){
            for(Integer myInt : list)
                System.out.print(myInt + " ");
            System.out.println();
        }


    }

    public List<List<Integer>> generate(int numRows) {

        List<List<Integer>> res = new ArrayList<>();
        for(int i = 0; i < numRows; i++){
            Integer[] temp = new Integer[i+1];
            Arrays.fill(temp,1);
            List<Integer> sol = Arrays.asList(temp);
            res.add(sol);
        }
        for(int i = 2; i < numRows; i++)
            for(int j= 1; j < i ;j++)
                res.get(i).set(j,res.get(i-1).get(j-1) + res.get(i-1).get(j));



        return res;
    }
}
