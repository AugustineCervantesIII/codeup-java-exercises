

public class MethodsExercisesPractice {
    //simple method of just printing something
    // void doesnt return any values
    public static void main(String[] args) {
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
        countBackwards(14);
    }

    public static void countBackwards(int n) {
        if (n == 0) {
            System.out.println("done");
        } else {
            System.out.println(n);
            n--;
            countBackwards(n);
        }
    }

}

