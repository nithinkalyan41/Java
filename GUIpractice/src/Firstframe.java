import javax.swing.*;
import java.awt.*;

public class Firstframe extends JFrame{
        Firstframe() {
                this.setVisible(true);
                this.setTitle("FIRST FRAME");
                this.setResizable(false);
                this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                this.setSize(500, 500);
                ImageIcon image = new ImageIcon("upload.png");
                this.setIconImage(image.getImage());
                this.getContentPane().setBackground(new Color(123, 50, 250));
        }
}
