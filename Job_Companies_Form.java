// Project Application NO 9
// Job Provider Companies  Form
import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Job_Companies_Form extends Frame implements ActionListener
{
   Label lb_title,lb_id,lb_sname,lb_lname,lb_address,lb_sector,lb_p1name,lb_p1dg,lb_p1mobile,lb_p1email,lb_p2name,lb_p2dg,lb_p2mobile,lb_p2email;
   TextField tf_id,tf_sname,tf_lname,tf_address,tf_sector,tf_p1name,tf_p1dg,tf_p1mobile,tf_p1email,tf_p2name,tf_p2dg,tf_p2mobile,tf_p2email;
   Button but_add,but_save,but_back;
   BufferedWriter bw = null;
   Job_Companies_Form()
   {
    setSize(1100,900);
    setVisible(true);
    setLayout(null);
    setBackground(Color.PINK);
    lb_title=new Label("Job Provider Companies Data Retrieval Form");
    lb_id=new Label("Company's ID No." );
    lb_sname=new Label("Company's Short Name" );
    lb_lname=new Label("Company's Full Name" );
    lb_address=new Label("Office Address" );
    lb_sector=new Label("Company's Type/Sector" );
    lb_p1name=new Label("Contact Person-1 Name" );
    lb_p1dg=new Label("Person-1 Designation" );
    lb_p1mobile=new Label("Person-1 Mobile No." );
    lb_p1email=new  Label("Email ID" );
    lb_p2name=new Label("Contact Person-2 Name" );
    lb_p2dg=new Label("Person-2 Designation" );
    lb_p2mobile=new Label("Person-2 Mobile No." );
    lb_p2email=new  Label("Email ID" );
    tf_id=new TextField();
    tf_sname=new TextField();
    tf_lname=new TextField();
    tf_address=new TextField();
    tf_sector=new TextField();
    tf_p1name=new TextField();
    tf_p1dg=new TextField();
    tf_p1mobile=new TextField();
    tf_p1email=new TextField();
    tf_p2name=new TextField();
    tf_p2dg=new TextField();
    tf_p2mobile=new TextField();
    tf_p2email=new TextField();
    but_add=new Button("New Registration");
    but_save=new Button("Save Registered Data");
    but_back=new Button("Back to Menu");

    but_add.addActionListener(this);
    but_save.addActionListener(this);
    but_back.addActionListener(this);
 

    Font f1,f2,f3;
    f1=new Font("arial black",Font.PLAIN,36);
    f2=new Font("arial",Font.BOLD,30);
    f3 = new Font("Times New Roman", Font.BOLD, 26);
    lb_title.setFont(f1);
    lb_id.setFont(f2);
    lb_sname.setFont(f2);
    lb_lname.setFont(f2);
    lb_address.setFont(f2);
    lb_sector.setFont(f2);
    lb_p1name.setFont(f2);
    lb_p1dg.setFont(f2);
    lb_p1mobile.setFont(f2);
    lb_p1email.setFont(f2);
    lb_p2name.setFont(f2);
    lb_p2dg.setFont(f2);
    lb_p2mobile.setFont(f2);
    lb_p2email.setFont(f2);
    tf_id.setFont(f3);
    tf_sname.setFont(f3);
    tf_lname.setFont(f3);
    tf_address.setFont(f3);
    tf_sector.setFont(f3);
    tf_p1name.setFont(f3);
    tf_p1dg.setFont(f3);
    tf_p1mobile.setFont(f3);
    tf_p1email.setFont(f3);
    tf_p2name.setFont(f3);
    tf_p2dg.setFont(f3);
    tf_p2mobile.setFont(f3);
    tf_p2email.setFont(f3);

    but_add.setFont(f2);
    but_save.setFont(f2);
    but_back.setFont(f2);




    add(lb_title);
    add(lb_id);
    add(lb_sname);
    add(lb_lname);
    add(lb_address);
    add(lb_sector);
    add(lb_p1name);
    add(lb_p1dg);
    add(lb_p1mobile);
    add(lb_p1email);
    add(lb_p2name);
    add(lb_p2dg);
    add(lb_p2mobile);
    add(lb_p2email);
    add(tf_id);
    add(tf_sname);
    add(tf_lname);
    add(tf_address);
    add(tf_sector);
    add(tf_p1name);
    add(tf_p1dg);
    add(tf_p1mobile);
    add(tf_p1email);
    add(tf_p2name);
    add(tf_p2dg);
    add(tf_p2mobile);
    add(tf_p2email);
    add(but_add);
    add(but_save);
    add(but_back);
    
    lb_title.setBounds(150,50,800,40);
    lb_id.setBounds(50, 110, 300, 30);
    tf_id.setBounds(450, 110, 100, 30);
    lb_sname.setBounds(50,170,350,35);
    tf_sname.setBounds(450,170,250,30);
    lb_lname.setBounds(50,230,350,35);
    tf_lname.setBounds(450,230,250,30);
    lb_address.setBounds(50,290,300,35);
    tf_address.setBounds(450,290,250,30);
    lb_sector.setBounds(50,350,340,35);
    tf_sector.setBounds(450,350,240,30);
    lb_p1name.setBounds(50,410,340,35);
    tf_p1name.setBounds(450,410,250,30);
    lb_p1dg.setBounds(50,470,340,35);
    tf_p1dg.setBounds(450,470,250,30);
    lb_p1mobile.setBounds(50,530,240,35);
    tf_p1mobile.setBounds(300,530,240,30);
    lb_p1email.setBounds(600,530,150,35);
    tf_p1email.setBounds(780,530,240,30);
    lb_p2name.setBounds(50,590,340,35);
    tf_p2name.setBounds(450,590,250,30);
    lb_p2dg.setBounds(50,650,340,35);
    tf_p2dg.setBounds(450,650,250,30);
    lb_p2mobile.setBounds(50,720,240,35);
    tf_p2mobile.setBounds(300,720,240,30);
    lb_p2email.setBounds(600,720,150,35);
    tf_p2email.setBounds(780,720,240,30);
    
    but_add.setBounds(50,800,275,35);
    but_save.setBounds(390,800,325,35);
    but_back.setBounds(780,800,275,35);
    
    tf_id.addKeyListener
        (
            new KeyAdapter()
            {
                public void keyTyped(KeyEvent ke)
                {
                    if(tf_id.getText().length() >= 3)
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

        tf_sname.addKeyListener
        (
            new KeyAdapter()
            {
                public void keyTyped(KeyEvent ke)
                {
                    if(tf_sname.getText().length() >=6)   
                    {
                        ke.consume();
                    }
                }
            }
        );

        tf_lname.addKeyListener
        (
            new KeyAdapter()
            {
                public void keyTyped(KeyEvent ke)
                {
                    if(tf_lname.getText().length() >=40)   
                    {
                        ke.consume();
                    }
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
        tf_sector.addKeyListener
        (
            new KeyAdapter()
            {
                public void keyTyped(KeyEvent ke)
                {
                    if(tf_sector.getText().length() >=15)   
                    {
                        ke.consume();
                    }
                }
            }
        );

        tf_p1name.addKeyListener
        (
            new KeyAdapter()
            {
                public void keyTyped(KeyEvent ke)
                {
                    if(tf_p1name.getText().length() >=25)   
                    {
                        ke.consume();
                    }
                }
            }
        );

        tf_p1dg.addKeyListener
        (
            new KeyAdapter()
            {
                public void keyTyped(KeyEvent ke)
                {
                    if(tf_p1dg.getText().length() >=15)   
                    {
                        ke.consume();
                    }
                }
            }
        );

        tf_p1mobile.addKeyListener
        (
            new KeyAdapter()
            {
                public void keyTyped(KeyEvent ke)
                {
                    if(tf_p1mobile.getText().length() >= 10)
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
 
        tf_p1email.addKeyListener
        (
            new KeyAdapter()
            {
                public void keyTyped(KeyEvent ke)
                {
                    if(tf_p1email.getText().length() >=30)   
                    {
                        ke.consume();
                    }
                }
            }
        );

        tf_p2name.addKeyListener
        (
            new KeyAdapter()
            {
                public void keyTyped(KeyEvent ke)
                {
                    if(tf_p2name.getText().length() >=25)   
                    {
                        ke.consume();
                    }
                }
            }
        );

        tf_p2dg.addKeyListener
        (
            new KeyAdapter()
            {
                public void keyTyped(KeyEvent ke)
                {
                    if(tf_p2dg.getText().length() >=15)   
                    {
                        ke.consume();
                    }
                }
            }
        );

        tf_p2mobile.addKeyListener
        (
            new KeyAdapter()
            {
                public void keyTyped(KeyEvent ke)
                {
                    if(tf_p2mobile.getText().length() >= 10)
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
 
        tf_p2email.addKeyListener
        (
            new KeyAdapter()
            {
                public void keyTyped(KeyEvent ke)
                {
                    if(tf_p2email.getText().length() >=30)   
                    {
                        ke.consume();
                    }
                }
            }
        );

        tf_id.setEditable(false);
        tf_sname.setEditable(false);
        tf_lname.setEditable(false);
        tf_address.setEditable(false);
        tf_sector.setEditable(false);
        tf_p1name.setEditable(false);
        tf_p1dg.setEditable(false);
        tf_p1mobile.setEditable(false);
        tf_p1email.setEditable(false);
        tf_p2name.setEditable(false);
        tf_p2dg.setEditable(false);
        tf_p2mobile.setEditable(false);
        tf_p2email.setEditable(false);
        but_save.setEnabled(false);

        try{
            bw = new BufferedWriter(new FileWriter("JobCompanies.txt", true));
        }
        catch(IOException ioe1)
        {
            JOptionPane.showMessageDialog(this, "Problem Occurred during opening the File System, please check the Registration File.");
        }
   }
   public void actionPerformed(ActionEvent ae)
   {
        if(ae.getSource()==but_add)
        {
            tf_id.setEditable(true);
            tf_sname.setEditable(true);
            tf_lname.setEditable(true);
            tf_address.setEditable(true);
            tf_sector.setEditable(true);
            tf_p1name.setEditable(true);
            tf_p1dg.setEditable(true);
            tf_p1mobile.setEditable(true);
            tf_p1email.setEditable(true);
            tf_p2name.setEditable(true);
            tf_p2dg.setEditable(true);
            tf_p2mobile.setEditable(true);
            tf_p2email.setEditable(true);
            but_save.setEnabled(true);
            but_add.setEnabled(false);
            tf_id.requestFocus();
        }
        else if(ae.getSource()==but_save)
        {
            if(tf_id.getText().length() == 0)
            {
                tf_id.requestFocus();
                JOptionPane.showMessageDialog(this, "Company ID No. is left empty. Please Enter Company ID No.");
            }
            else if(tf_sname.getText().length() == 0)
            {
                tf_sname.requestFocus();
                JOptionPane.showMessageDialog(this, "Company's Short Name is left empty. Please Enter Company's Short Name.");
            }
            else if(tf_lname.getText().length() == 0)
            {
                tf_lname.requestFocus();
                JOptionPane.showMessageDialog(this, "Company's Long Name is left empty. Please Enter Company's Long Name.");
            }
            else if(tf_address.getText().length() == 0)
            {
                tf_address.requestFocus();
                JOptionPane.showMessageDialog(this, "Company's Address is left empty. Please Enter Company's Address.");
            }
            else if(tf_sector.getText().length() == 0)
            {
                tf_sector.requestFocus();
                JOptionPane.showMessageDialog(this, "Company's Sector is left empty. Please Enter Company's Sector.");
            }
            else if(tf_p1name.getText().length() == 0)
            {
                tf_p1name.requestFocus();
                JOptionPane.showMessageDialog(this, "Company's Long Name is left empty. Please Enter Company's Long Name.");
            }
            else if(tf_p1dg.getText().length() == 0)
            {
                tf_p1dg.requestFocus();
                JOptionPane.showMessageDialog(this, "Person-1's Designation Cannot be empty. Please enter Designation.");
            }
            else if(tf_p1mobile.getText().length() == 0)
            {
                tf_p1mobile.requestFocus();
                JOptionPane.showMessageDialog(this, "Person-1's Mobile No. Cannot be empty. Please enter Mobile No.");
            }
            else if(tf_p1email.getText().length() == 0)
            {
                tf_p1email.requestFocus();
                JOptionPane.showMessageDialog(this, "Person-1's Email ID Cannot be empty. Please enter Email ID.");
            }
            else 
            {
                String id = tf_id.getText();
                String sname = tf_sname.getText();
                String lname = tf_lname.getText();
                String address = tf_address.getText();
                String sector = tf_sector.getText();
                String p1name  = tf_p1name.getText();
                String p1dg = tf_p1dg.getText();
                String p1mobno = tf_p1mobile.getText();
                String p1email = tf_p1email.getText();
                String p2name  = tf_p2name.getText();
                String p2dg = tf_p2dg.getText();
                String p2mobno = tf_p2mobile.getText();
                String p2email = tf_p2email.getText();
                if(p2name.length() == 0)
                    p2name = "-";
                if(p2dg.length() == 0)
                    p2dg = "-";
                if(p2mobno.length() == 0)
                    p2mobno = "-";
                if(p2email.length() == 0)
                    p2email = "-";

                    try{
                        bw.write(id + "$" + sname + "$" + lname + "$" + address + "$" + sector + "$" + p1name + "$" + p1dg + "$" + p1mobno + "$" + p1email + "$" + p2name + "$" + p2dg + "$" + p2mobno + "$" + p2email);
                        bw.newLine();
                        JOptionPane.showMessageDialog(this, "Job Provider Companies Data is Registered Successfully.");
                    }
                    catch(IOException ioe2)
                    {
                        JOptionPane.showMessageDialog(this, "Problem occurred during writing data into JobCompanies File, please Check");
                    }
                    tf_id.setText("");
                    tf_sname.setText("");
                    tf_lname.setText("");
                    tf_address.setText("");
                    tf_sector.setText("");
                    tf_p1name.setText("");
                    tf_p1dg.setText("");
                    tf_p1mobile.setText("");
                    tf_p1email.setText("");
                    tf_p2name.setText("");
                    tf_p2dg.setText("");
                    tf_p2mobile.setText("");
                    tf_p2email.setText("");
    
                    tf_id.setEditable(false);
                    tf_sname.setEditable(false);
                    tf_lname.setEditable(false);
                    tf_address.setEditable(false);
                    tf_sector.setEditable(false);
                    tf_p1name.setEditable(false);
                    tf_p1dg.setEditable(false);
                    tf_p1mobile.setEditable(false);
                    tf_p1email.setEditable(false);
                    tf_p2name.setEditable(false);
                    tf_p2dg.setEditable(false);
                    tf_p2mobile.setEditable(false);
                    tf_p2email.setEditable(false);
                    but_save.setEnabled(false);
                    but_add.setEnabled(true);
                }    
            
        }
    
        else if(ae.getSource()==but_back)
        {
            try{
                bw.close();
            }   
            catch(IOException ioe3)
            {   
                JOptionPane.showMessageDialog(this, "Problems occurred during closing the JobCompanies File, please Check.");
            }
            dispose();
        }
   
}
  
  
     
   public static void main(String args[])
   {
    Job_Companies_Form obj=new Job_Companies_Form();
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