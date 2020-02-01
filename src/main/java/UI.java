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

}

