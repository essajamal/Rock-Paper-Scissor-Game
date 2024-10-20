import java.util.Scanner;
import java.util.Random;

public class RPSGame{
    public static void main(String[] args){
        int userMove = userChoice();
        int computerMove = computerChoice();
        

        System.out.println(result(userMove, computerMove));
        System.out.println("The user move is: "+moveToString(userMove));
        System.out.println("The computer move is: "+moveToString(computerMove));

     }

    public static int userChoice(){
        Scanner scanner = new Scanner(System.in);

            System.out.println("Please type your move: ");
            String userMove = scanner.nextLine();

            userMove = userMove.toLowerCase(); 

            if(userMove.equals("rock")){
                return 0;
            }
            else if(userMove.equals("paper")){
                return 1;
            }
            else if(userMove.equals("scissor")){
                return 2;
            }
            else{
                System.out.println("You let computer win");
                return -1;
            }
            

    }
    public static int computerChoice(){
        Random random = new Random();
        int computerMove = random.nextInt(3);

        return computerMove;

     }
    public static String result(int userMove, int computerMove){
        if(userMove == computerMove){
            return "It's a Tie";
        }
        else if((userMove == 0 && computerMove == 2) ||
                (userMove == 1 && computerMove == 0) ||
                (userMove == 2 && computerMove == 1)){
            return "You win";
        }
        else{
            return "Computer win";
        }
    }
        public static String moveToString(int move){
            switch (move){
                case 0: return "rock";
                case 1: return "paper";
                case 2: return "scissor";
                default: return "Invalid Move";
            }
           


        
    }
}