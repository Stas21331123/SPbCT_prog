package PR14_15;

import java.awt.*;
import javax.swing.*;
public class Gr1 extends JFrame{
    Gr1(String s){
        super(s);
        setLayout(null);
        setSize(300,500);
        setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        }
public void paint(Graphics g){
    g.drawRect(100, 150, 150, 100);
    g.drawOval(100, 150, 150, 100);
        }
public static void main(String[] args) {
        new Gr1("");
    }
}
