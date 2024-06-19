package Tetris;

import javax.swing.JFrame;

public class Main {
    public static void main(String[] args) {
        JFrame window = new JFrame("Tetris");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setResizable(false);

        // Add panel to window
        Panel pl = new Panel();
        window.add(pl);
        window.pack();
        window.setLocationRelativeTo(null);
        window.setVisible(true);

       
    }
}
