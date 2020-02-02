import java.util.Scanner;

public class UI {

    public void welcome(){
        System.out.println("Welcome to JavaJack!");
    }

    public String getPlayer1Name(){
        Scanner sc = new Scanner(System.in);
        System.out.println("\n Please Enter Player Name: ");
        String name = sc.nextLine();
        return name;
    }

    public String getPlayer2Name(){
        Scanner sc = new Scanner(System.in);
        System.out.println("\n Please Enter Player2 Name: ");
        String name = sc.nextLine();
        return name;
    }

    public void cardsDealt(){
        System.out.println("Cards have been dealt to each player!");
    }

    public void whoWins(Player player){
        System.out.println(String.format("%s wins!",player.getName()));
    }

    public boolean playAgain(){
        System.out.println("Play again?");
        System.out.println("Enter [Y/N]");
        Scanner sc = new Scanner(System.in);
        String choice = sc.nextLine();
        boolean choiceBoolean = false;
        if(choice.equals("y") )
        {
        choiceBoolean = true;
        }
        else if(choice.equals("n"))
        {
            choiceBoolean = false;
        }
        return choiceBoolean;
        }


    public void gameOver() {
        System.out.println("Thanks for playing!");
    }
}

