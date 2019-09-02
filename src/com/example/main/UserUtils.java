package com.example.main;

import com.example.season.Season;

import java.util.Scanner;

public class UserUtils {

    public static void printSeason(String userSeason) {
        Season season = Season.fromName(userSeason);
        if (season == null) {
            System.out.println("Podana pora roku nie istnieje.");
            return;
        }
        String[] months = Season.getMonthsOfSeason(userSeason);
        System.out.println(season.getName() + ":");
        for (String m : months) {
            System.out.print(m + ", ");
        }
    }

    public static String getSeasonFromUser() {
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj porę roku:");
        String userSeason = input.nextLine().toLowerCase();
        input.close();
        return userSeason;
    }
}