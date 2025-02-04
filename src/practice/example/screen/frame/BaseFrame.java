package practice.example.screen.frame;
// 20250204.
import practice.example.screen.panel.WelcomePanel;

import javax.swing.*;

public class BaseFrame extends JFrame{
    public BaseFrame() {
        this.add(new WelcomePanel(this));
        this.setSize(800,600);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}
