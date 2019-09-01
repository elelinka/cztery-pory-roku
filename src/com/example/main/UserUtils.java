package com.example.main;

import com.example.season.Season;

import java.util.Scanner;

public class UserUtils {
    public static void getSeasonFromUser() {
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj porę roku:");
        String userSeason = input.nextLine().toLowerCase();

        Season season = Season.fromName(userSeason);
        String[] months = Season.fromMonths(userSeason);
        System.out.println(season.getName() + ":");
        for (String m : months) {
            System.out.print(m + ", ");
        }
        input.close();
    }
}
