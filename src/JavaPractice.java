import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//import java.util.Scanner;

public class JavaPractice {
    public static void main(String[] args) throws IOException {
        Path myDirectory = Paths.get("src");
        Path myFile = Paths.get("src/grades","Student.java");
        Path gitignore = Paths.get(".gitignore");

        System.out.println(Files.exists(myDirectory));
        System.out.println(Files.exists(myFile));
        System.out.println(Files.notExists(gitignore));

        String directory = "test";
        Path myTest = Paths.get(directory);// ("src", directory) this is to specify inside src folder.
        Path helloFile = Paths.get("test", "hello.txt");//

        if (Files.notExists(myTest)) {
            try {
                Files.createDirectory(myTest);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        if (Files.notExists(helloFile)) {
            try {
                Files.createFile(helloFile);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        //write to hello.txt
        String[] names = {"austin", "betty", "cate", "dan"};
        List<String> letters = Arrays.asList(names);

        List<String> students = new ArrayList<>(); //overwrites and is blank
        //adding to "students" will rerun and add the added names to hello.txt
//        students.add("jane");
//        students.add("max");
//        students.add("ann");
//        students.add("bucky");
//        try{
//            Files.write(helloFile, students);// changed from letters to students and rewrote hello.txt to blank.
//        }catch (IOException e){
//            e.printStackTrace();
//        }

        //enhanced for loop
        try {
            List<String> myStudents = Files.readAllLines(helloFile);
            System.out.println(myStudents);
        } catch (IOException e) {
            e.printStackTrace();
        }


        List<String> myStudents = Files.readAllLines(helloFile);
        for(String student : myStudents){
            System.out.println(student);
        }

        String newStudent = "alex";
        List<String> newStudents = Arrays.asList("alex", "julia", "brook", "genesis", "peter");
        Files.write(helloFile, newStudents, StandardOpenOption.APPEND);

        List<String> newClass = new ArrayList<>();
        for(String student : myStudents){
            if(student.equals("brook")){
                newClass.add("shelby");
                continue;
            }
            newClass.add(student);
        }
        Files.write(helloFile, newClass);
        System.out.println(newClass);

//        System.out.println("Hello\nAugustine Cervantes");
//        System.out.println(74 + 36);
//        System.out.println(50 / 3);
//        System.out.println(-5 + 8 * 6);
//        System.out.println((55 + 9) % 9);
//        System.out.println(20 + -3 * 5 / 8);
//        System.out.println(5 + 15 / 3 * 2 - 8 % 3);
//
//        Scanner in = new Scanner(System.in);
//        int num1 = in.nextInt();
//        int num2 = in.nextInt();
//        System.out.println("enter first number: ");
//        System.out.println("enter second number: ");
//        System.out.println("");
//    }
    }
}
