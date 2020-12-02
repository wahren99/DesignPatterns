import javax.swing.*;
import java.awt.*;

public class Plotter extends JPanel {

    private Function func;
    private int xorigin;
    private int yorigin;
    private int xratio = 50;
    private int yratio = 50;

    public Plotter(Function func) {
        this.func=func;
        setBackground(Color.WHITE);
    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);
        drawCoordinates(g);
        plotFunction(g);
    }


    protected void drawCoordinates(Graphics g){
        g.setColor(Color.BLACK);
        g.drawLine(0, getHeight()/2,getWidth(),getHeight()/2);
        g.drawLine(getWidth()/2,0,getWidth()/2,getHeight());
    }
    protected void plotFunction(Graphics g) {
        g.setColor(Color.RED);
        xorigin = getWidth() / 2;
        yorigin = getHeight() / 2;
        for (int px = 0; px < getWidth(); px++) {
            double x = (px - xorigin) / (double) xratio;
            double y = func.apply(x);
            int py = yorigin - (int) (y * yratio);
            g.fillOval(px - 1, py - 1, 3, 3);
        }
    }
}
