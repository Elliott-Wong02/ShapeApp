import shapes.Circle;
import shapes.Rect;
import shapes.Shape;
import shapes.Square;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;

public class Drawing extends Canvas{
    private ArrayList<shapes.Shape> shapes = new ArrayList<Shape>();
    private Frame f;
    public Drawing(){
        shapes.add(new Circle(new Point(100,100), new Color(0x992266), 100));
        shapes.add(new Rect(new Point(0,0), new Color(29,100,57), 100, 300));
        shapes.add(new Square(new Point(50, 50), new Color(39, 23, 245), 50));

        setupFrame();
        f.addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e){
                f.dispose();
            }
        });
        setupCanvas();
    }

    private void setupFrame() {
        f = new Frame("My window");
        f.add(this);
        f.setLayout(null);
        f.setSize(400,400);
        f.setVisible(true);
    }

    private void setupCanvas() {
        setBackground(Color.WHITE);
        setSize(400, 400);
    }

    public void paint(Graphics g){
        for (int i=0; i< shapes.size(); i++){
            shapes.get(i).draw(g);
        }
    }
}
