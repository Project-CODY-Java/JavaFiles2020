package Applets;

import java.applet.Applet;
import java.awt.*;
import java.util.Random;

public class apples extends Applet {
    public void paint(Graphics g){
        /*
        g.setColor(Color.GREEN);
        g.drawRect(0,0, 100, 100);
        g.setColor(Color.RED);
        g.fillRect(100,0, 100, 100);
        g.drawArc(0,100,100,100, 180, 180);
         */
        Random r = new Random();
        while (true) {
            g.setColor(new Color(r.nextInt(256),r.nextInt(256),r.nextInt(256)));
            int side = 50;
            g.fillRect(0, 0, side * 5, side);
            int s = 20;
            g.fillRect(0, 0, s, s * 5);
            g.fillRect(0, s * 5, side * 5, side);
            g.fillRect(side * 5 - s, s * 5, s, s * 5);
            g.fillRect(0, s * 2 * 5, side * 5, side);
        }
    }
}