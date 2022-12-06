// Project Application NO - 5
// Online Information Reports MOdule

import java.awt.*;
import java.awt.event.*;
public class Old_Reports_Module extends Frame implements ActionListener
{
    Label lb1, lb2, lb3, lb4, lb5, lb6, lb7, lb8, lb9, lb10, lb11, lb12, lb13, lb14, lb15, lb16, lb17, lb18, lb19, lb20, lb21, lb22, lb23;
    Button but1, but2, but3, but4, but5, but6, but7, but8, but9, but10, but11, but12, but13, but14, but15, but16, but17;
    Old_Reports_Module()
    {
        setSize(900, 800);
        setVisible(true);
        setLayout(null);
        setBackground(Color.PINK);
        lb1 = new Label("Students Campus Placement Information System");
        lb2 = new Label("Module - 3");
        lb3 = new Label("Online Information Reports Module");
        lb4 = new Label("1. Primary Information Reports");
        lb5 = new Label("BatchYear wise Registered Students Information Reports");   
        lb6 = new Label("Students Academic Results Information Reports (Course-wise)");
        lb7 = new Label("Students Certified Courses Information Reports (Course-wise)");
        lb8 = new Label("Job Provider Companies Information Report");
        lb9 = new Label("2. Placement Drives Information Report");
        lb10 = new Label("Confirmed Placement Drives Schedule Information Report");
        lb11 = new Label("Organised Campus Drives Information Report");
        lb12 = new Label("On-Campus Placement Drives Information Report");
        lb13 = new Label("Off-Campus Placement Drives Information Report");
        lb14 = new Label("Pool-Campus Placement Drives Information Report");
        lb15 = new Label("Online Placement Drives Information Report");
        lb16 = new Label("Company-wise Placement Drives Information Report");
        lb17 = new Label("Drive-wise Conducted Rounds Information Report");
        lb18 = new Label("3. Students Placement Information Report");
        lb19 = new Label("Drive-wise Students Placement Information Report");
        lb20 = new Label("Course-wise Students Placement Information Report");
        lb21 = new Label("Non-Placed  Students Information Report");
        lb22 = new Label("Placement Summary");
        lb23 = new Label("Back to Project Modules (Main Menu)");

        but1 = new Button("");
        but2 = new Button("");
        but3 = new Button("");
        but4 = new Button("");
        but5 = new Button("");
        but6 = new Button("");
        but7 = new Button("");
        but8 = new Button("");
        but9 = new Button("");
        but10 = new Button("");
        but11 = new Button("");
        but12 = new Button("");
        but13 = new Button("");
        but14 = new Button("");
        but15 = new Button("");
        but16 = new Button("");
        but17 = new Button("");

        but1.addActionListener(this);
        but2.addActionListener(this);
        but3.addActionListener(this);
        but4.addActionListener(this);
        but5.addActionListener(this);
        but6.addActionListener(this);
        but7.addActionListener(this);
        but8.addActionListener(this);
        but9.addActionListener(this);
        but10.addActionListener(this);
        but11.addActionListener(this);
        but12.addActionListener(this);
        but13.addActionListener(this);
        but14.addActionListener(this);
        but15.addActionListener(this);
        but16.addActionListener(this);
        but17.addActionListener(this);

        Font f1, f2, f3, f4;
        f1 = new Font("arial black", Font.PLAIN, 30);
        f2 = new Font("arial", Font.BOLD, 24);
        f3 = new Font("times new roman", Font.BOLD, 22);
        f4 = new Font("arial", Font.PLAIN, 20);
        lb1.setFont(f1);
        lb2.setFont(f3);
        lb3.setFont(f2);
        lb4.setFont(f3);
        lb5.setFont(f4);
        lb6.setFont(f4);
        lb7.setFont(f4);
        lb8.setFont(f4);
        lb9.setFont(f3);
        lb10.setFont(f4);
        lb11.setFont(f4);
        lb12.setFont(f4);
        lb13.setFont(f4);
        lb14.setFont(f4);
        lb15.setFont(f4);
        lb16.setFont(f4);
        lb17.setFont(f4);
        lb18.setFont(f3);
        lb19.setFont(f4);
        lb20.setFont(f4);
        lb21.setFont(f4);
        lb22.setFont(f4);
        lb23.setFont(f3);

        add(lb1);
        add(lb2);
        add(lb3);
        add(lb4);
        add(lb5);
        add(lb6);
        add(lb7);
        add(lb8);
        add(lb9);
        add(lb10);
        add(lb11);
        add(lb12);
        add(lb13);
        add(lb14);
        add(lb15);
        add(lb16);
        add(lb17);
        add(lb18);
        add(lb19);
        add(lb20);
        add(lb21);
        add(lb22);
        add(lb23);
        add(but1);
        add(but2);
        add(but3);
        add(but4);  
        add(but5);
        add(but6);
        add(but7);
        add(but8);
        add(but9);
        add(but10);
        add(but11);
        add(but12);
        add(but13);
        add(but14);
        add(but15);
        add(but16);
        add(but17);

        lb1.setBounds(125, 50, 700, 30);
        lb2.setBounds(425, 80, 125, 30);
        lb3.setBounds(250, 110, 500, 30);
        lb4.setBounds(50, 150, 500, 30);
        but1.setBounds(100, 180, 25, 25);
        lb5.setBounds(150, 180, 600, 30);
        but2.setBounds(100, 210, 25, 25);
        lb6.setBounds(150, 210, 600, 30);
        but3.setBounds(100, 240, 25, 25);
        lb7.setBounds(150, 240, 600, 30);
        but4.setBounds(100, 270, 25, 25);
        lb8.setBounds(150, 270, 600, 30);
        lb9.setBounds(50, 300, 500, 30);
        but5.setBounds(100, 330, 25, 25);
        lb10.setBounds(150, 330, 600, 30);
        but6.setBounds(100, 360, 25, 25);
        lb11.setBounds(150, 360, 600, 30);
        but7.setBounds(100, 390, 25, 25);
        lb12.setBounds(150, 390, 600, 30);
        but8.setBounds(100, 420, 25, 25);
        lb13.setBounds(150, 420, 600, 30);
        but9.setBounds(100, 450, 25, 25);
        lb14.setBounds(150, 450, 600, 30);
        but10.setBounds(100, 480, 25, 25);
        lb15.setBounds(150, 480, 600, 30);
        but11.setBounds(100, 510, 25, 25);
        lb16.setBounds(150, 510, 600, 30);
        but12.setBounds(100, 540, 25, 25);
        lb17.setBounds(150, 540, 600, 30);
        lb18.setBounds(50, 570, 500, 30);
        but13.setBounds(100, 600, 25, 25);
        lb19.setBounds(150, 600, 600, 30);
        but14.setBounds(100, 630, 25, 25);
        lb20.setBounds(150, 630, 600, 30);
        but15.setBounds(100, 660, 25, 25);
        lb21.setBounds(150, 660, 600, 30);
        but16.setBounds(100, 690, 25, 25);
        lb22.setBounds(150, 690, 600, 30);
        but17.setBounds(50, 720, 30, 30);
        lb23.setBounds(100, 720, 450, 30);
        /*
*/
    }
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource() == but1)
        {
            new Year_ReportForm();
        }
        else if(ae.getSource() == but2)
        {
            ;
        }
        else if(ae.getSource() == but3)
        {
            ;
        }
        else if(ae.getSource() == but4)
        {
            ;
        }
        else if(ae.getSource() == but5)
        {
            ;
        }   
        else if(ae.getSource() == but6)
        {
            ;
        }
        else if(ae.getSource() == but7)
        {
            ;
        }
        else if(ae.getSource() == but8)
        {
            ;
        }
        else if(ae.getSource() == but9)
        {
            ;
        }
        else if(ae.getSource() == but10)
        {
            ;
        }
        else if(ae.getSource() == but11)
        {
            ;
        }
        else if(ae.getSource() == but12)
        {
            ;
        }
        else if(ae.getSource() == but13)
        {
            ;
        }
        else if(ae.getSource() == but14)
        {
            ;
        }
        else if(ae.getSource() == but15)
        {
            ;
        }
        else if(ae.getSource() == but16)
        {
            new YearBranch_Report_Form();
        }
        else if(ae.getSource() == but17)
        {
            dispose();
        }
    }
    public static void main(String args[])
    {
        Old_Reports_Module obj = new Old_Reports_Module();
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
