import javax.swing.*;

public class MainPlotter {

    public static void main(String[] blablabla){
        JFrame w =new JFrame();
        Plotter p= new Plotter(new CosinusPlotter());
        w.add(p);
        w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        w.setSize(400, 200);
        w.setVisible(true);
    }
}
