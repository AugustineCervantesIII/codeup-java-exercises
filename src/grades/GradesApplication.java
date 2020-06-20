package grades;
import java.util.HashMap;
import java.util.Scanner;
import util.Input;

public class GradesApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Input input= new Input();
        boolean useranswer;


        Student michael = new Student("Michael");
        michael.addGrade(100);
        michael.addGrade(100);
        michael.addGrade(100);


        Student gabriel = new Student("Gabriel");
        gabriel.addGrade(80);
        gabriel.addGrade(90);
        gabriel.addGrade(95);

        Student lucifer = new Student("Lucifer");
        lucifer.addGrade(80);
        lucifer.addGrade(85);
        lucifer.addGrade(90);


        Student adam = new Student("Adam");
        adam.addGrade(80);
        adam.addGrade(88);
        adam.addGrade(98);

        Student nullstudent = new Student("there is no student that exist with that username");


        HashMap<String,Student> students = new HashMap<>();

//                      keys           values
        students.put("Michealarch01", michael);
        students.put("Gabrielarch03", gabriel);
        students.put("luciferarch2", lucifer);
        students.put("adamhuman01", adam);

//        commandline interface
        System.out.println("Here are the Github usernames of our students:");

        for (String username : students.keySet()) {
            System.out.printf(" | %s | ", username);
        }

//    do while loop
        do {
            System.out.println("\nWhat student would you like to see more information on?");
            String userInput = scanner.nextLine();
            String answer = (students.getOrDefault(userInput, nullstudent).getName());
            System.out.println("Students name is: " + answer);

            for (Student student : students.values()) {
                if (answer.equals(student.getName())) {
                    System.out.println("this is their grade average: \n" + student.getGradeAverage());
                    System.out.println("List of this Students Grades:");
                    for(Integer grade:student.getGrades()){
                        System.out.println( grade);
                    }
                }
            }

            System.out.println("Would you like to continue? yes/no");
            useranswer = input.yesNo();

        }while(useranswer);


        //    prints all all the Students names and Grades
        System.out.println("would you like to see a list of all the students Grades?");
        boolean userInput = input.yesNo();

        if(userInput = true) {

            for (Student student : students.values()) {
                System.out.println("\n Student name is: " + student.getName());

                System.out.println("their list of Grades is: ");
                for (Integer grade : student.getGrades()) { System.out.println(grade); }
            }
        }

        else { System.out.println("no problem"); }

    }
}
