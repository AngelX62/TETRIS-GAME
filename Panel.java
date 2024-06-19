package Tetris;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

public class Panel extends JPanel implements Runnable {
    
    public static final int WIDTH = 1280;
    public static final int HEIGHT = 720;
    final int FPS = 60;
    Thread gameThread;
    PlayManager pm;

    public Panel() {
        // Panel Settings
        this.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        this.setBackground(new Color(0x8400d6));
        this.setLayout(null);
        // Initialize PlayManager
        pm = new PlayManager();
    }
    // Thread allows a program to operate more efficiently by doing multiple things at the same time
    // Method to launch game by activating thread
    public void gameLaunch() {
        gameThread = new Thread(this);
        gameThread.start();
    }
    @Override
    public void run() {

        double drawInterval = 100000000/FPS;
        double delta = 0;
        long lastTime = System.nanoTime();
        long currentTime;
        
        while(gameThread != null) {
            currentTime = System.nanoTime();
            delta += (currentTime - lastTime) / drawInterval;
            lastTime = currentTime;

            if(delta >=1) {
                update();
                repaint();
                delta--;
            }
        }
    }

    public void update() {
        pm.update();
    }
    // Standard method to draw things on JPanel (Graphis to draw objects)
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D)g;
        pm.draw(g2);
    }
}
