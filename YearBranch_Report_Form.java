//Applictaion - 102
//Form for Year and Branch wise Students Registration Report
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class YearBranch_Report_Form extends Frame implements ActionListener
{
    Label lb_pro, lb_title1, lb_title2, lb_year, lb_branch;
    TextField tf_year;
    Button but_generate, but_back;
    Choice cb_branch;
    int rep1;
    YearBranch_Report_Form(int rep)
    {
        rep1 = rep;
        setSize(950,500);
        setVisible(true);
        setLayout(null);
        setTitle("Application - 6");
        setBackground(Color.PINK);
        lb_pro = new Label("Students Campus Placement Information System");
        lb_title1 = new Label("Reading Batch Year & Branch to Generate");
        if(rep1 == 11)
            lb_title2 = new Label("BatchYear, Branch wise Students Placement Registration Report");
        else if(rep1 == 12)
            lb_title2 = new Label("BatchYear, Branch wise Academic Reults Information Report");
        else if(rep1 == 13)
            lb_title2 = new Label("BatchYear, Branch wise Certified Courses Information Report");
        else if(rep1 == 21)
            lb_title2 = new Label("BatchYear, Branch wise Confirmed Placement Drives Schedule Information Report");
        else if(rep1 == 22)
            lb_title2 = new Label("BatchYear, Branch wise Organised Campus Drives Information Report");
        else if(rep1 == 31)
            lb_title2 = new Label("BatchYear, Branch wise Placed Students Information Report");
        else if(rep1 == 32)
            lb_title2 = new Label("BatchYear, Branch wise Non-Placed Students Information Report");
        lb_year = new Label("Enter Batch Year");
        lb_branch = new Label("Select Branch");
        tf_year = new TextField();
        but_generate = new Button("Generate Report");
        but_back = new Button("Back to Reports Module");
        cb_branch = new Choice();
        cb_branch.add("");
        cb_branch.add("Computer");
        cb_branch.add("IT");
        cb_branch.add("AI&DS");
        cb_branch.add("ETC");
        cb_branch.add("Electronics");
        cb_branch.add("Mechanical");
        cb_branch.add("Civil");
        cb_branch.add("Electrical");
        cb_branch.add("Instrumentation");
        cb_branch.add("Chemical");
        cb_branch.add("Production");
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
        lb_branch.setFont(f3);
        cb_branch.setFont(f3);
        but_generate.setFont(f3);
        but_back.setFont(f3);

        add(lb_pro);
        add(lb_title1);
        add(lb_title2);
        add(lb_year);
        add(tf_year);
        add(lb_branch);
        add(cb_branch);
        add(but_generate);
        add(but_back);

        lb_pro.setBounds(90, 100, 800, 40);
        lb_title1.setBounds(200, 150, 600, 30);
        lb_title2.setBounds(30, 225, 890, 40);
        lb_year.setBounds(240, 300, 200, 25);
        tf_year.setBounds(440, 300, 200, 25);
        lb_branch.setBounds(240, 350, 200, 25);
        cb_branch.setBounds(440, 350, 200, 25);
        but_generate.setBounds(185, 425, 200, 30);
        but_back.setBounds(435, 425, 300, 30);

        
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
            if(tf_year.getText().length() == 0)  
                JOptionPane.showMessageDialog(this, "You did not enter Batch Year, Please Enter Batch Year.");
            else if(cb_branch.getSelectedIndex() == 0)
                JOptionPane.showMessageDialog(this, "You did not Select Branch, Please select Branch.");
            else
            {
                if(rep1 == 11)
                    new YearBranch_Reg_Report(tf_year.getText().substring(2), cb_branch.getSelectedItem());
                else if(rep1 == 12)
                    new YearBranch_AcRes_Report(tf_year.getText().substring(2), cb_branch.getSelectedItem());                    
                else if(rep1 == 13)
                    new YearBranch_Certi_Report(tf_year.getText().substring(2), cb_branch.getSelectedItem());
                else if(rep1 == 21)
                    new YearBranch_Sch_Report(tf_year.getText(), cb_branch.getSelectedItem());
                else if(rep1 == 22)
                    new YearBranch_Drives_Report(tf_year.getText(), cb_branch.getSelectedItem());
                else if(rep1 == 31)
                    new YearBranch_Placed_Report(tf_year.getText(), cb_branch.getSelectedItem());
                else if(rep1 == 32)
                    new YearBranch_NonPlaced_Report(tf_year.getText(), cb_branch.getSelectedItem());
                dispose();
            }
            
        }
        else if(ae.getSource() == but_back)
        {
            dispose();
        }
    }
    /* 
    public static void main(String args[])
    {
        YearBranch_Report_Form prf_obj = new YearBranch_Report_Form();
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



