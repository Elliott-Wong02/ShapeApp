package drawingUI;

import javax.swing.*;

public class RectDimsSelector extends JPanel{
    private JSlider sli_1 = new JSlider(1,100);
    private JSlider sli_2 = new JSlider(1,100);
    public RectDimsSelector(){
        add(sli_1);
        add(sli_2);
    }
    public int getCurrentWidth(){
        int wid = sli_1.getValue();
        return wid;
    }
    public int getCurrentHeight(){
        int len = sli_2.getValue();
        return len;
    }
}
