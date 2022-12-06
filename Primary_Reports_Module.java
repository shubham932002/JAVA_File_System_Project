// Project Application NO - 3
// Primary Modules Form

import java.awt.*;
import java.awt.event.*;
public class Primary_Reports_Module extends Frame implements ActionListener
{
    Label lb1, lb3, lb4, lb5, lb6, lb7, lb8, lb11, lb12, lb21, lb22, lb31, lb32;
    Button but11, but12, but21, but22, but31, but32, but4, but5;
    Primary_Reports_Module()
    {
        setSize(1000, 750);
        setVisible(true);
        setLayout(null);
        setBackground(Color.PINK);
        lb1 = new Label("Students Campus Placement Information System");
        lb3 = new Label("Primary Records Information Reports");
        lb4 = new Label("1. Students Placement Registration Reports");
        lb5 = new Label("2. Students Academic Results Information Report");
        lb6 = new Label("3. Students Certified Courses Information Report");
        lb7 = new Label("4. Job Provider Companies Information Report");
        lb8 = new Label("5. Back to Project Modules Form (Main Menu)");
        lb11 = new Label("BatchYear wise");
        lb12 = new Label("BatchYear and Branch wise");
        lb21 = new Label("BatchYear wise");
        lb22 = new Label("BatchYear and Branch wise");
        lb31 = new Label("BatchYear wise");
        lb32 = new Label("BatchYear and Branch wise");
        but11 = new Button("");
        but12 = new Button("");
        but21 = new Button("");
        but22 = new Button("");
        but31 = new Button("");
        but32 = new Button("");
        but4 = new Button("");
        but5 = new Button("");
        but11.addActionListener(this);
        but12.addActionListener(this);
        but21.addActionListener(this);
        but22.addActionListener(this);
        but31.addActionListener(this);
        but32.addActionListener(this);
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
        lb21.setFont(f3);
        lb22.setFont(f3);
        lb31.setFont(f3);
        lb32.setFont(f3);


        add(lb1);
        add(lb3);
        add(lb4);
        add(lb5);
        add(lb6);
        add(lb7);
        add(lb8);
        add(lb11);
        add(lb12);
        add(lb21);
        add(lb22);
        add(lb31);
        add(lb32);
        add(but11);
        add(but12);
        add(but21);
        add(but22);
        add(but31);
        add(but32);
        add(but4);  
        add(but5);

        lb1.setBounds(100, 100, 800, 40);
        lb3.setBounds(225, 170, 600, 40);
        lb4.setBounds(100, 250, 700, 30);
        but11.setBounds(150, 290, 30, 30);
        lb11.setBounds(200, 290, 200, 30);
        but12.setBounds(425, 290, 30, 30);
        lb12.setBounds(475, 290, 325, 30);
        lb5.setBounds(100, 360, 700, 30);
        but21.setBounds(150, 400, 30, 30);
        lb21.setBounds(200, 400, 200, 30);
        but22.setBounds(425, 400, 30, 30);
        lb22.setBounds(475, 400, 325, 30);
        lb6.setBounds(100, 470, 700, 30);
        but31.setBounds(150, 510, 30, 30);
        lb31.setBounds(200, 510, 200, 30);
        lb32.setBounds(475, 510, 325, 30);
        but32.setBounds(425, 510, 30, 30);
        but4.setBounds(100, 580, 30, 30);
        lb7.setBounds(140, 580, 800, 30);
        but5.setBounds(100, 650, 30, 30);
        lb8.setBounds(140, 650, 700, 30);

    }
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource() == but11)
        {
            new Year_ReportForm(11);
        }
        else if(ae.getSource() == but12)
        {
            new YearBranch_Report_Form(11);
        }
        else if(ae.getSource() == but21)
        {
            new Year_ReportForm(12);
        }
        else if(ae.getSource() == but22)
        {
            new YearBranch_Report_Form(12);
        }
        else if(ae.getSource() == but31)
        {
            new Year_ReportForm(13);
        }
        else if(ae.getSource() == but32)
        {
            new YearBranch_Report_Form(13);
        }
        else if(ae.getSource() == but4)
        {
            new Job_Companies_Report();
        }
        else if(ae.getSource() == but5)
        {
            dispose();
        }
        
    }
    public static void main(String args[])
    {
        Primary_Reports_Module obj = new Primary_Reports_Module();
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
