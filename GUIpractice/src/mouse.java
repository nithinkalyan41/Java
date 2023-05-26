import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class mouse extends JFrame implements MouseListener {
    JLabel label;
    mouse(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(500,500);

        label = new JLabel();
        label.setBounds(0,0,100,100);
        label.setBackground(Color.ORANGE);
        label.setOpaque(true);
        label.addMouseListener(this);

        this.add(label);
        this.setVisible(true);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
                label.setBackground(Color.BLUE);
    }

    @Override
    public void mousePressed(MouseEvent e) {
                label.setBackground(Color.BLACK);
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        label.setBackground(Color.GREEN);
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        label.setBackground(Color.GRAY);
    }

    @Override
    public void mouseExited(MouseEvent e) {
        label.setBackground(Color.RED);
    }
}
