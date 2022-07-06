package rocks.zipcodewilmington.tictactoe;

/**
 * @author leon on 6/22/18.
 */
public class Board {
    Character[][] matrix;

    public Board(Character[][] matrix) {this.matrix=matrix;


    }

    public Boolean isInFavorOfX() {
        return getWinner().equals("X");
    }

    public Boolean isInFavorOfO() {
        return getWinner().equals("O");
    }

    public Boolean isTie() {
        return getWinner().equals("");
    }

    public String getWinner() {
        String winner="";
        for (int x =0;x<3;x++){
            if(matrix[x][0]==matrix[x][1] && matrix[x][0]==matrix[x][2]){
                winner=matrix[x][0].toString();
                break;
            } else if (matrix[0][x]==matrix[1][x] && matrix[0][x]==matrix[2][x]){
                winner=matrix[0][x].toString();
                break;
            }
        }
        if (matrix[0][0]==matrix[1][1] && matrix[0][0]==matrix[2][2]){
            winner=matrix[0][0].toString();
        } else if (matrix[2][0]==matrix[1][1] && matrix[2][0]==matrix[0][2]){
            winner=matrix[2][0].toString();
        }
        return winner;
    }

}
