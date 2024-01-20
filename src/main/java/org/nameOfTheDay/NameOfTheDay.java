package org.nameOfTheDay;

public class NameOfTheDay {

    public static String dayName(int dayNumber) {
        switch (dayNumber) {
            case 1:
                return "Monday";
            case 2:
                return "TuesDay";
            case 3:
                return "Wednesday";
            case 4:
                return "ThursDay";
            case 5:
                return "Friday";
            case 6:
            case 7:
                return "Weekend";
        }
        return "There is no such day";
    }
}
