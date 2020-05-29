package date_time_homework;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateTimeHomework {
    static DateTimeFormatter dateFormatter= DateTimeFormatter.ofPattern("MMMM dd,yyy");
    public static void main(String[] args) {
        System.out.println("Input the year to check the month length:");
        int year=numberVerification();
        monthsLength(year);
        listOfMondays();
        System.out.println("Input the year to verify the Friday 13th:");
        int fridayThirteenYear=numberVerification();
        System.out.println("Now input number of the month:");
        int fridayThirteenMonth=numberVerification();
        LocalDate localDate=LocalDate.of(fridayThirteenYear,fridayThirteenMonth,13);
        fridayThirteen(localDate);
    }

    private static void fridayThirteen(LocalDate localDate){
        if (localDate.getDayOfWeek()==DayOfWeek.FRIDAY)
            System.out.println(localDate.format(dateFormatter)+ " it's a Friday 13th!!!");
        else
            System.out.println(localDate.format(dateFormatter) + " it's not a Friday 13th.");
    }

    private static void monthsLength(int year){
        Month month=Month.JANUARY;
        if (year%4==0) {
            for (int i = 0; i < 12; i++) {
                System.out.println(month.name() +" has "+ month.length(true)+" days in "+year+" year.");
                month = month.plus(1);
            }
        }else {
            for (int i = 0; i < 12; i++) {
                System.out.println(month.name() +" has "+ month.length(false)+" days in "+year+" year.");
                month = month.plus(1);
            }
        }
    }

    private static void listOfMondays(){
        System.out.println("Input number of the month to show all Mondays:");
        Month month =Month.of(numberVerification());
        boolean yearVerification=false;
        if (Year.now().getValue()%4==0) {
            yearVerification=true;
        }
        LocalDate localDate = LocalDate.of(Year.now().getValue(),month,1);
        for (int i = 0; i < month.length(yearVerification) ; i++) {
            if (localDate.getDayOfWeek()==DayOfWeek.MONDAY){
                System.out.println(localDate.format(dateFormatter)+" it's Monday.");
            }
            localDate=localDate.plusDays(1);
        }

    }

    private static int numberVerification() {
        Scanner in = new Scanner(System.in);
        int numberFromUser=0;
        if (in.hasNextInt()) {
            numberFromUser=in.nextInt();
            if (numberFromUser<=0 ) {
                System.out.println("Input number is '<' or '=' to zero");
                numberFromUser=numberVerification();
            }
        }else {
            System.out.println("Input value isn't integer type, please try again");
            numberFromUser=numberVerification();
        }
        return numberFromUser;
    }
}
