import javax.swing.*;
import java.awt.*;

public class Panel extends JPanel {
    public Panel() {
        setOpaque(false);
    }
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setColor(getBackground());
        g2.fillRoundRect(0,0,getWidth(),getHeight(),15,15);
        g2.dispose();
    }

}
