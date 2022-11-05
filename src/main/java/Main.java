import drawingUI.DrawingUIController;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Main {
    static GraphicsConfiguration gc;
    public static void main(String[]args){
        JFrame frame = new JFrame(gc);
        frame.setSize(500,600);
        DrawingUIController uicon = new  DrawingUIController();
        JPanel mainpanel = uicon.getMainPanel();
        frame.getContentPane().add(mainpanel);
        frame.setVisible(true);
        frame.addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e){
                frame.dispose();
            }
        });
    }
}
