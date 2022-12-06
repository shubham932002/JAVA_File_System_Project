//Applictaion - 6
//Student Placement Registration Form
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;
public class Plac_Registration_Form extends Frame implements ActionListener
{
    Label lb_title, lb_prn, lb_studname, lb_batyear, lb_branch, lb_div, lb_rollno, lb_address, lb_gen, lb_mobileno, lb_email,  lb_hobbies, lb_expertarea, lb_awards;
    TextField tf_prn, tf_studname, tf_batyear, tf_div, tf_rollno, tf_address, tf_mobileno, tf_email, tf_hobbies, tf_expertarea, tf_awards;
    Choice cb_branch;
    CheckboxGroup cbg;
    Checkbox rb_male, rb_female;
    Button but_prn, but_add, but_save, but_back;
    BufferedWriter bw;
    Plac_Registration_Form()
    {
        setSize(1100,700);
        setVisible(true);
        setLayout(null);
        setTitle("Application - 6");
        setBackground(Color.PINK);
        lb_title = new Label("Students Registration Form for Job Placement");
        lb_prn = new Label("Student's PRN") ;
        lb_studname = new Label("Student Name");
        lb_batyear = new Label("Batch Year No.") ;
        lb_branch = new Label("Branch") ;
        lb_div = new Label("Division");
        lb_rollno = new Label("Roll No.") ;
        lb_address = new Label("Permanent Address") ;
        lb_gen = new Label("Gender");
        lb_mobileno = new Label("Mobile No.") ;
        lb_email = new Label("Email ID");
        lb_hobbies = new Label("Hobbies") ;
        lb_expertarea = new Label("Expertise Areas") ;
        lb_awards = new Label("Competitive Awards");
        tf_prn = new TextField();
        tf_studname = new TextField();
        tf_batyear = new TextField("20");
        tf_div = new TextField();
        tf_rollno = new TextField();
        tf_address = new TextField();
        tf_mobileno = new TextField();
        tf_email = new TextField();
        tf_hobbies = new TextField();
        tf_expertarea = new TextField();
        tf_awards = new TextField();
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
        cbg = new CheckboxGroup();
        rb_male = new Checkbox("Male", cbg, false);
        rb_female = new Checkbox("Female", cbg, false);
        but_prn = new Button("Generate PRN");
        but_add = new Button("New Registration");
        but_save = new Button("Save Registered Data");
        but_back = new Button("Back to Menu");
        but_prn.addActionListener(this);
        but_add.addActionListener(this);
        but_save.addActionListener(this);
        but_back.addActionListener(this);

        Font f1, f2, f3;
        f1 = new Font("arial black", Font.PLAIN, 34);
        f2 = new Font("times new roman", Font.BOLD, 28);
        f3 = new Font("arial", Font.BOLD, 24);

        lb_title.setFont(f1); 
        lb_prn.setFont(f2); 
        lb_studname.setFont(f2); 
        lb_batyear.setFont(f2); 
        lb_branch.setFont(f2); 
        lb_div.setFont(f2); 
        lb_rollno.setFont(f2); 
        lb_address.setFont(f2); 
        lb_gen.setFont(f2); 
        lb_mobileno.setFont(f2); 
        lb_email.setFont(f2);  
        lb_hobbies.setFont(f2); 
        lb_expertarea.setFont(f2); 
        lb_awards.setFont(f2);
        tf_prn.setFont(f3);
        tf_studname.setFont(f3);
        tf_batyear.setFont(f3);
        tf_div.setFont(f3);
        tf_rollno.setFont(f3);
        tf_address.setFont(f3);
        tf_mobileno.setFont(f3);
        tf_email.setFont(f3);
        tf_hobbies.setFont(f3);
        tf_expertarea.setFont(f3);
        tf_awards.setFont(f3);
        rb_male.setFont(f3);
        rb_female.setFont(f3);
        cb_branch.setFont(f3);
        but_prn.setFont(f3);
        but_add.setFont(f2);
        but_save.setFont(f2);
        but_back.setFont(f2);

        add(lb_title);
        add(lb_prn);
        add(lb_studname);
        add(lb_batyear);
        add(lb_branch);
        add(lb_div);
        add(lb_rollno);
        add(lb_address);
        add(lb_gen);
        add(lb_mobileno);
        add(lb_email);
        add(lb_hobbies);
        add(lb_expertarea);
        add(lb_awards);
        add(tf_prn);
        add(tf_studname);
        add(tf_batyear);
        add(tf_div);
        add(tf_rollno);
        add(tf_address);
        add(tf_mobileno);
        add(tf_email);
        add(tf_hobbies);
        add(tf_expertarea);
        add(tf_awards);
        add(cb_branch);
        add(rb_male);
        add(rb_female);
        add(but_prn);
        add(but_add);
        add(but_save);
        add(but_back);

        lb_title.setBounds(170, 40, 800, 40);
        lb_studname.setBounds(50, 100, 300, 30);
        tf_studname.setBounds(400, 100, 400, 30);
        lb_batyear.setBounds(50, 150, 300, 30);
        tf_batyear.setBounds(400, 150, 150, 30);
        lb_branch.setBounds(700, 150, 100, 30);
        cb_branch.setBounds(825, 150, 200, 30);
        lb_div.setBounds(50, 200, 200, 30);
        tf_div.setBounds(400, 200, 40, 30);
        lb_rollno.setBounds(700, 200, 100, 30);
        tf_rollno.setBounds(825, 200, 100, 30);
        lb_prn.setBounds(50, 250, 200, 30);
        tf_prn.setBounds(400, 250, 150, 30);
        but_prn.setBounds(600, 250, 200, 30);
        lb_address.setBounds(50, 300, 300, 30);
        tf_address.setBounds(400, 300, 600, 30);
        lb_gen.setBounds(50, 350, 100, 30);
        rb_male.setBounds(400, 350, 100, 30);
        rb_female.setBounds(520, 350, 100, 30);
        lb_mobileno.setBounds(50, 400, 150, 30);
        tf_mobileno.setBounds(400, 400, 175, 30);
        lb_email.setBounds(650, 400, 125, 30);
        tf_email.setBounds(775, 400, 300, 30);
        lb_hobbies.setBounds(50, 450, 150, 30);
        tf_hobbies.setBounds(400, 450, 400, 30);
        lb_expertarea.setBounds(50, 500, 250, 30);
        tf_expertarea.setBounds(400, 500, 400, 30);
        lb_awards.setBounds(50, 550, 350, 30);
        tf_awards.setBounds(400, 550, 400, 30);
        but_add.setBounds(125, 625, 250, 40);
        but_save.setBounds(425, 625, 300, 40);
        but_back.setBounds(750, 625, 250, 40);


        tf_studname.addKeyListener
        (
            new KeyAdapter()
            {
                public void keyTyped(KeyEvent ke)
                {
                    if(tf_studname.getText().length() >=40)   
                    {
                        ke.consume();
                    }
                    if(ke.getKeyChar() >= 'A' && ke.getKeyChar() <= 'Z')
                    {
                        return;
                    }
                    else if(ke.getKeyChar() >= 'a' && ke.getKeyChar() <= 'z')
                    {
                        return;
                    }
                    else if(ke.getKeyChar() == ' ')
                    {
                        return;
                    }
                    else 
                    {
                        ke.consume();
                    }
                }
            }
        );

        tf_batyear.addKeyListener
        (
            new KeyAdapter()
            {
                public void keyTyped(KeyEvent ke)
                {
                    if(tf_batyear.getText().length() >= 4)
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

        tf_div.addKeyListener
        (
            new KeyAdapter()
            {
                public void keyTyped(KeyEvent ke)
                {
                    if(tf_div.getText().length() >=1)   
                    {
                        ke.consume();
                    }
                    if(ke.getKeyChar() >= 'A' && ke.getKeyChar() <= 'Z')
                    {
                        return;
                    }
                    else 
                    {
                        ke.consume();
                    }
                }
            }
        );

        tf_rollno.addKeyListener
        (
            new KeyAdapter()
            {
                public void keyTyped(KeyEvent ke)
                {
                    if(tf_rollno.getText().length() >= 2)
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

        tf_address.addKeyListener
        (
            new KeyAdapter()
            {
                public void keyTyped(KeyEvent ke)
                {
                    if(tf_address.getText().length() >=75)   
                    {
                        ke.consume();
                    }
                }
            }
        );

        tf_mobileno.addKeyListener
        (
            new KeyAdapter()
            {
                public void keyTyped(KeyEvent ke)
                {
                    if(tf_mobileno.getText().length() >= 10)
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

        tf_email.addKeyListener
        (
            new KeyAdapter()
            {
                public void keyTyped(KeyEvent ke)
                {
                    if(tf_email.getText().length() >= 25)   
                    {
                        ke.consume();
                    }
                }
            }
        );

        tf_hobbies.addKeyListener
        (
            new KeyAdapter()
            {
                public void keyTyped(KeyEvent ke)
                {
                    if(tf_hobbies.getText().length() >=30)   
                    {
                        ke.consume();
                    }
                }
            }
        );

        tf_expertarea.addKeyListener
        (
            new KeyAdapter()
            {
                public void keyTyped(KeyEvent ke)
                {
                    if(tf_expertarea.getText().length() >=30)   
                    {
                        ke.consume();
                    }
                }
            }
        );

        tf_awards.addKeyListener
        (
            new KeyAdapter()
            {
                public void keyTyped(KeyEvent ke)
                {
                    if(tf_awards.getText().length() >=30)   
                    {
                        ke.consume();
                    }
                }
            }
        );

        tf_studname.setEditable(false);
        tf_batyear.setEditable(false);
        cb_branch.setEnabled(false);
        tf_div.setEditable(false);
        tf_rollno.setEditable(false);
        tf_prn.setEditable(false);
        tf_address.setEditable(false);
        rb_male.setEnabled(false);
        rb_female.setEnabled(false);
        tf_mobileno.setEditable(false);
        tf_email.setEditable(false);
        tf_hobbies.setEditable(false);
        tf_expertarea.setEditable(false);
        tf_awards.setEditable(false);
        but_prn.setEnabled(false);
        but_save.setEnabled(false);

        try{
            bw = new BufferedWriter(new FileWriter("Registration.txt", true));
        }
        catch(IOException ioe1)
        {
            JOptionPane.showMessageDialog(this, "Problem Occurred during opening the File System, please check the Registration File.");
        }
    }
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource() == but_add)
        {
            tf_studname.setEditable(true);
            tf_batyear.setEditable(true);
            cb_branch.setEnabled(true);
            tf_div.setEditable(true);
            tf_rollno.setEditable(true);
            tf_address.setEditable(true);
            rb_male.setEnabled(true);
            rb_female.setEnabled(true);
            tf_mobileno.setEditable(true);
            tf_email.setEditable(true);
            tf_hobbies.setEditable(true);
            tf_expertarea.setEditable(true);
            tf_awards.setEditable(true);
            but_prn.setEnabled(true);
            but_save.setEnabled(true);
            but_add.setEnabled(false);
        }
        else if(ae.getSource() == but_prn)
        {
            if(tf_batyear.getText().length() == 0)
            {
                tf_batyear.requestFocus();
                JOptionPane.showMessageDialog(this, "Batch Year is left empty, please enter Batch Year.");
            }
            else if(cb_branch.getSelectedIndex() == 0)
            {
                JOptionPane.showMessageDialog(this, "Branch is not selected, please Select Branch.");
            }
            else if(tf_div.getText().length() == 0)
            {
                tf_div.requestFocus();
                JOptionPane.showMessageDialog(this, "Division is left empty, please enter Division.");
            }
            else if(tf_rollno.getText().length() == 0)
            {
                tf_rollno.requestFocus();
                JOptionPane.showMessageDialog(this, "Roll No. is left empty, please enter Roll No..");
            }
            else 
            {
                String prn = tf_batyear.getText().substring(2);
                if(cb_branch.getSelectedIndex() == 5)
                    prn = prn + "Ec";
                else
                    prn = prn + cb_branch.getSelectedItem().substring(0, 2);
                prn = prn + tf_div.getText();
                if(tf_rollno.getText().length() == 1)
                    prn = prn + "0" + tf_rollno.getText();
                else 
                    prn = prn + tf_rollno.getText();
                tf_prn.setEditable(true);
                tf_prn.setText(prn);
                tf_prn.setEditable(false);
            }
        }
        else if(ae.getSource() == but_save)
        {
            if(tf_studname.getText().length() == 0)
            {
                tf_studname.requestFocus();
                JOptionPane.showMessageDialog(this, "Student Name is left empty, please enter Student Name.");
            }
            else if(tf_prn.getText().length() == 0)
            {
                JOptionPane.showMessageDialog(this, "You did not generate PRN. Please generate PRN.");
            }
            else if(tf_address.getText().length() == 0)
            {
                tf_address.requestFocus();
                JOptionPane.showMessageDialog(this, "Address is left empty, please enter Permanent Address.");
            }
            else if(rb_male.getState() == false && rb_female.getState() == false)
            {
                JOptionPane.showMessageDialog(this, "Gender is not Selected, please select Student Gender.");
            }
            else if(tf_mobileno.getText().length() != 10)
            {
                tf_mobileno.requestFocus();
                JOptionPane.showMessageDialog(this, "Mobile No. is left empty or Invalid, please enter Student Mobile No. .");
            }
            else if(tf_email.getText().length() == 0)
            {
                tf_email.requestFocus();
                JOptionPane.showMessageDialog(this, "Student Email is left empty, please enter Student Email.");
            }   
            else 
            {
                String studname = tf_studname.getText();
                String studprn = tf_prn.getText();
                String address = tf_address.getText();
                String gender;
                if(rb_male.getState() == true)
                    gender = "M";
                else 
                    gender = "F";
                String mobno = tf_mobileno.getText();
                String email = tf_email.getText();
                String hobbies = tf_hobbies.getText();
                if(hobbies.length() == 0)
                    hobbies = "-";
                String exparea = tf_expertarea.getText();
                if(exparea.length() == 0)
                    exparea = "-";
                String awards = tf_awards.getText();
                if(awards.length() == 0)
                    awards = "-";
                try{
                    bw.write(studprn + "$" + studname + "$" + address + "$" + gender + "$" + mobno + "$" + email + "$" + hobbies + "$" + exparea + "$" + awards);
                    bw.newLine();
                    JOptionPane.showMessageDialog(this, "Student's Data is Registered Successfully.");
                }
                catch(IOException ioe2)
                {
                    JOptionPane.showMessageDialog(this, "Problem occurred during writing data into Registration File, please Check");
                }
                tf_studname.setText("");
                tf_batyear.setText("");
                cb_branch.select(0);
                tf_div.setText("");
                tf_rollno.setText("");
                tf_prn.setText("");
                tf_address.setText("");
                rb_male.setState(false);
                rb_female.setState(false);
                tf_mobileno.setText("");
                tf_email.setText("");
                tf_hobbies.setText("");
                tf_expertarea.setText("");
                tf_awards.setText("");

                tf_studname.setEditable(false);
                tf_batyear.setEditable(false);
                cb_branch.setEnabled(false);
                tf_div.setEditable(false);
                tf_rollno.setEditable(false);
                but_prn.setEnabled(false);
                tf_prn.setEditable(false);
                tf_address.setEditable(false);
                rb_male.setEnabled(false);
                rb_female.setEnabled(false);
                tf_mobileno.setEditable(false);
                tf_email.setEditable(false);
                tf_hobbies.setEditable(false);
                tf_expertarea.setEditable(false);
                tf_awards.setEditable(false);
                but_save.setEnabled(false);
                but_add.setEnabled(true);
            }
        }
        else if(ae.getSource() == but_back)
        {
            try{
                bw.close();
            }   
            catch(IOException ioe3)
            {
                JOptionPane.showMessageDialog(this, "Problems occurred during closing the Registration File, please Check.");
            }
            dispose();
        }
    }
    public static void main(String args[])
    {
        Plac_Registration_Form prf_obj = new Plac_Registration_Form();
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



