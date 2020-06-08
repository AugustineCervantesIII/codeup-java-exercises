

public class MethodsExercisesPractice {
    //simple method of just printing something
    // void doesnt return any values
    public static void main(String[] args){
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
    int num1 = 11;
    int answer;

    answer = multiplyNumbers(num1);
        System.out.println("The result is " + answer);
    }
    public static int multiplyNumbers(int a){
        int answer = a * 6;

        return answer;
    }
}
