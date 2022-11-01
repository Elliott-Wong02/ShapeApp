package shapes;

import shapes.Rect;

import java.awt.*;

public class Square extends Rect {
    public Square(Point initPos, Color col, int len){
        super(initPos, col, len, len);
    }
    public void draw(Graphics g){
        super.draw(g);
    }
}
