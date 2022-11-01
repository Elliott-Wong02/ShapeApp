package shapes;

import java.awt.*;
import java.util.ArrayList;

public class ShapeDB {
    public ArrayList<Shape> shapes = new ArrayList<>();
    void addCircle(Point initpos, Color col, int radius){
        shapes.add(new Circle(initpos, col, radius));
    }
    void addRect(Point initpos, Color col, int w, int h){
        shapes.add(new Rect(initpos, col, w, h));
    }
    void addSquare(Point initpos, Color col, int side){
        shapes.add(new Square(initpos, col, side));
    }
    void drawShapes(Graphics g) {
        for (int i = 0; i < shapes.size(); i++) {
            shapes.get(i).draw(g);
        }
    }

}
