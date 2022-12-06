//Form for Typewise Job Companies Report
import java.awt.*;
import java.awt.event.*;
public class Type_ReportForm extends Frame implements ActionListener
{
    Label lb_pro, lb_title1, lb_title2, lb_dtype;
    CheckboxGroup cbg;
    Checkbox rb1, rb2, rb3, rb4;
    Button but_generate, but_back;
    int rep1;
    Type_ReportForm(int rep)
    {
        rep1 = rep;
        setSize(900,500);
        setVisible(true);
        setLayout(null);
        setTitle("Application - 6");
        setBackground(Color.PINK);
        lb_pro = new Label("Students Campus Placement Information System");
        lb_title1 = new Label("Reading Drive Type to Generate");
        if(rep1 == 21)
            lb_title2 = new Label("DriveType wise Confirmed Placement Drives Schedule Information Report");
        else if(rep1 == 22)
            lb_title2 = new Label("DriveType wise Organised Campus Drives Information Report");
        lb_dtype = new Label("Select Drive Type");
        cbg = new CheckboxGroup();
        rb1 = new Checkbox("OnCampus", cbg, true);
        rb2 = new Checkbox("OffCampus", cbg, false);
        rb3 = new Checkbox("PoolCampus", cbg, false);
        rb4 = new Checkbox("Online", cbg, false);
        but_generate = new Button("Generate Report");
        but_back = new Button("Back to Reports Module");
        but_generate.addActionListener(this);
        but_back.addActionListener(this);

        Font f1, f2, f3;
        f1 = new Font("arial black", Font.PLAIN, 34);
        f2 = new Font("arial", Font.BOLD, 28);
        f3 = new Font("arial", Font.BOLD, 22);

        lb_pro.setFont(f1);
        lb_title1.setFont(f2);
        lb_title2.setFont(f1);
        lb_dtype.setFont(f2);
        rb1.setFont(f3);
        rb2.setFont(f3);
        rb3.setFont(f3);
        rb4.setFont(f3);
        but_generate.setFont(f3);
        but_back.setFont(f3);

        add(lb_pro);
        add(lb_title1);
        add(lb_title2);
        add(lb_dtype);
        add(rb1);
        add(rb2);
        add(rb3);
        add(rb4);
        add(but_generate);
        add(but_back);

        lb_pro.setBounds(60, 100, 800, 40);
        lb_title1.setBounds(225, 150, 500, 30);
        lb_title2.setBounds(10, 225, 890, 40);
        lb_dtype.setBounds(200, 300, 250, 30);
        rb1.setBounds(450, 300, 200, 25);
        rb2.setBounds(675, 300, 200, 25);
        rb3.setBounds(450, 340, 200, 25);
        rb4.setBounds(675, 340, 200, 25);
        but_generate.setBounds(175, 420, 200, 30);
        but_back.setBounds(425, 420, 300, 30);

    }
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource() == but_generate)
        {
            String drtype = ""; 
            if(rb1.getState() == true)
                drtype = "OnCampus";
            else if(rb2.getState() == true)
                drtype = "OffCampus";
            else if(rb3.getState() == true)
                drtype = "PoolCampus";
            else if(rb4.getState() == true)
                drtype = "Online";
            if(rep1  == 21)
                new Type_Sch_Report(drtype);
            else if(rep1  == 22)
                new Type_Drives_Report(drtype);
            dispose();
        }
        else if(ae.getSource() == but_back)
        {
            dispose();
        }
    }
     
    public static void main(String args[])
    {
        Type_ReportForm prf_obj = new Type_ReportForm(21);
        prf_obj.addWindowListener
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



