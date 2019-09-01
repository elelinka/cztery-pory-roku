package com.example.main;

public class Main {
    public static void main(String[] args) {
        try {
            UserUtils.getSeasonFromUser();
        } catch (NullPointerException e) {
            System.out.println("Podana pora roku nie istnieje.");
        }

    }
}
