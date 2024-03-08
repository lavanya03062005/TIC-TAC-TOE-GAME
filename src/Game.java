package game;
//player details
//Board
//turn variable-allow us to know which player turn it is
//variable to keep track of no of moves
//boolean variable gameover
import player.Player;
import board.Board;
import java.util.Scanner;
public class Game {
     Player []players;
     Board board;
     int turn;
     int noofmoves;
     boolean gameover;
     String zero;
     String cross;


public Game(Player []players,Board board){
    this.players=players;
    this.board=board;
    this.turn=0;
    this.noofmoves=0;
    this.gameover=false;

    StringBuilder z=new StringBuilder();
    StringBuilder c=new StringBuilder();
    for(int i=0;i<board.size;i++){
        z.append('O');
        c.append('X');
    }
    this.zero=z.toString();
    this.cross=c.toString();

}
public void printboard(){
    int sz=this.board.size;
    for(int i=0;i<sz;i++){
        for(int j=0;j<sz;j++){
            System.out.print(board.matrix[i][j]+" ");
        }
        System.out.println();
    }
}
public void play(){
    printboard();
    int sz=board.size;
    while(!gameover){
        noofmoves++;
        int idx=getIndex();

        int row=idx/sz;
        int col=idx%sz;

        board.matrix[row][col]=players[turn].getplayersymbol();
        if(noofmoves>=sz*sz){
            System.out.println("Game draw");
            return;
        }
        if(noofmoves>=2*sz-1 && checkCombinations() == true ){
        gameover=true;
        printboard();
        System.out.println("Winner is : "+players[turn].getplayername());
        return;
        }
        turn=(turn+1)%2;
        printboard();
    }
}
public int getIndex(){
    while(true){
System.out.println("player : "+players[turn].getplayername()+" enter one position");
Scanner sc=new Scanner(System.in);
int pos=sc.nextInt()-1;
int sz=board.size;
int row=pos/sz;
int col=pos%sz;
if(row<0 || row>=sz || col>=sz || col<0){
    System.out.println("Invalid position");
    continue;
}
if(board.matrix[row][col]!='-'){
    System.out.println("position already occupied");
    continue;
}
     return pos;
    }
}
public boolean checkCombinations(){
    int sz=board.size;
    //row wise
    for(int i=0;i<sz;i++){
        StringBuilder sb=new StringBuilder();
        for(int j=0;j<sz;j++){
            sb.append(board.matrix[i][j]);
        }
        String pattern=sb.toString();
        if(pattern.equals(zero) || pattern.equals(cross)){
        return true;
        }
    }
    //column wise
    for(int i=0;i<sz;i++){
        StringBuilder sb=new StringBuilder();
        for(int j=0;j<sz;j++){
            sb.append(board.matrix[j][i]);
        }
    String  pattern=sb.toString();
        if(pattern.equals(zero) || pattern.equals(cross)){
        return true;
        }
    }
    //diagonal
    int i=0;
    int j=0;
    StringBuilder sb=new StringBuilder();
    while(i<sz){
        sb.append(board.matrix[i][j]);
        i++;
        j++;
          }
         String pattern = sb.toString();
         if(pattern.equals(zero) || pattern.equals(cross))
         return true;
  //anti diagonal
  i=0;
  j=sz-1;
  sb=new StringBuilder();
  while(i<sz){
sb.append(board.matrix[i][j]);
i++;
j--;
  }
 pattern = sb.toString();
 if(pattern.equals(zero) || pattern.equals(cross))
 return true;

 return false;

}
}

