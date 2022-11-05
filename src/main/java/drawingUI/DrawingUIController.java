package drawingUI;

import shapes.Drawing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Objects;

public class DrawingUIController {
    private JPanel controlsPanel = new JPanel(new GridLayout(3,1));
    private JPanel mainPanel = new JPanel(new GridLayout(2,1));
    public DrawingUIController(){
        ShapeSelector sSel = new ShapeSelector();
        ColourSelector cSel = new ColourSelector();
        CircleDimsSelector cDim = new CircleDimsSelector();
        RectDimsSelector rDim = new RectDimsSelector();
        SquareDimsSelector sDim = new SquareDimsSelector();
        controlsPanel.add(sSel);
        controlsPanel.add(cSel);
        controlsPanel.add(cDim);
        controlsPanel.add(rDim);
        controlsPanel.add(sDim);
        Drawing d = new Drawing();
        d.addMouseListener(new MouseListener(){
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {
                if (Objects.equals(sSel.getCurrentShape(), "Circle")) {
                    d.addCircle(e.getPoint(), cSel.getCurrentColour(), cDim.getCurrentRadius());
                    d.repaint();
                } else if (Objects.equals(sSel.getCurrentShape(), "Rectangle")) {
                    d.addRect(e.getPoint(), cSel.getCurrentColour(), rDim.getCurrentWidth(), rDim.getCurrentHeight());
                    d.repaint();
                } else if (Objects.equals(sSel.getCurrentShape(), "Square")) {
                    d.addSquare(e.getPoint(), cSel.getCurrentColour(), sDim.getCurrentLength());
                    d.repaint();
                }
            }
            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });
        mainPanel.add(controlsPanel);
        mainPanel.add(d);
    }
    public JPanel getMainPanel(){
        return mainPanel;
    }
}
