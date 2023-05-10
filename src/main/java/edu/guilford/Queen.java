package edu.guilford;

public class Queen extends Piece {

    // Constructor

    public Queen(int xpos, int ypos, boolean isWhite) {
        super(xpos, ypos, isWhite);
        this.type = "Queen";
        setPieceImage();
    }

}
