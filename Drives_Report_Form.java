//Applictaion - 101
//Form for Yearwise Students Registration Report
import java.awt.*;
import java.awt.event.*;
public class Drives_Report_Form extends Frame implements ActionListener
{
    Label lb_pro, lb_title1, lb_title2, lb_driveid;
    TextField tf_driveid;
    Button but_generate, but_back;
    int rep1;
    Drives_Report_Form(int rep)
    {
        rep1 = rep;
        setSize(1000,500);
        setVisible(true);
        setLayout(null);
        setBackground(Color.PINK);
        lb_pro = new Label("Students Campus Placement Information System");
        lb_title1 = new Label("Reading Conducted Drive's ID No. to Generate");
        if(rep1 == 23)
            lb_title2 = new Label("Placement Drive wise Conducted Rounds Information Report");
        else if(rep1 == 24)
            lb_title2 = new Label("Placement Drive wise Selected Students Information Report");
        lb_driveid = new Label("Enter Conducted Drive's ID No.");
        tf_driveid = new TextField();
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
        lb_driveid.setFont(f3);
        tf_driveid.setFont(f3);
        but_generate.setFont(f3);
        but_back.setFont(f3);

        add(lb_pro);
        add(lb_title1);
        add(lb_title2);
        add(lb_driveid);
        add(tf_driveid);
        add(but_generate);
        add(but_back);

        lb_pro.setBounds(100, 100, 800, 40);
        lb_title1.setBounds(175, 150, 700, 30);
        lb_title2.setBounds(25, 225, 950, 40);
        lb_driveid.setBounds(250, 300, 350, 25);
        tf_driveid.setBounds(600, 300, 200, 25);
        but_generate.setBounds(250, 400, 200, 30);
        but_back.setBounds(500, 400, 300, 30);

        
        tf_driveid.addKeyListener
        (
            new KeyAdapter()
            {
                public void keyTyped(KeyEvent ke)
                {
                    if(tf_driveid.getText().length() >= 4)
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
            if(rep1 == 23)
                new Drive_Rounds_Report(tf_driveid.getText());
            else if(rep1 == 24)
                new Drives_Placed_Report(tf_driveid.getText()); 
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
        Drives_Report_Form prf_obj = new Drives_Report_Form();
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



