package Chess;

import Chess.Piece.Piece;
import Chess.Piece.impl.Pawn;

import java.util.List;

public class Board {
    Cell[][] cells;

    Board(){
        initializeBoard();
    }

    private void initializeBoard() {
        cells = new Cell[8][8];
        for(int i = 0 ; i< 8 ; i++){
            for(int j = 0 ; j< 8 ; j++){
                if(i == 1){
                    Piece pawn = new Pawn();
                    cells[i][j] = new Cell(pawn , i , j , true);
                }else if(i == 6){
                    Piece pawn = new Pawn();
                    cells[i][j] = new Cell(pawn , i , j , true);
                }

                cells[i][j] = new Cell(i , j);
            }
        }
    }
}
