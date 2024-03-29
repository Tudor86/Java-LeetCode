package com.company;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Sol118Pascal solutie = new Sol118Pascal();
        solutie.setField(solutie.generate(5));
        solutie.printRez(solutie.getField());




    }
}


