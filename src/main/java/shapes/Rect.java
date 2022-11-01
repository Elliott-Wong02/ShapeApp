package shapes;

import java.awt.*;

public class Rect extends Shape {
    private int wid;
    private int hei;
    public Rect(Point initPos, Color col, int width, int height){
        super(initPos, col);
        wid = width;
        hei = height;

    }
    public void draw(Graphics g){
        g.setColor(col);
        g.fillRect(pos.x, pos.y, wid, hei);
    }
}