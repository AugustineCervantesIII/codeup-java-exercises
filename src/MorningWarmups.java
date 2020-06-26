public class MorningWarmups {
    public static void main(String[] args){

        for(int a = 0; a <= 50; a += 5){
            System.out.println(a);
        }
    }
}


//Define the following terms and cite a specific example for each...

//  Encapsulation - is to make sure that "sensitive" data is hidden from users by having getters and setters to access the value of private data

//  Inheritance - to inherit one class to another, subclass is child class that inherits from another class, superclass the parent class being inherited from

//  Polymorphism - method to perform different tasks. This allows us to perform a single action in different ways.

//  Abstraction - is the process of hiding certain details and showing only essential information to the user.
//  Abstract class: is a restricted class that cannot be used to create objects.
//  Abstract method: can only be used in an abstract class, and it does not have a body. The body is provided by the subclass

//What is the difference between method overloading and method overriding? - Method overloading is defining multiple methods with the same name, but with different parameter type, parameter order, or number of parameters.
//overriding is to override a method in the superclass

//What are four types of visibility in Java? - public, private, protected, default.
//

//Under what conditions would using a map collection be preferred over a list collection and vice versa?
//

//What are three differences between abstract classes and interfaces?

//What are annotations and what are some specific examples?
//used to provide metadata for java code. doesn't modify the execution of code; however, they can be consumed in order to perform additional logic.

//What is the difference between a checked and an unchecked exception?
//checked exceptions are checked at compile-time while unchecked exceptions are checked at runtime.

//What is the difference between the 'throw' and 'throws' keywords in Java?
//throws is used to declare an exception and throw is used to throw an exception
//Throw is used in the method body to throw an exception (to get handled later),
//and throws is used in method signature to declare the exceptions that can occur in the statements present in the method.