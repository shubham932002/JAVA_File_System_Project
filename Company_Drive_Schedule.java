// Program for Company's Drive Schedule Data Entry Form
import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class Company_Drive_Schedule extends Frame implements ActionListener
{
    Label lb_title, lb_driveid, lb_compid, lb_date, lb_type, lb_year, lb_branch, lb_area, lb_jobs;
    TextField tf_driveid, tf_compid, tf_date, tf_year, tf_branch, tf_area, tf_jobs, tf_sname, tf_fname;
    Button but_validate, but_add, but_save, but_back;
    CheckboxGroup cbg;
    Checkbox rb_on, rb_off, rb_pool, rb_online;
    BufferedWriter bw;
    BufferedReader  br;
    Company_Drive_Schedule()
    {
        setSize(1100, 800);
        setLayout(null);
        setVisible(true);
        setBackground(Color.PINK);
        lb_title = new Label("Company's Drive Schedule Data Entry Form");
        lb_driveid = new Label("Drive Schedule ID No.");
        lb_compid = new Label("Job Provider Company's ID No.");
        lb_date = new Label("Schedule Drive Date");
        lb_type = new Label("Drive Type");
        lb_year = new Label("Eligible Batch Year");
        lb_branch = new Label("Eligible Branches");
        lb_area = new Label("Expected Expertise Areas");
        lb_jobs = new Label("No. of Job Offers");
        tf_driveid = new TextField();
        tf_compid = new TextField();
        tf_date = new TextField();
        tf_year = new TextField();
        tf_branch = new TextField();
        tf_area = new TextField();
        tf_jobs = new TextField();
        tf_sname = new TextField();
        tf_fname = new TextField();
        but_validate = new Button("Validate Company");
        but_add = new Button("Add Schedule Data");
        but_save = new Button("Save Schedule Data");
        but_back = new Button("Back to Main Menu");
        but_add.addActionListener(this);
        but_save.addActionListener(this);
        but_back.addActionListener(this);
        but_validate.addActionListener(this);
        cbg = new CheckboxGroup();
        rb_on = new Checkbox("On-Campus", cbg, true);
        rb_off = new Checkbox("Off-Campus", cbg, false);
        rb_pool = new Checkbox("Pool-Campus", cbg, false);
        rb_online = new Checkbox("Online", cbg, false);

        Font f1, f2, f3;
        f1 = new Font("arial black", Font.PLAIN, 36);
        f2 = new Font("arial", Font.BOLD, 28);
        f3 = new Font("arial", Font.BOLD, 24);
        lb_title.setFont(f1);
        lb_driveid.setFont(f2);
        lb_compid.setFont(f2);
        lb_date.setFont(f2);
        lb_type.setFont(f2);
        lb_year.setFont(f2);
        lb_branch.setFont(f2);
        lb_area.setFont(f2);
        lb_jobs.setFont(f2)   ;
        tf_driveid.setFont(f3);
        tf_compid.setFont(f3);
        tf_date.setFont(f3);
        tf_year.setFont(f3);
        tf_branch.setFont(f3);
        tf_area.setFont(f3);
        tf_jobs.setFont(f3);
        tf_sname.setFont(f3);
        tf_fname.setFont(f3);
        rb_on.setFont(f3);
        rb_off.setFont(f3);
        rb_pool.setFont(f3);
        rb_online.setFont(f3);
        but_add.setFont(f2);
        but_back.setFont(f2);
        but_save.setFont(f2);
        but_validate.setFont(f3);
        
        add(lb_title);
        add(lb_driveid);
        add(lb_compid);
        add(lb_date);
        add(lb_type);
        add(lb_year);
        add(lb_branch);
        add(lb_area);
        add(lb_jobs);
        add(tf_driveid);
        add(tf_compid);
        add(tf_date);
        add(tf_year);
        add(tf_branch);
        add(tf_area);
        add(tf_jobs);
        add(tf_sname);
        add(tf_fname);
        add(rb_on);
        add(rb_off);
        add(rb_pool);
        add(rb_online);
        add(but_add);
        add(but_back);
        add(but_save);
        add(but_validate);
        
        lb_title.setBounds(175, 50, 800, 40);
        lb_driveid.setBounds(100, 150, 425, 40);
        tf_driveid.setBounds(550, 150, 100, 30);
        lb_compid.setBounds(100, 200, 425, 30);
        tf_compid.setBounds(550, 200, 100, 30);
        but_validate.setBounds(700, 200, 225, 30);
        tf_sname.setBounds(550, 250, 100, 30);
        tf_fname.setBounds(675, 250, 200, 30);
        lb_date.setBounds(100, 300, 425, 30);
        tf_date.setBounds(550, 300, 140, 30);
        lb_type.setBounds(100, 350, 425, 30);
        rb_on.setBounds(550, 350, 200, 30);
        rb_off.setBounds(775, 350, 200, 30);
        rb_pool.setBounds(550, 380, 200, 30);
        rb_online.setBounds(775, 380, 200, 30);
        lb_year.setBounds(100, 430, 425, 30);
        tf_year.setBounds(550, 430, 160, 30);
        lb_branch.setBounds(100, 480, 425, 30);
        tf_branch.setBounds(550, 480, 250, 30);
        lb_area.setBounds(100, 530, 425, 30);
        tf_area.setBounds(550, 530, 250, 30);
        lb_jobs.setBounds(100, 580, 425, 30);
        tf_jobs.setBounds(550, 580, 100, 30);
        but_add.setBounds(70, 650, 300, 30);
        but_save.setBounds(425, 650, 300, 30);
        but_back.setBounds(770, 650, 300, 30);


        tf_driveid.addKeyListener
        (
            new KeyAdapter()
            {
                public void keyTyped(KeyEvent ke)
                {
                    if(tf_driveid.getText().length() >= 6)
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

        tf_date.addKeyListener
        (
            new KeyAdapter()
            {
                public void keyTyped(KeyEvent ke)
                {
                    if(tf_date.getText().length() >= 10)
                    {
                        ke.consume();    
                    }
                    if(ke.getKeyChar() >= '0' && ke.getKeyChar() <= '9')
                        return;
                    else if(ke.getKeyChar() == '/')
                        return;
                    else 
                        ke.consume();
                }
            }
        );

        tf_compid.addKeyListener
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

        tf_year.addKeyListener
        (
            new KeyAdapter()
            {
                public void keyTyped(KeyEvent ke)
                {
                    if(tf_year.getText().length() >= 9)
                    {
                        ke.consume();    
                    }
                    if(ke.getKeyChar() >= '0' && ke.getKeyChar() <= '9')
                        return;
                    else if(ke.getKeyChar() == ' ')
                        return;
                    else 
                        ke.consume();
                }
            }
        );

        tf_branch.addKeyListener
        (
            new KeyAdapter()
            {
                public void keyTyped(KeyEvent ke)
                {
                    if(tf_branch.getText().length() >= 40)
                    {
                        ke.consume();    
                    }
                }
            }
        );

        tf_area.addKeyListener
        (
            new KeyAdapter()
            {
                public void keyTyped(KeyEvent ke)
                {
                    if(tf_area.getText().length() >= 30)   
                    {
                        ke.consume();
                    }
                }
            }
        );

        tf_jobs.addKeyListener
        (
            new KeyAdapter()
            {
                public void keyTyped(KeyEvent ke)
                {
                    if(tf_jobs.getText().length() >= 3)
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

        tf_driveid.setEditable(false);
        tf_compid.setEditable(false);
        tf_date.setEditable(false);
        tf_year.setEditable(false);
        tf_branch.setEditable(false);
        tf_area.setEditable(false);
        tf_jobs.setEditable(false);
        tf_sname.setEditable(false);
        tf_fname.setEditable(false);
        but_save.setEnabled(false);
        but_validate.setEnabled(false);
        
        try{
            bw = new BufferedWriter(new FileWriter("Drive_Schedule.txt", true));
        }
        catch(IOException ioe1)
        {

        }
    }
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==but_add)
        {
            tf_driveid.setEditable(true);
            tf_compid.setEditable(true);
            tf_date.setEditable(true);
            tf_year.setEditable(true);
            tf_branch.setEditable(true);
            tf_area.setEditable(true);
            tf_jobs.setEditable(true);
            but_save.setEnabled(true);
            but_validate.setEnabled(true);
            but_add.setEnabled(false);
            tf_driveid.requestFocus();
        }
        else if(ae.getSource()==but_save)
        {
            if(tf_driveid.getText().length() == 0)
            {
                tf_driveid.requestFocus();
                JOptionPane.showMessageDialog(this, "Schedule ID No. should not be Empty, Please Enter Schedule No..");
            }
            else if(tf_date.getText().length() == 0)
            {
                tf_date.requestFocus();
                JOptionPane.showMessageDialog(this, "Schedule Date should not be Empty, Please Enter Schedule Date.");
            }
            else if(tf_compid.getText().length() == 0)
            {
                tf_compid.requestFocus();
                JOptionPane.showMessageDialog(this, "Company ID  should not be Empty, Please Enter Company ID.");
            }
            else if(tf_year.getText().length() == 0)
            {
                tf_year.requestFocus();
                JOptionPane.showMessageDialog(this, "Eligible Batch Year should not be Empty, Please Enter Eligible Batch Year.");
            }
            else if(tf_branch.getText().length() == 0)
            {
                tf_branch.requestFocus();
                JOptionPane.showMessageDialog(this, "Eligible Branches should not be Empty, Please Enter Eligible Branches.");
            }
            else if(tf_jobs.getText().length() == 0)
            {
                tf_jobs.requestFocus();
                JOptionPane.showMessageDialog(this, "Please Enter No. of Jobs Offered.");
            }
            else if(tf_sname.getText().equals("xx") && tf_fname.getText().equals("xxxx"))
            {
                tf_compid.requestFocus();
                JOptionPane.showMessageDialog(this, "Invalid Company ID No., Please Enter Correct Company ID No.");            
            }
            else
            {
                String scid = tf_driveid.getText();
                String scdate = tf_date.getText();
                String coid = tf_compid.getText();
                String drtype;
                if(rb_on.getState() == true)
                    drtype = "OnCampus";
                else if(rb_off.getState() == true)
                    drtype = "OffCampus";
                else if(rb_pool.getState() == true)
                    drtype = "PoolCampus";
                else 
                    drtype = "Online";
                String batyrs = tf_year.getText();
                String bran = tf_branch.getText();
                String jobs = tf_jobs.getText();
                try
                {
                    bw.write(scid + "$" + scdate + "$" + coid + "$" + drtype + "$" + batyrs + "$" + bran + "$" + jobs);
                    bw.newLine();
                    JOptionPane.showMessageDialog(this, "Schedule Record is added successfully.");
                }
                catch(IOException ioe3)
                {

                }
                tf_driveid.setText("");
                tf_compid.setText(""); 
                tf_date.setText(""); 
                tf_year.setText(""); 
                tf_branch.setText(""); 
                tf_area.setText(""); 
                tf_jobs.setText(""); 
                tf_sname.setText(""); 
                tf_fname.setText("");
                but_save.setEnabled(false);
                but_add.setEnabled(true);
                but_validate.setEnabled(false);
                tf_driveid.setEditable(false);
                tf_compid.setEditable(false);
                tf_date.setEditable(false);
                tf_year.setEditable(false);
                tf_branch.setEditable(false);
                tf_area.setEditable(false);
                tf_jobs.setEditable(false);
                tf_sname.setEditable(false);
                tf_fname.setEditable(false);
            }   
        }
        else if(ae.getSource()==but_back)
        {
            try{
                bw.close();
            }
            catch(IOException ioe4)
            {
            }
            dispose();
        }
        else if(ae.getSource()==but_validate)
        {
            validate_company();
            if(tf_sname.getText().equals("xx") && tf_fname.getText().equals("xxxx"))
            {
                tf_compid.requestFocus();
                JOptionPane.showMessageDialog(this, "Invalid Company ID No., Please Enter Correct Company ID No.");            
            }
        }
    }
        void validate_company()
        {
            if(tf_compid.getText().length() == 0)
            {
                tf_compid.requestFocus();
                JOptionPane.showMessageDialog(this, "Company ID  should not be Empty, Please Enter Company ID.");
            }
            else
            {
                try{
                    br = new BufferedReader(new FileReader("JobCompanies.txt"));
                    String company;
                    String data[] = null;
                    int chk = 0;
                    while((company = br.readLine()) != null)
                    {
                        data = company.split("\\$");
                        if(Integer.parseInt(data[0]) == Integer.parseInt(tf_compid.getText()))
                        {
                            chk = 1;
                            break;
                        }
                    }
                    tf_sname.setEditable(true);
                    tf_fname.setEditable(true);
                    if(chk == 1)
                    {
                        tf_sname.setText(data[1]);
                        tf_fname.setText(data[2]);
                    }
                    else
                    {
                        tf_sname.setText("xx");
                        tf_fname.setText("xxxx");
                    }
                    tf_sname.setEditable(false);
                    tf_fname.setEditable(false);                
                    br.close();
                }
                catch(IOException ioe2)
                {

                }   
            }
}

    public static void main(String arhs[])
    {
        Company_Drive_Schedule obj = new Company_Drive_Schedule();
        obj.addWindowListener(
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