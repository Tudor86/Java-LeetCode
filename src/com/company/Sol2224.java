package com.company;

import java.util.Arrays;

public class Sol2224 {
    public int convertTime(String curent, String correct){
        int oreCurent = Integer.valueOf(curent.split(":")[0]);
        int minuteCurent = Integer.valueOf(curent.split(":")[1]);

        int oreCorrect = Integer.valueOf(correct.split(":")[0]);
        int minuteCorrect = Integer.valueOf(correct.split(":")[1]);

        int totalCurent = oreCurent * 60 + minuteCurent;
        int totalCorect = oreCorrect * 60 + minuteCorrect;
        int difMinute = totalCorect - totalCurent;
        int nrOperatii = 0;

        int[] minutesAdd = new int[] {1,5,15,60};
//        int[] dp = new int[difMinute + 1];
//        Arrays.fill(dp, difMinute + 1);
//        dp[0] = 0;
//
//        for(int i = 1; i <= difMinute; i++)
//            for(int j = 0; j < minutesAdd.length; j++)
//                if(i >= minutesAdd[j])
//                    dp[i] = Math.min(dp[i], dp[i - minutesAdd[j]] + 1);
//        return dp[difMinute];
        for(int i = minutesAdd.length - 1; i >= 0; i--){
            nrOperatii +=difMinute/ minutesAdd[i];
            difMinute = difMinute % minutesAdd[i];
            }

        return nrOperatii;



    }
}
