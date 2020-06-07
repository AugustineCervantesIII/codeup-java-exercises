import java.util.Scanner;

public class Bob {
    public static void main(String[] args){
        //exercise 2
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Talk to Bob: ");
//        String userInput = sc.nextLine();
//        if(userInput.endsWith("?")){
//            System.out.println("Bob: Sure");
//        } else if(userInput.endsWith("!")){
//            System.out.println("Bob: Whoa, chill out!");
//        } else if(userInput.equals("")){
//            System.out.println("Bob: Fine be that way!");
//        } else if (userInput.equalsIgnoreCase("No")){
//            System.out.println("Bob: Why not?");
//        } else {
//            System.out.println("Bob: Whatever");
//        }


        //another example
        Scanner scan = new Scanner(System.in);

        boolean convo = true;
        do {
            System.out.println("Talk to Bobby Boucher");
            String input = scan.nextLine();
            if (input.endsWith("?")) {
                System.out.println("sure!");
            } else if (input.endsWith("!")) {
                System.out.println("Whoa, chill out!");
            } else if (input.isEmpty()) {
                System.out.println("Fine. Be that way!");
            } else if (input.equals("fine")) {
                convo = false;
            } else {
                System.out.println("Whatever!");
            }

        }while(convo);
    }
}
