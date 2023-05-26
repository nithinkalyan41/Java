import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

public class Menubar extends JFrame implements ActionListener {
    JMenuBar menubar;
    JMenu filemenu;
    JMenu editmenu;
    JMenu helpmenu;
    JMenuItem load;
    JMenuItem save;
    JMenuItem exit;


    Menubar(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.setLayout(new FlowLayout());

         menubar = new JMenuBar();

         filemenu = new JMenu("FILE");
         editmenu = new JMenu("EDIT");
         helpmenu = new JMenu("HELP");

        menubar.add(filemenu);
        menubar.add(editmenu);
        menubar.add(helpmenu);

        load = new JMenuItem("load");
        save = new JMenuItem("save");
        exit = new JMenuItem("exit");


        load.addActionListener(this);
        save.addActionListener(this);
        exit.addActionListener(this);

        filemenu.setMnemonic(KeyEvent.VK_F);
        editmenu.setMnemonic(KeyEvent.VK_D);
        helpmenu.setMnemonic(KeyEvent.VK_H);
        load.setMnemonic(KeyEvent.VK_L);
        save.setMnemonic(KeyEvent.VK_S);
        exit.setMnemonic(KeyEvent.VK_E);

        filemenu.add(load);
        filemenu.add(save);
        filemenu.add(exit);
        this.setJMenuBar(menubar);

        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
            if(e.getSource()==load){
                System.out.println("file loaded");
            }
            if(e.getSource()==save){
                System.out.println("file Saved");
            }
            if(e.getSource()==exit){
                System.exit(0);
            }
    }
}
