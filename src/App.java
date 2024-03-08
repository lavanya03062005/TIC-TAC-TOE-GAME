import board.Board;
import player.Player;
import game.Game;
//import java.util.Scanner;
//importing Board class from board package

public class App {
    public App(){

    }
    public static void main(String[] args) throws Exception {
        System.out.println("project 1 -->TIC TAC TOE");
       // Scanner scn=new Scanner(System.in);
        Board b=new Board(5,'-');
        b.printboard();
        Player p1=new Player();
        p1.setplayernamesymbol("lavanya",'X');
        p1.getplayernamesymbol();
        Player p2=new Player();
       System.out.println("enter player name and symbol");
       // String name=scn.nextLine();
       // char symbol=scn.next().charAt(0);
        p2.setplayernamesymbol("nithish",'O');
        p2.getplayernamesymbol();
        Game game=new Game(new Player[] {p1,p2},b);
        game.play();

    }
}
