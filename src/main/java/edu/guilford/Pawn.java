package edu.guilford;

public class Pawn extends Piece {

    // Constructor

    public Pawn(int xpos, int ypos, boolean isWhite) {
        super(xpos, ypos, isWhite);
        this.type = "Pawn";
        setPieceImage();
    }

}
