package drawingUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ColourSelector extends JPanel {
    private Color currentColour;

    public ColourSelector(){
        currentColour = Color.BLACK;
        JButton btn1 = new JButton();
        add(btn1);
        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Color newColour = JColorChooser.showDialog(
                        btn1, "Choose Colour", currentColour);
                currentColour=newColour;
                btn1.setBackground(currentColour);
            }
        });
    }
    public Color getCurrentColour(){
        return this.currentColour;
    }
}

