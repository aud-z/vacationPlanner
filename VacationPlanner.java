/*
    This program creates a vacation planner
    for the intro to Java class
 */
import java.util.Scanner;

public class VacationPlanner {
    public static void main(String[] args){
        greeting();
        timeAndBudget();
        timeDifference();
        area();
    }

    //Part 1 - Greeting
    public static void greeting(){
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to Vacation Planner!");
        System.out.print("What is your name? ");
        String name=input.nextLine();
        System.out.print("Nice to meet you " + name + ", where are you travelling to? ");
        String location=input.nextLine();
        System.out.println("Great! "+ location + " sounds like a great trip");
        System.out.println("******");
        System.out.println("");
    }

    //Part 2 - Travel time and budget
    public static void timeAndBudget(){
        Scanner input = new Scanner(System.in);
        System.out.print("How many days are you going to spend travelling? ");
        int days=input.nextInt();
        System.out.print("How much money, in USD, are you planning to spend on your trip? ");
        double budget=input.nextDouble();
        System.out.print("What is the three letter currency symbol for your travel destination? ");
        String currency=input.next();
        System.out.print("How many "+ currency + " are there in 1 USD? ");
        double conversion=input.nextDouble();

        //calculations for Part 2
        int hours=days*24;
        int minutes=hours*24;
        double perDiem=(int) (budget*100/days)/100.0;
        double local=(int) (budget*conversion*100)/100.0;
        double localPerDiem=(int) (local*100/days)/100.0;

        //output for part 2
        System.out.println("If you are travelling for "+ days
                + " days that is the same as "+ hours
                +" hours or " + minutes + " minutes");
        System.out.println("If you are going to spend $" + budget
                + " USD that means per day you can spend up to $"
                + perDiem + " USD");
        System.out.println("Your total budget in " + currency + " is "
                + local + " " + currency
                + ", which per day is " + localPerDiem + " " + currency);
        System.out.println("******");
        System.out.println("");
    }

    //Part 3 - time difference
    public static void timeDifference(){
        Scanner input = new Scanner(System.in);
        System.out.print("What is the time difference, in hours, between your home and your destination? ");
        int timeDiff=input.nextInt();
        int localTime1=(24 + timeDiff) % 24;
        int localTime2=(12 + timeDiff) % 24;
        System.out.println("That means that when it is midnight at home it will be "
            + localTime1 + ":00 in your travel destination and when it is noon at home it will be "
            + localTime2 + ":00");
        System.out.println("******");
        System.out.println("");
    }

    //Part 4 - area
    public static void area(){
        Scanner input = new Scanner(System.in);
        System.out.print("What is the square area of your destination country in km2? ");
        double area=input.nextDouble();
        double areaInMiles=(int) (area*100/2.59)/100.0;
        System.out.println("In miles2 that is " + areaInMiles);
        System.out.println("******");
        System.out.println("");
    }
}
