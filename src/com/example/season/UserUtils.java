package com.example.season;

import java.util.Scanner;

public class UserUtils {
    public static void getSeasonFromUser() {
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj porę roku:");
        String userSeason = input.nextLine().toLowerCase();

        Season season = Season.fromName(userSeason);
        String[] months = Season.fromMonths(userSeason);
        System.out.println(season.getName() + ":");
        for (String s : months) {
            System.out.print(s + ", ");
        }
    }
}
