package com.example.season;

public enum Season {
    SPRING("wiosna", new String[]{"marzec", "kwiecień", "maj"}),
    SUMMER("lato", new String[]{"czerwiec", "lipiec", "sierpień"}),
    AUTUMN("jesień", new String[]{"wrzesień", "październik", "listopad"}),
    WINTER("zima", new String[]{"grudzień", "styczeń", "luty"});

    private final String name;
    private final String[] months;

    Season(String name, String[] months) {
        this.name = name;
        this.months = months;
    }

    public String getName() {
        return name;
    }

    public String[] getMonths() {
        return months;
    }

    public static Season fromName(String name) throws NullPointerException {
        Season[] nameValues = values();
        for (Season s : nameValues) {
            if (s.name.equals(name)) {
                return s;
            }
        }
        return null;
    }

    public static String[] fromMonths(String name) throws NullPointerException {
        Season[] months = values();
        for (Season s : months) {
            if (s.name.equals(name)) {
                return s.getMonths();
            }
        }
        return null;
    }
}
