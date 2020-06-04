import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args){

        //exercise 1
//        int a = 5;
//        while(a <= 15){
//            System.out.print(a + " ");
//            a++;
//        }

        //refactored for loop
//        for(int a = 5; a <= 15; a++){
//            System.out.println(a);
//        }


        //exercise 1. b1
//        int b = 2;
//        do {
//            System.out.println(b);
//            b += 2;
//        }
//        while (b <= 100);

        //refactored for loop
//        for(int b = 2; b <= 100; b+=2){
//            System.out.println(b);
//        }


        //exercise 1. b2
//        for(int f = 100; f >= -10; f -= 5){
//            System.out.println(f);
//        }


        //exercise 1. b3
//        long c = 2;
//        do {
//            System.out.println(c);
//            c *= c;
//        }
//        while (c < 100000);

        //refactored for loop
//        for(long c = 2; c < 100000; c *= c){
//            System.out.println(c);
//        }

        //exercise 3 fizz buzz
//        counts 1 - 100
//        int d = 1;
//        while(d <= 100) {
//            System.out.println(d);
//            d++;
//        }

        //changed to for loop
//        for(int d = 1; d <= 100; d++) {
//            if(d % 3 == 0 && d % 5 == 0){
//                System.out.println("fizz-buzz");
//            } else if (d % 3 == 0) {
//                System.out.println("fizz");
//            } else if (d % 5 == 0) {
//                System.out.println("buzz");
//            } else {
//                System.out.println(d);
//            }
//        }


        //exercise 3
//        String answer;
//        do {
//            Scanner scanner = new Scanner(System.in);
//            System.out.print("What number would like to go up to? ");
//            long userResponse = scanner.nextInt();
//
//            String heading1 = "number";
//            String heading2 = "squared";
//            String heading3 = "cubed";
//
//            String border = "------";
//            System.out.printf("%-6s | %-6s | %-6s%n", heading1, heading2, heading3);
//            System.out.printf("%-6s | %-7s | %-6s%n", border, border, border);
//
//            for (long i = 1; i <= userResponse; i++) {
//
//                System.out.printf("%-6d | %-7d | %-6d%n", i, i * i, i * i * i);
//            }
//            System.out.println("do you want to continue (y/n)?");
//            answer = scanner.next();
//
//        }while (answer.equalsIgnoreCase("y"));


        //exercise 4
        Scanner userInput = new Scanner(System.in);

        System.out.println("Would you like to take a look at your letter grades?");
        String answer = userInput.next();

        while(answer.equalsIgnoreCase("YES")){
            System.out.println("Please enter the numeric grade:");
            int grade = userInput.nextInt();

            char letterGrade;
            if(grade >= 88){
                letterGrade = 'A';
            } else if(grade >= 80){
                letterGrade = 'B';
            } else if (grade >= 67){
                letterGrade = 'C';
            } else if (grade >= 60){
                letterGrade = 'D';
            } else {
                letterGrade = 'F';
            }

            System.out.printf("Your letter grade is: %c.%n", letterGrade);

            System.out.println("Do you want to check more grades?");
            answer = userInput.next();
        }


    }
}
