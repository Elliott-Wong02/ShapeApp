package drawingUI;

import javax.swing.*;

public class ShapeSelector extends JPanel {
    JRadioButton but1 = new JRadioButton("Circle");
    JRadioButton but2 = new JRadioButton("Rectangle");
    JRadioButton but3 = new JRadioButton("Square");
    ShapeSelector() {
        ButtonGroup bg = new ButtonGroup();
        bg.add(but1);
        bg.add(but2);
        bg.add(but3);
        add(but1);
        add(but2);
        add(but3);
        but1.setSelected(true);
    }
    String getCurrentShape(){
        if (but1.isSelected()){
            return "Circle";
        }
        else if (but2.isSelected()){
            return "Rectangle";
        }
        else if (but3.isSelected()){
            return "Square";
        }
        return null;
    }
}
