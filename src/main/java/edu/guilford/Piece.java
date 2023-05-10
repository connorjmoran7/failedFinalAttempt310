package edu.guilford;

import java.io.File;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Piece extends ImageView {

    // Attributes

    protected String type;
    protected boolean isWhite;
    protected int xpos, ypos;

    // Image attributes

    private Image image;
    private File imageLocation;

    // Empty Constructor
    public Piece() {
        super();
    }

    // Constructor (inherited by each subclass)
    public Piece(int xpos, int ypos, boolean isWhite) {
        super();
        this.xpos = xpos;
        this.ypos = ypos;
        this.isWhite = isWhite;
    }

    // Getters and Setters

    public String getType() {
        return type;
    }

    public boolean getIsWhite() {
        return isWhite;
    }

    public int getXpos() {
        return xpos;
    }

    public int getYpos() {
        return ypos;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setIsWhite(boolean isWhite) {
        this.isWhite = isWhite;
    }

    public void setXpos(int xpos) {
        this.xpos = xpos;
    }

    public void setYpos(int ypos) {
        this.ypos = ypos;
    }

    // Methods

    public void setPieceImage() {
        if (isWhite) {
            switch (type) {
                case "King":
                    imageLocation = new File(this.getClass().getResource("whiteKing.png").getPath());
                    image = new Image(imageLocation.toURI().toString());
                    break;
                case "Queen":
                    imageLocation = new File(this.getClass().getResource("whiteQueen.png").getPath());
                    image = new Image(imageLocation.toURI().toString());
                    break;
                case "Bishop":
                    imageLocation = new File(this.getClass().getResource("whiteBishop.png").getPath());
                    image = new Image(imageLocation.toURI().toString());
                    break;
                case "Knight":
                    imageLocation = new File(this.getClass().getResource("whiteKnight.png").getPath());
                    image = new Image(imageLocation.toURI().toString());
                    break;
                case "Rook":
                    imageLocation = new File(this.getClass().getResource("whiteRook.png").getPath());
                    image = new Image(imageLocation.toURI().toString());
                    break;
                case "Pawn":
                    imageLocation = new File(this.getClass().getResource("whitePawn.png").getPath());
                    image = new Image(imageLocation.toURI().toString());
                    break;
            }
        } else {
            switch (type) {
                case "King":
                    imageLocation = new File(this.getClass().getResource("blackKing.png").getPath());
                    image = new Image(imageLocation.toURI().toString());
                    break;
                case "Queen":
                    imageLocation = new File(this.getClass().getResource("blackQueen.png").getPath());
                    image = new Image(imageLocation.toURI().toString());
                    break;
                case "Bishop":
                    imageLocation = new File(this.getClass().getResource("blackBishop.png").getPath());
                    image = new Image(imageLocation.toURI().toString());
                    break;
                case "Knight":
                    imageLocation = new File(this.getClass().getResource("blackKnight.png").getPath());
                    image = new Image(imageLocation.toURI().toString());
                    break;
                case "Rook":
                    imageLocation = new File(this.getClass().getResource("blackRook.png").getPath());
                    image = new Image(imageLocation.toURI().toString());
                    break;
                case "Pawn":
                    imageLocation = new File(this.getClass().getResource("blackPawn.png").getPath());
                    image = new Image(imageLocation.toURI().toString());
                    break;
            }
        }
        setImage(image);
    }

}
