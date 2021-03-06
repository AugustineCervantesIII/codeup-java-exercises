

//public class MethodsExercisesPractice {
    //simple method of just printing something
    // void doesnt return any values, just console logs it
//    public static void main(String[] args) {
//        int augustine = 8;
//
//        System.out.println("PROGRAM START.\n");
//        printFirstName();
//        printLastName();
//        addNames();
//        System.out.println("\nPROGRAM END");

        //this calls the int augustine = 8 because it lives in this method
//        System.out.println("augustine equals " + augustine);
//    }
//    public static void printFirstName(){
//        System.out.println("My first name is Augustine.");
//    }
//    public static void printLastName(){
//        System.out.println("Cervantes.");
//    }
//    public static void addNames(){
//        int augustine = 9;
//        int cervantes = 9;
//        int sum;
//
//        sum = augustine + cervantes;
//        System.out.println("the number of letter in your full name is: " + sum);


        //examples
//    int num1 = 5;
//    int num2 = 5;
//    int answer1;
//    int answer2;
//    boolean answer3;
//
//    answer1 = multiplyNumbers(num1);
//        System.out.println("\nthe result is " + answer1);
//        //alternate way
//        //System.out.println("The result is " + multiplyNumbers(num1));
//
//        answer2 = addNumber(num1, num2);
//        System.out.println("\nwhen we add num1 and num2 the result is: " + answer2);
//
//        answer3 = equalNumbers(num1, num2);
//        System.out.println("\nnum 1 and num2 are equal: " + answer3);
//    }
//    public static int multiplyNumbers(int a){
//        return (a * 8);
//    }
//    public static int addNumber(int x, int y){
//        return (x + y);
//    }
//    public static boolean equalNumbers(int r, int t){
//        return (r == t);


        //recursion - method being called inside of itself
//        sayHi(5);
//    }
//        public static void sayHi(int n){
//            if(n == 0){
//                System.out.println("done");
//            } else {
//                System.out.println("hi");
//                n--;
//                sayHi(n);
//            }
        //recursion example 2
//        countBackwards(14);
//    }
//
//    public static void countBackwards(int n) {
//        if (n == 0) {
//            System.out.println("done");
//        } else {
//            System.out.println(n);
//            n--;
//            countBackwards(n);
//        }
//    }
//
//}

import java.util.Scanner;
public class MethodsExercisesPractice {
    static Scanner sc = new Scanner(System.in).useDelimiter("\n");
    public static double add(double a, double b){
        return a+b;
    }

    public static double subtract(double a, double b){
        return a-b;
    }

    public static double multiply(double a, double b){
        return a*b;
    }

    public static double divide(double a, double b){
        return a/b;
    }

    //    loop multiplication
    public static double loopMultiply(double a, double b){
        double result = 0;
        for(double i = 0; i < a; i++){
            result += b;
        }
        return result;
    }

    //    recursive multiplication
    public static double recursiveMultiply(double a, double b){
        if(a == 0 || b == 0){
            return 0;
        }
        return a + recursiveMultiply(a, b-1);
    }

    public static void testArithmetic(){
        System.out.println(add(2,3));
        System.out.println(subtract(10,7));
        System.out.println(multiply(4,4));
        System.out.println(divide(100,25));
        System.out.println(loopMultiply(3,10));
        System.out.println(recursiveMultiply(2,5));
    }

    public static int getInteger(int min, int max){
//        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        System.out.printf("Enter a number between %d and %d: ", min, max);
        int userInput = sc.nextInt();
//        this conditional validates if a # is within range
        if(userInput > max || userInput < min){
            System.out.println("Please enter a number within the range.");
            return getInteger(min, max);
        }
        System.out.println("Thanks for entering a valid number!");
        return userInput;
    }

    //      calculating factorial using recursion
    public static long factorialRecursion(int x){
        if(x <= 1){
            return 1;
        }
        return x * factorialRecursion(x - 1);
    }

    public static void rollDice(int sides){
        int firstDice = (int)(Math.random() * sides) + 1;
        int secondDice = (int)(Math.random() * sides) + 1;
        System.out.printf("1st Result: %d | 2nd Result: %d%n", firstDice, secondDice);
    }

    public static void guessingGame(int guess, int answer){
        if(guess == answer){
            System.out.println("You got it!");
        }else if (guess < answer){
            System.out.println("HIGHER");
            guessingGame(getInteger(1,100), answer);
        }else {
            System.out.println("LOWER");
            guessingGame(getInteger(1,100), answer);
        }
    }
    public static void main(String[] args) {
//        Exercise 5 - START: High Low Guessing Game
        System.out.println("Let's play a game.");

        do {
            int answer = (int) (Math.random() * 100) + 1;
            System.out.println("Can you guess what number I'm thinking of?");
            guessingGame(getInteger(1,100), answer);
            System.out.println("Would you like to continue?(y/n)");
        }while(sc.next().equalsIgnoreCase("y"));
//        Exercise 5 - END

//        Exercise 4 - START: Dice Roll
        do{
            System.out.println("Let's roll a pair of dice. How many sides? ");
            rollDice(getInteger(1,10));
            System.out.println("Would you like to continue?(y/n)");
        }while(sc.next().equalsIgnoreCase("y"));
//        Exercise 4 - END

//        Exercise 3 - START: Calculating Factorials
        int number;
        String response;
        long fact = 1;
        do{
            number = getInteger(1,26);
            System.out.println("Calculate factorial of " + number + "!...?");
            System.out.println("Continue?(y/n)");
            response = sc.next();
        }while(sc.next().equalsIgnoreCase("y"));

        System.out.println(fact);
        System.out.print(number + "! = ");
//        Factorials example WITHOUT recursion
        for(int i = 1; i <= number; i++){
            fact = fact * i;
            if(i < number){
                System.out.print(i + " x ");
            }else{
                System.out.println(i + " = " + fact);
            }
        }
//        Exercise 3 - END

        testArithmetic();

//        System.out.println("Enter a number between 1 and 50: ");
        int myInt = getInteger(1,50);
        System.out.println(myInt);

    }
}