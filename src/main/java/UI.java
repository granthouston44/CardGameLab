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

    public void cardsDealt(GameLogic game){
        System.out.println(String.format("Cards have been dealt!\n Dealers card: %s, %s", game.getDealerFirstCard().getSuit().toString(), game.getDealerFirstCard().getRank().toString()));
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


    public void score(GameLogic game) {
        System.out.println(String.format("Player score: \n %s: %d %s: %d \n Dealer score: %d", game.player1.getName(), game.getPlayer1Score(), game.player2.getName(), game.getPlayer2Score(), game.getDealerScore()));
    }
}

