package shapes;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;

public class Drawing extends Canvas {

    private Frame f;
    private ShapeDB shapeDB = new ShapeDB();

    public Drawing() {
        setupFrame();
        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                f.dispose();
            }
        });
        setupCanvas();
    }

    private void setupFrame() {
        f = new Frame("My window");
        f.add(this);
        f.setLayout(null);
        f.setSize(400, 400);
        f.setVisible(false);
    }

    private void setupCanvas() {
        setBackground(Color.WHITE);
        setSize(400, 400);
    }
    public void addCircle(Point initpos, Color col, int radius){
        shapeDB.addCircle(initpos, col, radius);
    }
    public void addRect(Point initpos, Color col, int w, int h){
        shapeDB.addRect(initpos, col, w, h);
    }
    public void addSquare(Point initpos, Color col, int side){
        shapeDB.addSquare(initpos, col, side);
    }
    public void paint(Graphics g) {
        shapeDB.drawShapes(g);
    }
}
