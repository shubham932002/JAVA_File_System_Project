// Project Application NO - 4
// Data Entry Modules Form

import java.awt.*;
import java.awt.event.*;
public class DataEntry_Module extends Frame implements ActionListener
{
    Label lb1, lb2, lb3, lb4, lb5, lb6, lb7, lb8;
    Button but1, but2, but3, but4, but5;
    DataEntry_Module()
    {
        setSize(1000, 700);
        setVisible(true);
        setLayout(null);
        setBackground(Color.PINK);
        lb1 = new Label("Students Campus Placement Information System");
        lb2 = new Label("Module - 2");
        lb3 = new Label("Placement Transaction Data Entry Module");
        lb4 = new Label("Confirmation and Scheduling of Placement Drives");
        lb5 = new Label("Conducting the Campus Placement Drives");
        lb6 = new Label("Maintain Record of Each Round of Drive");
        lb7 = new Label("Selected Students Placement Entry");
        lb8 = new Label("Back to Project Modules Form (Main Menu)");
        but1 = new Button("");
        but2 = new Button("");
        but3 = new Button("");
        but4 = new Button("");
        but5 = new Button("");
        but1.addActionListener(this);
        but2.addActionListener(this);
        but3.addActionListener(this);
        but4.addActionListener(this);
        but5.addActionListener(this);

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
        lb8.setFont(f3);

        add(lb1);
        add(lb2);
        add(lb3);
        add(lb4);
        add(lb5);
        add(lb6);
        add(lb7);
        add(lb8);
        add(but1);
        add(but2);
        add(but3);
        add(but4);  
        add(but5);

        lb1.setBounds(100, 100, 800, 40);
        lb2.setBounds(425, 140, 200, 30);
        lb3.setBounds(200, 190, 700, 40);
        but1.setBounds(100, 300, 50, 30);
        lb4.setBounds(200, 300, 700, 30);
        but2.setBounds(100, 375, 50, 30);
        lb5.setBounds(200, 375, 700, 30);
        but3.setBounds(100, 450, 50, 30);
        lb6.setBounds(200, 450, 900, 30);
        but4.setBounds(100, 525, 50, 30);
        lb7.setBounds(200, 525, 800, 30);
        but5.setBounds(100, 600, 50, 30);
        lb8.setBounds(200, 600, 700, 30);

    }
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource() == but1)
        {
            new Company_Drive_Schedule();
        }
        else if(ae.getSource() == but2)
        {
            new Conducted_Campus_Form();
        }
        else if(ae.getSource() == but3)
        {
            new Conducted_Rounds_Data();
        }
        else if(ae.getSource() == but4)
        {
            new Placed_Students_Data();
        }
        else if(ae.getSource() == but5)
        {
            dispose();
        }
    }
    public static void main(String args[])
    {
        DataEntry_Module obj = new DataEntry_Module();
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
