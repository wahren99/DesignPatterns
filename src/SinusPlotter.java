import java.awt.*;
import javax.swing.*;

public class SinusPlotter implements Function{

    @Override
    public double apply(double x) {
        return Math.sin(x);
    }
}
