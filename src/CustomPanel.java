
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import javax.swing.JPanel;

public class CustomPanel extends JPanel
{
    private BufferedImage image = null;
    
    @Override
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        
        if (image != null)
        {
            g.drawImage(image, 0, 0, null);
        }
    }
    
    public void setImage(BufferedImage image)
    {
        this.image = image;
        repaint();
    }
}
