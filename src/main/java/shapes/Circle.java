package shapes;

import java.awt.*;

public class Circle extends Shape {
    private int rad;

    public Circle(Point initPos, Color col, int radius){
        super(initPos, col);
        rad = radius;
    }
    @Override
    public void draw(Graphics g){
        g.setColor(col);
        g.fillOval(pos.x, pos.y, rad, rad);
    }
}
