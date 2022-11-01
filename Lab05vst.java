// Lab05vst.java
// This is the student, starting version of the Lab05 assignment.


import java.awt.*;
import java.applet.*;


public class Lab05vst extends Applet
{
    public void paint(Graphics g) {
        int width = 980;
        int height = 630;
        int x1 = 10;
        int y1 = 640;
        int x2 = 990;
        int y2 = 640;
        g.drawRect(10, 10, width, height);
        //right-bottom
        x1 = 10;
        y1 = 640;
        x2 = 990;
        y2 = 640;
        for (int k = 0; k <= 49; k++) {
            g.drawLine(x1, y1, x2, y2);
            x1 += 20;
            y2 -= 12;
        }
        //left-bottom
        x1 = 990;
        y1 = 640;
        x2 = 10;
        y2 = 640;
        for (int k = 0; k <= 50; k++) {
            g.drawLine(x1, y1, x2, y2);
            x1 -= 19;
            y2 -= 12;
        }
        //left-top
        x1 = 990;
        y1 = 10;
        x2 = 10;
        y2 = 15;
        for (int k = 0; k <= 50; k++) {
            g.drawLine(x1, y1, x2, y2);
            x1 -= 19;
            y2 += 12;
        }
        //right-top
        x1 = 10;
        y1 = 10;
        x2 = 990;
        y2 = 10;
        for (int k = 0; k <= 50; k++) {
            g.drawLine(x1, y1, x2, y2);
            x1 += 19;
            y2 += 12;
        }

        //110 pt
        //right-bottom
        x1 = 200;
        y1 = 444;
        x2 = 815;
        y2 = 444;
        for (int k = 0; k <= 49; k++) {
            g.drawLine(x1, y1, x2, y2);
            x1 += 12;
            y2 -= 4;
        }
       //left-bottom
        x1 = 815;
        y1 = 444;
        x2 = 200;
        y2 = 444;
        for (int k = 0; k <= 50; k++) {
            g.drawLine(x1, y1, x2, y2);
            x1 -= 12;
            y2 -= 4;
        }

        //left-top
        x1 = 815;
        y1 = 209;
        x2 = 200;
        y2 = 209;
        for (int k = 0; k <= 50; k++) {
            g.drawLine(x1, y1, x2, y2);
            x1 -= 12;
            y2 += 4;
        }

        //right-top
        x1 = 200;
        y1 = 209;
        x2 = 815;
        y2 = 209;
        for (int k = 0; k <= 50; k++) {
            g.drawLine(x1, y1, x2, y2);
            x1 += 12;
            y2 += 4;
        }

    }
    }