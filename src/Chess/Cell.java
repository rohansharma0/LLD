package Chess;

import Chess.Piece.Piece;

public class Cell {
    Piece piece;
    int x;
    int y;
    boolean isActive;

    Cell(Piece piece , int x , int y , boolean isActive){
        this.piece = piece;
        this.x = x;
        this.y = y;
        this.isActive = isActive;
    }
    Cell(int x , int y){
        this.x = x;
        this.y = y;
        this.isActive = false;
    }
}
