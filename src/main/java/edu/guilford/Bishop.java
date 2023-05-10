package edu.guilford;

public class Bishop extends Piece {

    // Constructor

    public Bishop(int xpos, int ypos, boolean isWhite) {
        super(xpos, ypos, isWhite);
        this.type = "Bishop";
        setPieceImage();
    }

}
