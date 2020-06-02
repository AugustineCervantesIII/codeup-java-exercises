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


//Describe in some detail the process by which a Java program is able to run on an operating system.


// Why is Java touted as a "write once, run anywhere" language?
//Becasue of the java virtual machine, a programmer can develop Java
//        code on one system and can expect it to run on any other
//        Java-enabled system without any adjustment.

// What is the difference between a .java and .class file?
//.java file contains your Java source code while a .class file
//        contains the Java bytecode produced by the Java compiler.
//        It is your .class files that run on the Java virtual machine to execute a
//        Java application.

// Why are we using an IDE (IntelliJ) instead of a simple text editor for writing Java code?
//Because the ide can automate its usage for you

// What is the difference between a JRE and a JDK?
//JRE is to run the java application.
//JDK is to create and build java applications

// Are we currently learning about JavaSE, JavaEE, JavaME, or JavaFX?
//JavaSE and JavaEE but right now its SE for standard edition

// What are some key differences between JavaScript and Java?
//java must be compiled js is interpreted
//Java is statically typed while JavaScript has dynamic typing
//JavaScript runs (mostly) in the browser, while Java runs almost everywhere
//While JavaScript does have objects, there is much more focus on them in Java,
// and the way they are defined and used is quite different.

// Why does Java have multiple number data types? Why use one over the other?
//becasue its type checked by the compiler for type compatibility.
// strong type checks help prevent errors

// Is a string a primative type in Java?
//no becasue it refers to an object

// Describe the difference between explicit and implicit casting using examples.
//explicit is going from a higher precision type to a lower precision type.
//implicit going from a more specific to a less specific type















