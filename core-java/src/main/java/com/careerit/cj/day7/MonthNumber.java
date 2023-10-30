package com.careerit.cj.day7;

public class MonthNumber {

    public static void main(String[] args) {
        String monthName = "January";
        int monthNumber = monthNumber(monthName);
        System.out.println("Month number for "+monthName+" is "+monthNumber);
    }
    public static int monthNumber(String monthName){
        return switch (monthName.toLowerCase()) {
            case "january" -> 1;
            case "february" -> 2;
            case "march" -> 3;
            case "april" -> 4;
            case "may" -> 5;
            case "june" -> 6;
            case "july" -> 7;
            case "august" -> 8;
            case "september" -> 9;
            case "october" -> 10;
            case "november" -> 11;
            case "december" -> 12;
            default -> -1;
        };
    }
}
