import javax.swing.*;
import java.awt.*;

public class TicTacToeViewer extends JFrame {
    // TODO: Complete this class
    // Instance variables
    public int x;
    public int y;
    private Image[] images;
    private TicTacToe t;
    // Final Variables
    private final int TITLE_BAR_HEIGHT = 20;
    private final int WINDOW_WIDTH = 600;
    private final int WINDOW_HEIGHT = 600;
    private final int X_OFFSET = 40;
    private final int Y_OFFSET = 60 + TITLE_BAR_HEIGHT;
    private final String title = "TicTacToe";
    public TicTacToeViewer(TicTacToe t){
        this.t = t;
        x = 0;
        y = 0;
        images[0] = new ImageIcon("Resources/X.png").getImage();
        images[1] = new ImageIcon("Resources/O.png").getImage();
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setTitle(title);
        this.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        this.setVisible(true);
    }
    public Image[] getImages() {
        return images;
    }
    public void paint(Graphics g){
        // Clear the window.
        x += X_OFFSET;
        y += Y_OFFSET;
        g.setColor(Color.white);
        g.fillRect(0, 0, WINDOW_WIDTH, WINDOW_HEIGHT);
        // Draw axes
        g.setColor(Color.black);
        g.drawRect(X_OFFSET, Y_OFFSET, 300, 300);
        // Draw Squares
        for(int i = 0; i < t.getBoard().length; i++){
            for(int j = 0; j < t.getBoard()[i].length;j++){
                g.drawRect(x, y, x + 100,y + 100);
                x += 100;
                y += 100;
            }

        }
    }


    




}
