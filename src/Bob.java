import java.util.Scanner;

public class Bob {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Talk to Bob: ");
        String userInput = sc.nextLine();
        if(userInput.endsWith("?")){
            System.out.println("Bob: Sure");
        } else if(userInput.endsWith("!")){
            System.out.println("Bob: Whoa, chill out!");
        } else if(userInput.equals("")){
            System.out.println("Bob: Fine be that way!");
        } else if (userInput.equalsIgnoreCase("No")){
            System.out.println("Bob: Why not?");
        } else {
            System.out.println("Bob: Whatever");
        }
    }
}
