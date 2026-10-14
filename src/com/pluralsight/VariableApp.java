package com. pluralsight ;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class VariableApp {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

        // Question 1: Favorite color
        String favoriteColor = "red";
        System.out.println ("My favorite color is " + favoriteColor);

        // Question 2: Year you started this class
        int startYear = 2026;
        System.out.println("I started this class in " + startYear);

        // Question 3: Middle initial
        char middleInitial = 'B';
        System.out.println("My middle initial is " + middleInitial);

        // Question 4: Whether you have pets
        boolean havePets = false;
        System.out.println ("Do I have pets? " + havePets);

        // Question 5: A nice message
        String message = "Never give up on your dreams!";
        System.out.println(message);

        // Step 2: Question 1 - Days in a week
        int daysInWeek = 7;

        // Question 2 - Price of coffee
        double coffeePrice = 7.99;

        // Question 3 - Favorite letter
        char favoriteLetter = 'E';

        // Question 4 - Is it raining?
        boolean isRaining = false;

        // Question 5 - Print all the values
        System.out.println ("There are " + daysInWeek + " days in a week.");
        System.out.println ("A cup of coffee costs $" + coffeePrice + ".");
        System.out.println ("My favorite letter is " + favoriteLetter + ".");
        System.out.println ("Is it raining? " + isRaining + ".");

        }

}