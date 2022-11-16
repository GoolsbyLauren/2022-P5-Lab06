// Lab06vst.java
// Student Version

import java.awt.*;
import java.applet.*;
import java.util.*;


public class Lab06vst extends Applet
{

    public void paint(Graphics g) {
        // Draw Grid
        g.drawRect(10, 10, 780, 580);
        g.drawLine(400, 10, 400, 590);
        g.drawLine(10, 300, 790, 300);

        // Draw Random Lines
        Random rand = new Random();
        for (int k = 0; k < 101; k++) {
            int x1 = rand.nextInt(365) + 10;
            int y1 = rand.nextInt(290) + 10;
            int x2 = rand.nextInt(365) + 10;
            int y2 = rand.nextInt(290) + 10;
            int r = rand.nextInt(255);
            int gr = rand.nextInt(255);
            int b = rand.nextInt(255);
            g.setColor(new Color(r, gr, b));
            g.drawLine(x1, y1, x2, y2);
        }
        // Draw Random Squares
        Random rect = new Random();
        for (int k = 0; k < 101; k++) {
            int x1 = rect.nextInt(340) + 400;
            int y1 = rect.nextInt(240) + 10;
            int r = rand.nextInt(255);
            int gr = rand.nextInt(255);
            int b = rand.nextInt(255);
            g.setColor(new Color(r, gr, b));

            g.fillRect(x1, y1, 50, 50);
        }
        // Draw Random Circles
        Random circ = new Random();
        for (int k = 0; k < 101; k++) {
            int dim = rand.nextInt(200);
            int x1 = circ.nextInt(390 - dim) + 10;
            int y1 = circ.nextInt(290 - dim) + 300;
            int r = rand.nextInt(255);
            int gr = rand.nextInt(255);
            int b = rand.nextInt(255);
            g.setColor(new Color(r, gr, b));
            g.drawOval(x1, y1, dim, dim);
        }

        // Draw 3-D Box
        //Yellow square
        for (int k = 0; k < 101; k++) {
            g.setColor(new Color(255, 234, 0));
            g.fillRect(550, 375, 100, 100);
        }
        // Red square
        for (int k = 0; k < 101; k++) {
            g.setColor(new Color(255, 0, 0));
            g.fillRect(600, 425, 100, 100);
        }
        // Blue triangle
        for (int k = 0; k < 101; k++) {
            g.setColor(new Color(0, 60, 255));
            Polygon tri = new Polygon();
            tri.addPoint(650, 375);
            tri.addPoint(700, 425);
            tri.addPoint(650, 425);
            g.fillPolygon(tri);
        }
        // Green diamond
        for (int k = 0; k < 101; k++) {
            g.setColor(new Color(26, 255, 0));
            Polygon dia = new Polygon();
            dia.addPoint(550, 375);
            dia.addPoint(550, 475);
            dia.addPoint(600, 525);
            dia.addPoint(600, 425);

            g.fillPolygon(dia);


        }
    }
}





    
 