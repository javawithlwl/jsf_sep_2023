package com.careerit.cj.day15;

public class TellDayNameAsIs {

    private Day day;

    public TellDayNameAsIs(Day day) {
        this.day = day;
    }

    public void tellItLikeItIs() {
        switch (day) {
            case MONDAY:
                System.out.println("Mondays are bad.");
                break;

            case FRIDAY:
                System.out.println("Fridays are better.");
                break;

            case SATURDAY: case SUNDAY:
                System.out.println("Weekends are best.");
                break;

            default:
                System.out.println("Midweek days are so-so.");
                break;
        }
    }

    public static void main(String[] args) {
        TellDayNameAsIs tellDayNameAsIs1 = new TellDayNameAsIs(Day.FRIDAY);
        tellDayNameAsIs1.tellItLikeItIs();
        TellDayNameAsIs tellDayNameAsIs2 = new TellDayNameAsIs(Day.MONDAY);
        tellDayNameAsIs2.tellItLikeItIs();
    }
}
