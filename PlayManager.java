package Tetris;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

public class PlayManager {
    final int WIDTH = 360;
    final int HEIGHT = 600;
    public static int left_x;
    public static int right_x;
    public static int top_y;
    public static int bottom_y;

    // Mino
    final int MINO_START_X;
    final int MINO_START_Y;
    
    public PlayManager() {
        // Main Play Area Frame
        left_x = (Panel.WIDTH / 2) - (WIDTH / 2);
        right_x = left_x + WIDTH;
        top_y = 50;
        bottom_y = top_y + HEIGHT;
        MINO_START_X = left_x + (WIDTH/2) - Block.SIZE;
        MINO_START_Y = top_y + Block.SIZE;
    }

    public void update() {

    }

    public void draw(Graphics2D g2) {
        // Draw Play Area Frame
        g2.setColor(Color.white);
        g2.setStroke(new BasicStroke(3f));
        g2.drawRect(left_x - 3, top_y - 3, WIDTH + 6, HEIGHT + 6);
        // Draw next Mino Frame
        g2.drawRect(860, 120, 200, 200);
        g2.setFont(new Font("Arial", Font.PLAIN, 25));
        g2.setColor(Color.black);
        g2.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
        g2.drawString("NEXT", 930, 150);

    }
}
