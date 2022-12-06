// Project Application NO - 3
// Primary Modules Form

import java.awt.*;
import java.awt.event.*;
public class Reports_Module extends Frame implements ActionListener
{
    Label lb1, lb2, lb3, lb4, lb5, lb6, lb7;
    Button but1, but2, but3, but4;
    Reports_Module()
    {
        setSize(1000, 700);
        setVisible(true);
        setLayout(null);
        setBackground(Color.PINK);
        lb1 = new Label("Students Campus Placement Information System");
        lb2 = new Label("Module - 3");
        lb3 = new Label("Reports Module");
        lb4 = new Label("Primary Records Information Reports");
        lb5 = new Label("Campus Drives Information Reports");
        lb6 = new Label("Students Placement Information Reports");
        lb7 = new Label("Back to Project Modules Form (Main Menu)");
        but1 = new Button("");
        but2 = new Button("");
        but3 = new Button("");
        but4 = new Button("");
        but1.addActionListener(this);
        but2.addActionListener(this);
        but3.addActionListener(this);
        but4.addActionListener(this);

        Font f1, f2, f3;
        f1 = new Font("arial black", Font.PLAIN, 36);
        f2 = new Font("arial", Font.BOLD, 32);
        f3 = new Font("times new roman", Font.BOLD, 24);
        lb1.setFont(f1);
        lb2.setFont(f3);
        lb3.setFont(f2);
        lb4.setFont(f3);
        lb5.setFont(f3);
        lb6.setFont(f3);
        lb7.setFont(f3);

        add(lb1);
        add(lb2);
        add(lb3);
        add(lb4);
        add(lb5);
        add(lb6);
        add(lb7);
        add(but1);
        add(but2);
        add(but3);
        add(but4);  

        lb1.setBounds(100, 100, 800, 40);
        lb2.setBounds(425, 140, 200, 30);
        lb3.setBounds(375, 190, 500, 40);
        but1.setBounds(100, 300, 50, 30);
        lb4.setBounds(200, 300, 700, 30);
        but2.setBounds(100, 375, 50, 30);
        lb5.setBounds(200, 375, 700, 30);
        but3.setBounds(100, 450, 50, 30);
        lb6.setBounds(200, 450, 900, 30);
        but4.setBounds(100, 525, 50, 30);
        lb7.setBounds(200, 525, 800, 30);        

    }
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource() == but1)
        {
            new Primary_Reports_Module();
        }
        else if(ae.getSource() == but2)
        {
            new Placement_Reports_Module();
        }
        else if(ae.getSource() == but3)
        {
            new Students_Reports_Module();
        }
        else if(ae.getSource() == but4)
        {
            dispose();
        }
        
    }
    public static void main(String args[])
    {
        Reports_Module obj = new Reports_Module();
        obj.addWindowListener
        (
            new WindowAdapter()
            {
                public void windowClosing(WindowEvent we)
                {
                    System.exit(0);
                }
            }
        );
    }
}
