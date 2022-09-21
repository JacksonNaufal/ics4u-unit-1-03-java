/*
*
* This is a standared rock, paper, scissors program
* regular game, regular rules with a try and catch.
*
* @author  Jackson Naufal
* @version 1.0
* @since   2020-01-01
*
* This is a rock paper scissors program.
*/

import java.util.Scanner;
/**
 * This is a rock, paper, scissors program.
 */

final class MicrowaveHeater {

    public static final double SUBTIME = 60;
    public static final double PIZZATIME = 45;
    public static final double SOUPTIME = 105;
    public static final double TWOFOOD = 1.5;
    public static final double THREEFOOD = 2;
    public static final String SUB = "sub";
    public static final String PIZZA = "pizza";
    public static final String SOUP = "soup";
    public static final String ONE = "one";
    public static final String TWO = "two";
    public static final String THREE = "three";
    /**
    * Prevent instantiation.
    * Throw an exception IllegalStateException.
    * if this ever is called
    *
    * @throws IllegalStateException
    *
    */

    private MicrowaveHeater() {
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
    * The starting main() function.
    *
    * @param args No args will be used
    */
    public static void main(final String[] args) {
        // identifying the strings.
        // rock, paper and scissors.
        double time = 0;
        double minutes = 0;
        double seconds = 0;

        // max number in the Math.Random generator.
        final Scanner FirstInput = new Scanner(System.in);
        final Scanner NumberInput = new Scanner(System.in);
        System.out.print("Enter your choice, sub, pizza, or soup: ");
        final String userInput = FirstInput.nextLine();
        System.out.print("Enter the amount: ");
        final String amountNumber = NumberInput.nextLine();
        if (userInput.equals(SUB) || userInput.equals(PIZZA) || userInput.equals(SOUP)) {

        // try and catch for invalid inputs.
            if (userInput.equals(SUB)) {
                time = SUBTIME;
            }
            else if (userInput.equals(PIZZA)) {
                time = PIZZATIME;
            }
            else if (userInput.equals(SOUP)) {
                time = SOUPTIME;
            }
        
            if (amountNumber.equals(ONE)) {
                System.out.println("The time for " + userInput + " is" + time);
            } else if (amountNumber.equals(TWO)) {
                time = (time * TWOFOOD);
            } else if (amountNumber.equals(THREE)) {
                 time = (time * THREEFOOD);
            } else {
                System.out.println("Invalid Input!");
            }

            seconds = time / 60;
            minutes = Math.floor(seconds);
            seconds = (seconds - minutes) * 60;
            System.out.println("The " + userInput + " will be done in " + minutes + " minutes " + seconds + " seconds!");

        } else {
            System.out.println("Invalid Input");
        }
    }
}
