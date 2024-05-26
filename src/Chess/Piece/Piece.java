package Chess.Piece;

public abstract class Piece {
    public PieceType type;
    public abstract void isMoveValid();

//    Piece(PieceType type){
//        this.type = type;
//    }
}
