package com.percyvega.game;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MovingObjectWithBackground extends JPanel implements ActionListener {

    private Image backgroundImage;
    private Image movingObjectImage;
    private int objectX;
    private int objectY;
    private Timer timer;

    public MovingObjectWithBackground() {
        // Load images (replace with your actual image paths)
        String backgroundPath = this.getClass().getClassLoader().getResource("background.jpg").getFile().toString();
        backgroundImage = new ImageIcon(backgroundPath).getImage();
        String movingObjectPath = this.getClass().getClassLoader().getResource("movingObject.png").getFile().toString();
        movingObjectImage = new ImageIcon(movingObjectPath).getImage();

        // Initial position of the moving object
        objectX = 0;
        objectY = 200; // Example Y position

        // Create a Timer that fires every 50 milliseconds (adjust for desired speed)
        timer = new Timer(10, this);
        timer.start();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        // Draw the background image
        g.drawImage(backgroundImage, 0, 0, getWidth(), getHeight(), this);
        // Draw the moving object image
        g.drawImage(movingObjectImage, objectX, objectY, this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Update the object's position for slow movement
        objectX += 1; // Move 1 pixel to the right on each tick

        // If the object goes off-screen, reset its position
        if (objectX > getWidth()) {
            objectX = -movingObjectImage.getWidth(this); // Reset to off-screen left
        }

        // Request a repaint to show the updated position
        repaint();
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Moving Object Example");
        MovingObjectWithBackground panel = new MovingObjectWithBackground();
        frame.add(panel);
        frame.setSize(800, 600); // Set frame size
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
