package drawingUI;

import javax.swing.*;

public class CircleDimsSelector extends JPanel {
    private JSlider sli = new JSlider(1,100);
    public CircleDimsSelector(){
        add(sli);
    }
    public int getCurrentRadius(){
        int rad = sli.getValue();
        return rad;
    }
}
