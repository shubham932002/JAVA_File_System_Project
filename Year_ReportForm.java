//Applictaion - 101
//Form for Yearwise Students Registration Report
import java.awt.*;
import java.awt.event.*;
public class Year_ReportForm extends Frame implements ActionListener
{
    Label lb_pro, lb_title1, lb_title2, lb_year;
    TextField tf_year;
    Button but_generate, but_back;
    int rep1;
    Year_ReportForm(int rep)
    {
        rep1 = rep;
        setSize(900,500);
        setVisible(true);
        setLayout(null);
        setTitle("Application - 6");
        setBackground(Color.PINK);
        lb_pro = new Label("Students Campus Placement Information System");
        lb_title1 = new Label("Reading Batch Year to Generate");
        if(rep1 == 11)
            lb_title2 = new Label("BatchYear wise Students Placement Registration Report");
        else if(rep1 == 12)
            lb_title2 = new Label("BatchYear wise Academic Results Information Report");
        else if(rep1 == 13)
            lb_title2 = new Label("BatchYear wise Certified Courses Information Report");
        else if(rep1 == 21)
            lb_title2 = new Label("BatchYear wise Confirmed Placement Drives Schedule Information Report");
        else if(rep1 == 22)
            lb_title2 = new Label("BatchYear wise Organised Campus Drives Information Report");
        else if(rep1 == 31)
            lb_title2 = new Label("BatchYear wise Placed Students Information Report");
        else if(rep1 == 32)
            lb_title2 = new Label("BatchYear wise Non-Placed Students Information Report");
        else if(rep1 == 34)
            lb_title2 = new Label("Placement Summary Report");
        lb_year = new Label("Enter Batch Year");
        tf_year = new TextField();
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
        lb_year.setFont(f3);
        tf_year.setFont(f3);
        but_generate.setFont(f3);
        but_back.setFont(f3);

        add(lb_pro);
        add(lb_title1);
        add(lb_title2);
        add(lb_year);
        add(tf_year);
        add(but_generate);
        add(but_back);

        lb_pro.setBounds(60, 100, 800, 40);
        lb_title1.setBounds(225, 150, 500, 30);
        lb_title2.setBounds(10, 225, 890, 40);
        lb_year.setBounds(225, 300, 200, 25);
        tf_year.setBounds(425, 300, 200, 25);
        but_generate.setBounds(175, 400, 200, 30);
        but_back.setBounds(425, 400, 300, 30);

        
        tf_year.addKeyListener
        (
            new KeyAdapter()
            {
                public void keyTyped(KeyEvent ke)
                {
                    if(tf_year.getText().length() >= 4)
                    {
                        ke.consume();    
                    }
                    if(ke.getKeyChar() >= '0' && ke.getKeyChar() <= '9')
                        return;
                    else 
                        ke.consume();
                }
            }
        );
    }
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource() == but_generate)
        {
            if(rep1 == 11)
                new Year_Reg_Report(tf_year.getText().substring(2));
            else if(rep1 == 12)
                new Year_AcRes_Report(tf_year.getText().substring(2));
            else if(rep1  == 13)
                new Year_Certi_Report(tf_year.getText().substring(2));
            else if(rep1  == 21)
                new Year_Sch_Report(tf_year.getText());
            else if(rep1  == 22)
                new Year_Drives_Report(tf_year.getText());
            else if(rep1  == 31)
                new Year_Placed_Report(tf_year.getText());
            else if(rep1  == 32)
                new Year_NonPlaced_Report(tf_year.getText());
            else if(rep1  == 34)
                new Year_Summary_Report(tf_year.getText());
            dispose();
        }
        else if(ae.getSource() == but_back)
        {
            dispose();
        }
    }
     /*
    public static void main(String args[])
    {
        Year_ReportForm prf_obj = new Year_ReportForm(1);
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
    */
    
}



