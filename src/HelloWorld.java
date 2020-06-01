public class HelloWorld {
    public static void main(String[] args){
        System.out.println("Hello, World!");

        int myFavoriteNumber = 2;
        System.out.println(myFavoriteNumber);

        String myString = "This is a string of words.";
        System.out.println(myString);

//        double myString = 3.14159;

        float myNumber = (float) 3.14;
        System.out.println(myNumber);

//        int x = 5;
//        System.out.println(x++);// called first with 5
//        System.out.println(x);//incremented to 6

//      int x = 5;
//        System.out.println(++x);//incremented
//        System.out.println(x);//incremented to 6

//        String theNumberThree = "three";
//        Object o = theNumberThree;
//        int three = (int) o;
//        System.out.println(theNumberThree);//exception error

//        int three = (int) "three";
//        System.out.println(three);//string cannot be converted into an int

//        int x = 4;
//        //x = x + 5;
//        x += 5;//shorthand
//        System.out.println(x);

//        int x = 3;
//        int y = 4;
//        //y = y * x;
//        y *= x;//shorthand
//        System.out.println(y);

        int x = 10;
        int y = 2;
        //x = x / y;
        //y = y - x;
//        x /= y;//shorthand
//        System.out.println(x);
        y -= x;//shorthand
        System.out.println(y);
    }
}
