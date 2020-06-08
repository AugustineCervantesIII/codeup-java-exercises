import java.util.Scanner;

public class MethodExercises {
    public static int add(int num1, int num2) {
        return (num1 + num2);
    }

    public static int subtract(int x, int y) {
        return (x - y);
    }

    public static int multiply(int a, int b) {
        return (a * b);
    }

    //multiply without *
    public static int multi(int a, int b) {
        int answer = 0;
        for (int i = 0; i < b; i++) {
            answer += a;
        }
        return answer;
    }

    //recursion
    public static int multiplyR(int x) {
        if (x == 0) {
            System.out.println("done");
        } else {
            System.out.println(x);
            x += 6;
        }
        return x;
    }

    public static int divide(int i, int j) {
        return (i / j);
    }

    public static int modulus(int h, int k) {
        return (h % k);
    }

    //exercise 2
    public static int getInteger(int min, int max) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number between " + min + " and " + max + ": ");
        int inputNumber = scanner.nextInt();
        if (inputNumber > max || inputNumber < min) {
            inputNumber = getInteger(min, max);
        }
        return inputNumber;
    }

    //exercise bonus 3
    //in method exercise practice

    //exercise bonus 4
    //in method exercise practice

    //exercise bonus 5
    //in method exercise practice

    public static void main(String[] args){

        System.out.println(add(10, 14));

        System.out.println(subtract(5, 35));

        System.out.println(multiply(6, 6));

        System.out.println(multi(6, 7));

        System.out.println(divide(240, 5));

        //four sevens is 28 with 2 left over to get 30
        System.out.println(modulus(30, 7));
        //error when dividing by 0

        System.out.println(multiplyR(54));

        System.out.println(getInteger(1, 10));

        //System.out.println(factorial());

    }
}
