package com.questions.mid;



import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Random;

@SuppressWarnings("serial")
public class SnakeGame2 extends JPanel implements ActionListener, KeyListener {
    private final int WIDTH = 600, HEIGHT = 600, UNIT = 25;
    private final Timer timer;
    private final ArrayList<Point> snake;
    private Point food;
    private char direction = 'R'; // U, D, L, R
    private boolean running = true;

    public SnakeGame2() {
        setPreferredSize(new Dimension(WIDTH, HEIGHT));
        setBackground(Color.BLACK);
        setFocusable(true);
        addKeyListener(this);

        snake = new ArrayList<>();
        snake.add(new Point(UNIT * 5, UNIT * 5)); // Starting point

        placeFood();
        timer = new Timer(100, this);
        timer.start();
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        if (running) {
            // Draw food
            g.setColor(Color.RED);
            g.fillOval(food.x, food.y, UNIT, UNIT);

            // Draw snake
            g.setColor(Color.GREEN);
            for (Point p : snake) {
                g.fillRect(p.x, p.y, UNIT, UNIT);
            }
        } else {
            gameOver(g);
        }
    }

    public void placeFood() {
        Random rand = new Random();
        int x = rand.nextInt(WIDTH / UNIT) * UNIT;
        int y = rand.nextInt(HEIGHT / UNIT) * UNIT;
        food = new Point(x, y);
    }

    public void move() {
        Point head = new Point(snake.get(0));
        switch (direction) {
            case 'U' -> head.y -= UNIT;
            case 'D' -> head.y += UNIT;
            case 'L' -> head.x -= UNIT;
            case 'R' -> head.x += UNIT;
        }

        // Check collisions
        if (head.x < 0 || head.x >= WIDTH || head.y < 0 || head.y >= HEIGHT || snake.contains(head)) {
            running = false;
            timer.stop();
            return;
        }

        // Add new head
        snake.add(0, head);

        // Eat food
        if (head.equals(food)) {
            placeFood();
        } else {
            snake.remove(snake.size() - 1); // Remove tail
        }
    }

    public void gameOver(Graphics g) {
        g.setColor(Color.WHITE);
        g.setFont(new Font("Arial", Font.BOLD, 40));
        g.drawString("Game Over", WIDTH / 2 - 100, HEIGHT / 2);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (running) {
            move();
        }
        repaint();
    }

    @Override
    public void keyPressed(KeyEvent e) {
        char key = switch (e.getKeyCode()) {
            case KeyEvent.VK_UP -> 'U';
            case KeyEvent.VK_DOWN -> 'D';
            case KeyEvent.VK_LEFT -> 'L';
            case KeyEvent.VK_RIGHT -> 'R';
            default -> direction;
        };

        // Prevent reverse movement
        if ((direction == 'U' && key != 'D') || (direction == 'D' && key != 'U') ||
            (direction == 'L' && key != 'R') || (direction == 'R' && key != 'L')) {
            direction = key;
        }
    }

    // Unused
    public void keyTyped(KeyEvent e) {}
    public void keyReleased(KeyEvent e) {}

    public static void main(String[] args) {
        JFrame frame = new JFrame("Snake Game");
        SnakeGame2 game = new SnakeGame2();
        frame.add(game);
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setResizable(false);
    }
}
