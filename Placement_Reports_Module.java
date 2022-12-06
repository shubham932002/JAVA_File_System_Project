// Project Application
//Placement Reports Module

import java.awt.*;
import java.awt.event.*;
public class Placement_Reports_Module extends Frame implements ActionListener
{
    Label lb1, lb3, lb4, lb5, lb6, lb7, lb8, lb11, lb12, lb13, lb21, lb22, lb23;
    Button but11, but12, but13, but21, but22, but23, but3, but4, but5;
    Placement_Reports_Module()
    {
        setSize(1100, 750);
        setVisible(true);
        setLayout(null);
        setBackground(Color.PINK);
        lb1 = new Label("Students Campus Placement Information System");
        lb3 = new Label("Placement Drives Information Reports Module");
        lb4 = new Label("1. Confirmed Placement Drives Schedule Information Report");
        lb5 = new Label("2. Organised Campus Drives Information Report");
        lb6 = new Label("3. Placement Drive wise Conducted Rounds Information Report");
        lb7 = new Label("4. Placement Drive wise Selected(Placed) Students Information Report");
        lb8 = new Label("5. Back to Project Modules Form (Main Menu)");
        lb11 = new Label("Drive Type wise");
        lb12 = new Label("BatchYear wise");
        lb13 = new Label("BatchYear-Branch wise");
        lb21 = new Label("Drive Type wise");
        lb22 = new Label("BatchYear wise");
        lb23 = new Label("BatchYear-Branch wise");
        but11 = new Button("");
        but12 = new Button("");
        but13 = new Button("");
        but21 = new Button("");
        but22 = new Button("");
        but23 = new Button("");
        but3 = new Button("");
        but4 = new Button("");
        but5 = new Button("");
        but11.addActionListener(this);
        but12.addActionListener(this);
        but13.addActionListener(this);
        but21.addActionListener(this);
        but22.addActionListener(this);
        but23.addActionListener(this);
        but3.addActionListener(this);
        but4.addActionListener(this);
        but5.addActionListener(this);

        Font f1, f2, f3;
        f1 = new Font("arial black", Font.PLAIN, 36);
        f2 = new Font("arial", Font.BOLD, 32);
        f3 = new Font("times new roman", Font.BOLD, 24);
        lb1.setFont(f1);
        lb3.setFont(f2);
        lb4.setFont(f3);
        lb5.setFont(f3);
        lb6.setFont(f3);
        lb7.setFont(f3);
        lb8.setFont(f3);
        lb11.setFont(f3);
        lb12.setFont(f3);
        lb13.setFont(f3);
        lb21.setFont(f3);
        lb22.setFont(f3);
        lb23.setFont(f3);


        add(lb1);
        add(lb3);
        add(lb4);
        add(lb5);
        add(lb6);
        add(lb7);
        add(lb8);
        add(lb11);
        add(lb12);
        add(lb13);
        add(lb21);
        add(lb22);
        add(lb23);
        add(but11);
        add(but12);
        add(but13);
        add(but21);
        add(but22);
        add(but23);
        add(but3);
        add(but4);  
        add(but5);

        lb1.setBounds(100, 100, 800, 40);
        lb3.setBounds(150, 170, 700, 40);
        lb4.setBounds(100, 250, 700, 30);
        but11.setBounds(150, 290, 30, 30);
        lb11.setBounds(200, 290, 200, 30);
        but12.setBounds(425, 290, 30, 30);
        lb12.setBounds(475, 290, 200, 30);
        but13.setBounds(700, 290, 30, 30);
        lb13.setBounds(750, 290, 325, 30);
        lb5.setBounds(100, 360, 700, 30);
        but21.setBounds(150, 400, 30, 30);
        lb21.setBounds(200, 400, 200, 30);
        but22.setBounds(425, 400, 30, 30);
        lb22.setBounds(475, 400, 200, 30);
        but23.setBounds(700, 400, 30, 30);
        lb23.setBounds(750, 400, 325, 30);
        but3.setBounds(100, 470, 30, 30);
        lb6.setBounds(140, 470, 800, 30);
        but4.setBounds(100, 540, 30, 30);
        lb7.setBounds(140, 540, 850, 30);
        but5.setBounds(100, 610, 30, 30);
        lb8.setBounds(140, 610, 750, 30);

    }
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource() == but11)
        {
            new Type_ReportForm(21);
        }
        else if(ae.getSource() == but12)
        {
            new Year_ReportForm(21);
        }
        else if(ae.getSource() == but13)
        {
            new YearBranch_Report_Form(21);
        }
        else if(ae.getSource() == but21)
        {
            new Type_ReportForm(22);
        }
        else if(ae.getSource() == but22)
        {
            new Year_ReportForm(22);
        }
        else if(ae.getSource() == but23)
        {
            new YearBranch_Report_Form(22);
        }
        else if(ae.getSource() == but3)
        {
            new Drives_Report_Form(23);
        }
        else if(ae.getSource() == but4)
        {
            new Drives_Report_Form(24);
        }
        else if(ae.getSource() == but5)
        {
            dispose();
        }
        
    }
    public static void main(String args[])
    {
        Placement_Reports_Module obj = new Placement_Reports_Module();
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
