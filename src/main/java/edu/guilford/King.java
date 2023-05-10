package edu.guilford;

public class King extends Piece {

    // Constructor

    public King(int xpos, int ypos, boolean isWhite) {
        super(xpos, ypos, isWhite);
        this.type = "King";
        setPieceImage();
    }

}
