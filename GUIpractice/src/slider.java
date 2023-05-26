import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.util.EventListener;

public class slider implements ChangeListener{
    JFrame frame;
    JPanel panel;
    JLabel label;
    JSlider slide;
    slider(){
        frame= new JFrame();
        panel=new JPanel();
        slide=new JSlider(0,100,50);
        label= new JLabel();

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());
        slide.setPreferredSize(new Dimension(400,200));
        slide.setPaintTicks(true);
        slide.setMinorTickSpacing(10);
        slide.setPaintTrack(true);
        slide.setMajorTickSpacing(25);
        slide.setPaintLabels(true);
        slide.setFont(new Font("MV Boli",Font.PLAIN,15));
        slide.setOrientation(SwingConstants.VERTICAL);
        label.setText("°C = "+ slide.getValue());
        label.setFont(new Font("MV Boli",Font.PLAIN,30));



        slide.addChangeListener(this);


        panel.add(slide);
        panel.add(label);
        frame.add(panel);
        frame.setSize(600,500);
        frame.setVisible(true);


    }

    @Override
    public void stateChanged(ChangeEvent e) {
        label.setText("°C = "+ slide.getValue());

    }
}
