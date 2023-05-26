import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class keys extends JFrame implements KeyListener {

    JLabel label;
    keys(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(500,500);
        this.getContentPane().setBackground(Color.BLACK);
        this.addKeyListener(this);

        label = new JLabel("hello");
        label.setBounds(0,0,100,100);
        label.setBackground(Color.BLUE);
        label.setOpaque(true);


        this.add(label);
        this.setVisible(true);
    }


    @Override
    public void keyTyped(KeyEvent e) {
                switch(e.getKeyChar()){
                    case 'a':
                        label.setLocation(label.getX()-10,label.getY());
                        break;
                    case 'w':
                        label.setLocation(label.getX(),label.getY()-10);
                        break;
                    case 's':
                        label.setLocation(label.getX(),label.getY()+10);
                        break;
                    case 'd':
                        label.setLocation(label.getX()+10,label.getY());
                        break;
                }
    }

    @Override
    public void keyPressed(KeyEvent e) {

        if(e.getKeyCode()==38){
            label.setLocation(label.getX(),label.getY()-10);
        }
        if(e.getKeyCode()==40){
            label.setLocation(label.getX(),label.getY()+10);
        }
        if(e.getKeyCode()==37){
            label.setLocation(label.getX()-10,label.getY());
        }
        if(e.getKeyCode()==39){
            label.setLocation(label.getX()+10,label.getY());
        }


    }

    @Override
    public void keyReleased(KeyEvent e) {
        System.out.println(e.getKeyChar());
        System.out.println(e.getKeyCode());

    }
}
