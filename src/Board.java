package board;

public class Board {
  public  int size;
   public  char matrix[][];
    public Board(int n,char symbol){
        this.size=n;
        matrix=new char[size][size];
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                matrix[i][j]=symbol;
            }
        }
    }
    public void setdefaultsymbol(char symbol){
        int n=this.size;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                matrix[i][j]=symbol;
            }
        }
    }
    public void printboard(){
        int sz=this.size;
        for(int i=0;i<sz;i++){
            for(int j=0;j<sz;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }

    
}
