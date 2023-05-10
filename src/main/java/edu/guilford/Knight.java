package edu.guilford;

public class Knight extends Piece {

    // Constructor

    public Knight(int xpos, int ypos, boolean isWhite) {
        super(xpos, ypos, isWhite);
        this.type = "Knight";
        setPieceImage();
    }

}
