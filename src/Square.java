import java.awt.*;

/**
 * A class written to support the TicTacToe Game.
 *
 * Each Square object is one position of the TicTacToe
 * board. It maintains information on the marker, its
 * location on the board, and whether it is part
 * of the winning set.
 *
 * @author: Nandhini Namasivayam
 * @version: Jan 2023
 */

public class Square {
    // Instace Variables
    private String marker;
    private int row;
    private int col;
    private boolean isWinningSquare;
    private TicTacToeViewer a;
    private Image x;
    private Image o;

    /**
     * Constructor to initialize one Square of the
     * TicTacToe board
     * @param row the row the square is in
     * @param col the column the square is in
     */
    public Square(int row, int col, TicTacToeViewer a) {
        this.a = a;
        this.row = row;
        this.col = col;
        this.marker = TicTacToe.BLANK;
        this.isWinningSquare = false;
        x = a.getImages()[0];
        o =  a.getImages()[1];
    }

    /******************** Getters and Setters ********************/
    public String getMarker() {
        return this.marker;
    }

    public void setMarker(String marker) {
        this.marker = marker;
    }

    public void setWinningSquare() {
        this.isWinningSquare = true;
    }

    /**
     * Checks if the square has the BLANK marker
     * @return True if the square is empty, False otherwise
     */
    public boolean isEmpty() {
        return this.marker.equals(TicTacToe.BLANK);
    }

    /**
     * @return the marker for the square
     */
    public String toString() {
        return this.marker;
    }
    public void draw(Graphics g){
        // Find cordinates of the square
        int x_cord = a.X_OFFSET + (col * 120);
        int y_cord = a.Y_OFFSET + (row * 120);
        // Draw square
        if(this.isWinningSquare){
            g.setColor(Color.green);
            g.fillRect(x_cord, y_cord,120, 120);
        }
        else{
            g.setColor(Color.black);
            g.drawRect(x_cord, y_cord, 120,120);
        }
        // Checks for winning square and draws it green
        // Draws X or O if possible
        if(this.getMarker().equals("X")){
            g.drawImage(x, x_cord, y_cord, 120, 120, a);
        }
        else if(this.getMarker().equals("O")){
            g.drawImage(o, x_cord, y_cord, 120, 120, a);
        }
    }
}
