import javax.swing.*;
import java.awt.*;

public class TicTacToeViewer extends JFrame {
    // TODO: Complete this class
    // Instance variables
    private Image[] images;
    private TicTacToe t;
    // Final Variables
    private final int TITLE_BAR_HEIGHT = 20;
    private final int WINDOW_WIDTH = 600;
    private final int WINDOW_HEIGHT = 600;
    public final int X_OFFSET = 120;
    public final int Y_OFFSET = 120;
    private final String title = "TicTacToe";
    public TicTacToeViewer(TicTacToe t){
        this.t = t;
        images = new Image[2];
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
        g.setColor(Color.white);
        g.fillRect(0, 0, WINDOW_WIDTH, WINDOW_HEIGHT);
        // Draw axes
        g.setColor(Color.black);
        g.drawRect(X_OFFSET, Y_OFFSET, 360, 360);
        g.setFont(new Font("Serif", Font.PLAIN, 30));
        g.drawString("0", 180, 80);
        g.drawString("1", 300, 80);
        g.drawString("2", 420, 80);
        g.drawString("0", 80, 180);
        g.drawString("1", 80, 300);
        g.drawString("2", 80, 420);
        // Draw Squares
        for(int i = 0; i < t.getBoard().length; i++){
            for(int j = 0; j < t.getBoard()[i].length;j++){
                t.getBoard()[i][j].draw(g);
            }
        }
        if(t.getGameOver()){
            g.setColor(Color.black);
            g.drawString(t.getMessage(), 300, 540);
        }
    }


    




}
