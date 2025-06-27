package com.questions.mid;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class SnakeGame extends JPanel implements ActionListener, KeyListener {
    static final int WIDTH = 600;
    static final int HEIGHT = 600;
    static final int UNIT = 25;
    static final int GAME_UNITS = (WIDTH * HEIGHT) / (UNIT * UNIT);
    static final int DELAY = 100;

    final int x[] = new int[GAME_UNITS];
    final int y[] = new int[GAME_UNITS];
    int bodyParts = 6;
    int applesEaten;
    int appleX;
    int appleY;
    char direction = 'R';
    boolean running = false;
    Timer timer;
    Random random;

    JButton restartButton = new JButton("Restart");

    public SnakeGame() {
        random = new Random();
        this.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        this.setBackground(Color.black);
        this.setFocusable(true);
        this.addKeyListener(this);
        setLayout(null);

        restartButton.setBounds(WIDTH / 2 - 60, HEIGHT / 2 - 20, 120, 40);
        restartButton.addActionListener(e -> restartGame());
        restartButton.setVisible(false);
        this.add(restartButton);

        startGame();
    }

    public void startGame() {
        newApple();
      
        
        running = true;
        timer = new Timer(DELAY, this);
        timer.start();
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        draw(g);
    }

    public void draw(Graphics g) {
        if (running) {
            g.setColor(Color.red);
            g.fillOval(appleX, appleY, UNIT, UNIT);

            for (int i = 0; i < bodyParts; i++) {
                if (i == 0) {
                    g.setColor(Color.green);
                    g.fillRect(x[i], y[i], UNIT, UNIT);
                } else {
                    g.setColor(new Color(45, 180, 0));
                    g.fillRect(x[i], y[i], UNIT, UNIT);
                }
            }

            g.setColor(Color.white);
            g.setFont(new Font("Ink Free", Font.BOLD, 20));
            g.drawString("Score: " + applesEaten, 10, 20);
        } else {
            gameOver(g);
        }
    }

    public void newApple() {
        appleX = random.nextInt((int) (WIDTH / UNIT)) * UNIT;
        appleY = random.nextInt((int) (HEIGHT / UNIT)) * UNIT;
    }

    public void move() {
        for (int i = bodyParts; i > 0; i--) {
            x[i] = x[i - 1];
            y[i] = y[i - 1];
        }

        switch (direction) {
            case 'U':
                y[0] = (y[0] - UNIT + HEIGHT) % HEIGHT;
                break;
            case 'D':
                y[0] = (y[0] + UNIT) % HEIGHT;
                break;
            case 'L':
                x[0] = (x[0] - UNIT + WIDTH) % WIDTH;
                break;
            case 'R':
                x[0] = (x[0] + UNIT) % WIDTH;
                break;
        }
    }

    public void checkApple() {
        if ((x[0] == appleX) && (y[0] == appleY)) {
            bodyParts++;
            applesEaten++;
            newApple();
            newApple();
            newApple();
        }
    }

    public void checkCollisions() {
        for (int i = bodyParts; i > 0; i--) {
            if ((x[0] == x[i]) && (y[0] == y[i])) {
                running = false;
                break;
            }
        }
        if (!running) timer.stop();
    }

    public void gameOver(Graphics g) {
        g.setColor(Color.red);
        g.setFont(new Font("Ink Free", Font.BOLD, 40));
        FontMetrics metrics = getFontMetrics(g.getFont());
        g.drawString("Game Over", (WIDTH - metrics.stringWidth("Game Over")) / 2, HEIGHT / 2 - 50);

        g.setFont(new Font("Ink Free", Font.BOLD, 20));
        g.drawString("Score: " + applesEaten, WIDTH / 2 - 40, HEIGHT / 2 - 20);

        restartButton.setVisible(true);
    }

    public void restartGame() {
        applesEaten = 0;
        bodyParts = 6;
        direction = 'R';
        for (int i = 0; i < bodyParts; i++) {
            x[i] = 0;
            y[i] = 0;
        }
        restartButton.setVisible(false);
        startGame();
        repaint();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (running) {
            move();
            checkApple();
            checkCollisions();
        }
        repaint();
    }

    @Override
    public void keyPressed(KeyEvent e) {
        switch (e.getKeyCode()) {
            case KeyEvent.VK_LEFT:
                if (direction != 'R') direction = 'L';
                break;
            case KeyEvent.VK_RIGHT:
                if (direction != 'L') direction = 'R';
                break;
            case KeyEvent.VK_UP:
                if (direction != 'D') direction = 'U';
                break;
            case KeyEvent.VK_DOWN:
                if (direction != 'U') direction = 'D';
                break;
        }
    }

    @Override public void keyReleased(KeyEvent e) {}
    @Override public void keyTyped(KeyEvent e) {}

    public static void main(String[] args) {
        JFrame frame = new JFrame("Snake Game");
        SnakeGame game = new SnakeGame();
        frame.add(game);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
    }
}