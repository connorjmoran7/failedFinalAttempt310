package edu.guilford;

public class Rook extends Piece {

    // Constructor

    public Rook(int xpos, int ypos, boolean isWhite) {
        super(xpos, ypos, isWhite);
        this.type = "Rook";
        setPieceImage();
    }

}
