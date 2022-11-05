package drawingUI;

import javax.swing.*;

public class SquareDimsSelector extends JPanel{
    private JSlider sli = new JSlider(1,100);
    public SquareDimsSelector(){
        add(sli);
    }
    public int getCurrentLength(){
        int len = sli.getValue();
        return len;
    }
}
