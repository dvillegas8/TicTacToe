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
        this.row = row;
        this.col = col;
        this.marker = TicTacToe.BLANK;
        this.isWinningSquare = false;
        this.a = a;
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
        // Draw square
        g.drawRect(a.x, a.y, 100,100);
        // Checks for winning square and draws it green
        if(this.isWinningSquare){
            g.setColor(Color.green);
            g.fillRect(a.x, a.y,100, 100);
        }
        // Draws X or O if possible
        if(this.getMarker().equals("X")){
            g.drawImage(x, )
        }

    }
}
