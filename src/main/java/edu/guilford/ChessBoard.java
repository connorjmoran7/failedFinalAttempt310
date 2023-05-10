package edu.guilford;

import java.util.ArrayList;

import javafx.scene.layout.Border;
import javafx.scene.layout.BorderStroke;
import javafx.scene.layout.BorderStrokeStyle;
import javafx.scene.layout.BorderWidths;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;

public class ChessBoard extends GridPane {

    // Attributes

    final int SQUARE_SIZE = 60;

    private ArrayList<Square> squares = new ArrayList<Square>();

    // Constructor

    public ChessBoard() {
        makeBoard();
    }

    // Getters and Setters

    private void makeBoard() {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                Square square = new Square(i, j);
                square.setName("Square" + i + j);
                square.setPrefHeight(SQUARE_SIZE); // This can be altered to make the board bigger or smaller
                square.setPrefWidth(SQUARE_SIZE);
                square.setBorder(new Border(new BorderStroke(Color.BLACK,
                        BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));
                add(square, i, j, 1, 1);
                squares.add(square);
                // Set the squares to alternate colors (green and white/gray) - this can be
                // changed to any colors
                if (i % 2 == 0) {
                    if (j % 2 == 0) {
                        square.setStyle("-fx-background-color: #eeeed2");
                    } else {
                        square.setStyle("-fx-background-color: #769656");
                    }
                } else {
                    if (j % 2 == 0) {
                        square.setStyle("-fx-background-color: #769656");
                    } else {
                        square.setStyle("-fx-background-color: #eeeed2");
                    }
                }
            }
        }
        addPieces();
    }

    // Method to add a single piece to the board based on the square and piece

    public void addPiece(Square square, Piece piece) {
        square.getChildren().add(piece);
        square.occupied = true;
    }

    // Method to add all the pieces to the board using the addPiece method

    public void addPieces() {
        // Adding pawns (a row of white on the 7th row and a row of black on the 2nd
        // row)
        for (int i = 0; i < 8; i++) {
            Pawn whitePawn = new Pawn(6, i, true);
            Pawn blackPawn = new Pawn(1, i, false);
            addPiece(squares.get(whitePawn.getYpos() * 8 + whitePawn.getXpos()), whitePawn);
            addPiece(squares.get(blackPawn.getYpos() * 8 + blackPawn.getXpos()), blackPawn);
        }
        // Adding rooks (one in each corner)
        Rook whiteRook1 = new Rook(7, 0, true);
        Rook whiteRook2 = new Rook(7, 7, true);
        Rook blackRook1 = new Rook(0, 0, false);
        Rook blackRook2 = new Rook(0, 7, false);
        addPiece(squares.get(whiteRook1.getYpos() * 8 + whiteRook1.getXpos()), whiteRook1);
        addPiece(squares.get(whiteRook2.getYpos() * 8 + whiteRook2.getXpos()), whiteRook2);
        addPiece(squares.get(blackRook1.getYpos() * 8 + blackRook1.getXpos()), blackRook1);
        addPiece(squares.get(blackRook2.getYpos() * 8 + blackRook2.getXpos()), blackRook2);
        // Adding knights (one next to each rook)
        Knight whiteKnight1 = new Knight(7, 1, true);
        Knight whiteKnight2 = new Knight(7, 6, true);
        Knight blackKnight1 = new Knight(0, 1, false);
        Knight blackKnight2 = new Knight(0, 6, false);
        addPiece(squares.get(whiteKnight1.getYpos() * 8 + whiteKnight1.getXpos()), whiteKnight1);
        addPiece(squares.get(whiteKnight2.getYpos() * 8 + whiteKnight2.getXpos()), whiteKnight2);
        addPiece(squares.get(blackKnight1.getYpos() * 8 + blackKnight1.getXpos()), blackKnight1);
        addPiece(squares.get(blackKnight2.getYpos() * 8 + blackKnight2.getXpos()), blackKnight2);
        // Adding bishops (one next to each knight)
        Bishop whiteBishop1 = new Bishop(7, 2, true);
        Bishop whiteBishop2 = new Bishop(7, 5, true);
        Bishop blackBishop1 = new Bishop(0, 2, false);
        Bishop blackBishop2 = new Bishop(0, 5, false);
        addPiece(squares.get(whiteBishop1.getYpos() * 8 + whiteBishop1.getXpos()), whiteBishop1);
        addPiece(squares.get(whiteBishop2.getYpos() * 8 + whiteBishop2.getXpos()), whiteBishop2);
        addPiece(squares.get(blackBishop1.getYpos() * 8 + blackBishop1.getXpos()), blackBishop1);
        addPiece(squares.get(blackBishop2.getYpos() * 8 + blackBishop2.getXpos()), blackBishop2);
        // Adding queens (one next to each bishop)
        Queen whiteQueen = new Queen(7, 3, true);
        Queen blackQueen = new Queen(0, 3, false);
        addPiece(squares.get(whiteQueen.getYpos() * 8 + whiteQueen.getXpos()), whiteQueen);
        addPiece(squares.get(blackQueen.getYpos() * 8 + blackQueen.getXpos()), blackQueen);
        // Adding kings (one next to each queen)
        King whiteKing = new King(7, 4, true);
        King blackKing = new King(0, 4, false);
        addPiece(squares.get(whiteKing.getYpos() * 8 + whiteKing.getXpos()), whiteKing);
        addPiece(squares.get(blackKing.getYpos() * 8 + blackKing.getXpos()), blackKing);
    }

}
