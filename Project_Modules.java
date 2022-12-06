// Project Application NO - 2
// Project Modules Form

import java.awt.*;
import java.awt.event.*;
public class Project_Modules extends Frame implements ActionListener
{
    Label lb1, lb2, lb3, lb4, lb5, lb6;
    Button but1, but2, but3, but4;
    Project_Modules()
    {
        setSize(1000, 700);
        setVisible(true);
        setLayout(null);
        setBackground(Color.PINK);
        lb1 = new Label("Students Campus Placement Information System");
        lb2 = new Label("S/W Project Modules (Main Menu)");
        lb3 = new Label("Primary Data Retrieval Module");
        lb4 = new Label("Placement Transaction Data Entry Module");
        lb5 = new Label("Online Information Reports Module");
        lb6 = new Label("Close the Form/Project");
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
        f3 = new Font("times new roman", Font.BOLD, 26);
        lb1.setFont(f1);
        lb2.setFont(f2);
        lb3.setFont(f3);
        lb4.setFont(f3);
        lb5.setFont(f3);
        lb6.setFont(f3);

        add(lb1);
        add(lb2);
        add(lb3);
        add(lb4);
        add(lb5);
        add(lb6);
        add(but1);
        add(but2);
        add(but3);
        add(but4);  

        lb1.setBounds(125, 100, 800, 40);
        lb2.setBounds(275, 150, 550, 40);
        but1.setBounds(100, 300, 50, 30);
        lb3.setBounds(200, 300, 600, 30);
        but2.setBounds(100, 400, 50, 30);
        lb4.setBounds(200, 400, 600, 30);
        but3.setBounds(100, 500, 50, 30);
        lb5.setBounds(200, 500, 600, 30);
        but4.setBounds(100, 600, 50, 30);
        lb6.setBounds(200, 600, 600, 30);

    }
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource() == but1)
        {
            new Primary_Module();
        }
        else if(ae.getSource() == but2)
        {
            new DataEntry_Module();
        }
        else if(ae.getSource() == but3)
        {
            new Reports_Module();
        }
        else if(ae.getSource() == but4)
        {
            dispose();
        }
    }
    public static void main(String args[])
    {
        Project_Modules obj = new Project_Modules();
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
