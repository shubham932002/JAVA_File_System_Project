//Applictaion - 101
//Form for Yearwise Students Registration Report
import java.awt.*;
import java.awt.event.*;
public class Comp_Report_Form extends Frame implements ActionListener
{
    Label lb_pro, lb_title1, lb_title2, lb_compid, lb_year;
    TextField tf_compid, tf_year;
    Button but_generate, but_back;
    int rep1;
    Comp_Report_Form()
    {
        setSize(1000,500);
        setVisible(true);
        setLayout(null);
        setBackground(Color.PINK);
        lb_pro = new Label("Students Campus Placement Information System");
        lb_title1 = new Label("Reading Company ID No. and BatchYear to Generate");
        lb_title2 = new Label("Company wise Placed Students Information Report");
        lb_compid = new Label("Enter Company ID No.");
        tf_compid = new TextField();
        lb_year = new Label("Enter BatchYear");
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
        lb_compid.setFont(f3);
        tf_compid.setFont(f3);
        lb_year.setFont(f3);
        tf_year.setFont(f3);
        but_generate.setFont(f3);
        but_back.setFont(f3);

        add(lb_pro);
        add(lb_title1);
        add(lb_title2);
        add(lb_compid);
        add(tf_compid);
        add(lb_year);
        add(tf_year);
        add(but_generate);
        add(but_back);

        lb_pro.setBounds(100, 100, 800, 40);
        lb_title1.setBounds(125, 150, 700, 30);
        lb_title2.setBounds(100, 225, 950, 40);
        lb_compid.setBounds(250, 300, 250, 25);
        tf_compid.setBounds(500, 300, 150, 25);
        lb_year.setBounds(250, 350, 250, 25);
        tf_year.setBounds(500, 350, 150, 25);
        but_generate.setBounds(200, 425, 200, 30);
        but_back.setBounds(450, 425, 300, 30);

        
        tf_compid.addKeyListener
        (
            new KeyAdapter()
            {
                public void keyTyped(KeyEvent ke)
                {
                    if(tf_compid.getText().length() >= 3)
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
        tf_year.addKeyListener
        (
            new KeyAdapter()
            {
                public void keyTyped(KeyEvent ke)
                {
                    if(tf_compid.getText().length() >= 4)
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
            new Comp_Placed_Report(tf_compid.getText(), tf_year.getText()); 
            dispose();
        }
        else if(ae.getSource() == but_back)
        {
            dispose();
        }
    }
     
    public static void main(String args[])
    {
        Comp_Report_Form prf_obj = new Comp_Report_Form();
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



