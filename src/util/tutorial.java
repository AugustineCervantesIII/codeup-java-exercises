
//JAVA

//EDITIONS
//Java SE is standard edition
//containing core functionality of the java language
//provides facilities for networking, security, database access,
// graphical user interface(gui) development, and xml parsing - a way to access or modify data in an XML document

//includes java virtual machine (JVM)
//development + development tools

//Java EE is enterprise edition
//facilities for building large scale enterprise level applications
//contains servlets, jsp(java server pages), and jdbc(java database connection) libraries

//                     JDK - JAVA DEVELOPMENT KIT - NEEDED TO CREATE AND BUILD JAVA APPLICATIONS
//                      /\                  /\
//                      /                    \
//                     /                      \
//JRE- JAVA RUNTIME ENVIRONMENT            DEVELOPMENT TOOLS
//JVM - JAVA VIRTUAL MACHINE                COMPILER, JAR BUILDER, DOCUMENTATION
//LIBRARIES AND FILES FOR RUNTIME
//JRE NEEDED TO RUN JAVA APPLICATIONS

//ALTHOUGH THE SYNTAX IS SIMILAR, JAVA IS COMPILED WHILE JAVASCRIPT IS INTERPRETED
//JAVA IS STATICALLY TYPES AND JAVASCRIPT IS DYNAMICALLY TYPED
//BOTH HAVE OBJECTS BUT JAVA DEFINES AND USES OBJECTS IN DIFFERENT WAYS
//JAVASCRIPT RUNS IN THE BROWSER AND JAVA RUNS ALMOST EVERYWHERE

//PROGRAMMER -> writes code -> .JAVA FILE -> input -> COMPILER
//                                                       \/
                   //                                .CLASS FILE -> runs on -> JAVA VIRTUAL MACHINE(JVM) -> runs on -> OPERATING SYSTEM

//IDE - INTEGRATED DEVELOPMENT ENVIRONMENT - HEPS PROGRAMMERS WRITE CODE AND BUILD PROJECTS




package util;
import java.sql.SQLOutput;
import java.util.*;

public class tutorial {

    public static void main(String[] args){
        // the 8 primitive data types, not changeable
        //byte - for very short integers from -127 to 127
        //short - short integers from -32,768 to 32,767
        //int - integer for any number that has no decimal values
        //long - for long integers in the 9.2 million value
        //float - Single-precision, floating-point numbers from -3.4E38 to 3.4E38 with up to 7 significant digits
        //double - Double-precision, floating-point numbers from -1.7E308 to 1.7E308 with up to 16 significant digits
        //char - A single Unicode character that’s stored in two bytes, a single character in quotes like 'b' or '3'
        //boolean - for true or false values



//        int myAge = 30;
//        System.out.println("Hello i am " + myAge + " years old.");
//        boolean isItSummer = true;
//        System.out.println("true of false: It is currently summer - " + isItSummer);
//
//        double pi = 3.14;
//        System.out.println("the number of pi is " + pi + ".");
//
//        char a = 'A';
//        System.out.println("the first letter in my name is " + a + ".");
//
//        int cat = myAge;
//        System.out.println("int cat is equal to " + cat + ". And int myAge is equal to " + myAge + ".");
//
//        String lilGuy = "little guy is an good boy";
//        System.out.println(lilGuy);
//
//        //Operations
//        //+ addition
//        //- subtraction
//        //* multiplication
//        // / division
//        // % modulus
//
//        int x = 76;
//        int y = 47;
//        int c = 98;
//        double sum = y * c;
//        double g = Math.pow(c, y);
//        System.out.println(sum);
//        System.out.println(g);
//
//        //if 98 / 47 = 2.08510638, int will show only 2 but double shows 2.0
//        //int t = c / y
//        int t = c / y;
//        System.out.println(t);
//
//        //modulus is how many is left after a number fits into it,
//        // so 47 * 2 = 94 and 4 id the remainder to reach 98 so it will print 4
//        int f = c % y;
//        System.out.println(f);

        //Unary Operators
        //++ increment
        //-- decrement
        //+ positive sign
        //- negative sign


        //Input and Scanners
        //import tool needed to use scanner: "import java.util.Scanner;" this is used to get input

        //setup a scanner object
//        Scanner sc = new Scanner(System.in);
//        //sc.next() is for a string input
//        String scanned = sc.next();
//        System.out.println(scanned);

        //this is to get a boolean
//        Scanner scanner = new Scanner(System.in);
//        boolean scan = sc.nextBoolean();
//        System.out.println(scan);

        //this is to get a double, if input is 6.0
        //double scanned = sc.nextDouble();
        //System.out.println(scanned)

        //to convert string to integer
//        int x = Integer.parseInt(scanned);
//        System.out.println(x);

        //Conditions and Booleans
        //comparison operators
        //> greater than
        //< less than
        //>= greater than or equal to
        //<= less than or equal to
        //== is equal to
        //=== same type and value
        //!= not equal to
        //&& to compare another operation
        //|| means or
        //! means not
//        int e = 6;
//        int j = 23;
//        int i = 10;
//        boolean compare = (e > j && j > i) || (i + 2 < 5 || j + 7 > j);
//        System.out.println(compare);

        //IF / ELSE / ELSE IF

        //if the user input is tim
//        Scanner sc = new Scanner(System.in);
//        String s = sc.nextLine();
//
//        if(s.equals("tim")){
//            System.out.println("You typed tim");
//        } else if (s.equals("hello")){
//            //else if will print back at ya if user input is hello
//            System.out.println("hi");
//        } else {
//            //else will print "you didnt type anything" if the user input is not tim
//            System.out.println("you didnt type anything");
//        }
        //this print statement is outside of the if and will print out after the if statement
//        System.out.println("print");

//        System.out.print("How old are you ");
//        Scanner sc = new Scanner(System.in);
//        String s = sc.nextLine();
//        int age = Integer.parseInt(s);
//
//        if(age >= 18) {
//            System.out.println("what is your favorite: ");
//            String food = sc.nextLine();
//            if (food.equals("pizza")){
//                System.out.println("I like pizza too");
//            } else {
//                System.out.println("cool, that sounds interesting");
//            }
//
//        } else if (age >= 0){
//            System.out.println("you are not old enough");
//        } else {
//            System.out.println("didnt put a valid age");
//        }

        //ARRAYS - a collection of element of a set size

        //declare type[] newArr = new type[how long the array is, a set length]
//        int[] newArr = new int[5];

//        String[] newArr = new String[7];
//        //an array of 5 but a total index of 4 with the first item starting at zero
////        {"hi", "bye", "java", "codeup", "coding"}
//        newArr[0] = "hi";
//        newArr[1] = "bye";
//        newArr[2] = "java";
//        newArr[3] = "codeup";
//        newArr[4] = "coding";
//        String x = newArr[2];
//        System.out.println(x);
//
//        int[] nums = {2, 3, 4, 5, 6};
//        int y = nums[3];
//        System.out.println(y);

        //FOR LOOPS - HOW MANY TIMES TO PERFORM A CONDITION
        //syntax
        //0 is less than or equal to ten; increment i, i+=1.
//        for(int i = 0; i <= 10; i++){
//            //will print number until i is < or equal to 10 stopping at 10;
//            System.out.println(i);
//        }
//
//        int[] arr = {1, 2, 3, 4, 5, 6};
//        for(int i = 0; i < arr.length; i++){
//            if(arr[i] == 6) {
//                System.out.println("found a 6 at index " + i);
//            }
//        }

        for(int i = 1; i <= 100; i++){
            if(i % 3 == 0 && i % 5 == 0){
                System.out.println("Fizz Buzz");
            } else if(i % 3 == 0){
                System.out.println("Fizz");
            } else if(i % 5 == 0){
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }

        //FOR EACH LOOP
//        int[] arr = {2, 4, 6, 8, 10, 12, 14, 16, 18};
//
//        int count = 0;// this is to count the index
//        for(int element : arr){
//            System.out.println(element + " index of " + count);
//            count++;
//        }

//        String[] fruit = new String[4];
//            Scanner sc = new Scanner(System.in);
//        for(int i = 0; i < fruit.length; i++){
//            System.out.print("what fruit do you like: ");
//            String input = sc.nextLine();
//            fruit[i] = input;
//        }
//            //break; - this breaks out of the look
//        //this will print the inputs
//        for (String f : fruit){
//            System.out.println(f);
////            if(f.equals("oranges")){
////                break;
////            }
//        }

        //WHILE LOOPS
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Type a number counting to 10: ");
//        int x = sc.nextInt();
//
//        while(x != 10){
//            System.out.println("keep going: ");
//            x = sc.nextInt();
//        }
//        System.out.println("you have reached 10");


        //DO WHILE - do something while "this" is true
//        int y;
//        do{
//            System.out.println("type a number counting to 4: ");
//            y = sc.nextInt();
//        } while(y != 4);
//        System.out.println("you have reached 4");



        //SETS and LISTS
        //set is a collection of unique unordered elements
//        Set<Integer> t = new HashSet<Integer>();
//        t.add(-30);
//        t.add(20);
//        t.add(15);
//        t.add(10);
//        t.add(-35);
//        System.out.println(t);
//        //this will remove 10 from the collection and make the boolean false
//        t.remove(10);
//
//        boolean q = t.isEmpty();
//        System.out.println("is this set empty: " + q);
//
//        int b = t.size();
//        System.out.println("how many in this collection: " + b);
//
//
//        boolean x = t.contains(10);
//
//        System.out.println("does this set contain the number 10: " + x);

        //TreeSet prints the collection in order
//                TreeSet<Integer> t = new TreeSet<Integer>();
//        t.add(-30);
//        t.add(20);
//        t.add(15);
//        t.add(10);
//        t.add(-35);
//        System.out.println(t);
//        //this will remove 10 from the collection and make the boolean false
//        t.remove(10);
//
//        boolean q = t.isEmpty();
//        System.out.println("is this set empty: " + q);
//
//        int b = t.size();
//        System.out.println("how many in this collection: " + b);
//
//
//        boolean x = t.contains(10);
//
//        System.out.println("does this set contain the number 10: " + x);

        //LIST
//        ArrayList<Integer> b = new ArrayList<>();
//        b.add(1);
//        b.add(15);
//        b.add(4);
//        b.add(21);
//        System.out.println(b);
//        b.set(0, 12); //changes an existing index .set(index, replacement);
//        System.out.println(b);
//
//        b.subList(1, 3);//shows list starting and ending so this should show 15, and 4
//        System.out.println(b.subList(1, 3));
//
//        int x = b.get(3);
//        System.out.println(x);

        //MAPS AND HASHMAPS AKA JAVA MAPS - a key value pair indexed by keys and cannot two of the same keys but can have two of the same value
//        Map m = new HashMap();
//        //key and its value
//        //cannot two of the same keys but can have two of the same value
//        m.put("bob", 5);
//        m.put("bill", "will");
//        m.put(1, 20);
//        m.put(2, 20);
//        System.out.println(m);
//        //shows the value of bob if m has bob
//        System.out.println(m.get("bob"));
//
//        //prints true or false if the m contains a key of 5 and again if m has a value of will
//        System.out.println(m.containsKey(5));
//        System.out.println(m.containsValue("will"));
//
//        System.out.println(m.values());//prints the values in the map
//        System.out.println(m.keySet());//prints the keys in the map
//
//        m.clear();//clears the map
//        System.out.println(m);
//
//        System.out.println(m.isEmpty());//true or false if the map is empty


//        Map m = new HashMap();
//        String str = "Hello i am practicing java";
//
//        for(char x : str.toCharArray()){
//            if (m.containsKey(x)){
//                int old = (int) m.get(x);
//                m.put(x, old + 1);
//            } else {
//                m.put(x, 1);
//            }
//        }
//        System.out.println(m);
//        System.out.println(m.remove(' '));
//        System.out.println(m);//removed the empty key

//        int[] numbers = {-12, -66, 47, 20, 0, 123};
//
//        //Arrays.sort(numbers);this sorts the entire list
//        Arrays.sort(numbers, 0, 2);//sorts the numbers between index start to index end
//
//        for(int i : numbers){
//            System.out.print(i + ",");
//        }






        }
    }
