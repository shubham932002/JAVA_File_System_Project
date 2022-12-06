// Program for Conducted Campus Data Entry Form
import java.awt.*;
import java.awt.event.*;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.*;
class Conducted_Campus_Form extends Frame implements ActionListener
{
    Label lb_title, lb_campusid, lb_date, lb_scid, lb_compid, lb_type, lb_yrbr, lb_cri, lb_dsg, lb_pkg, lb_norounds, lb_nostuds, lb_appstud, lb_info;
    TextField tf_campusid, tf_date, tf_scid, tf_compid, tf_type, tf_yrbr1, tf_yrbr2,  tf_cri, tf_dsg, tf_pkg, tf_norounds, tf_nostuds,tf_appstud, tf_info, tf_sname, tf_fname;
    Button but_validate, but_add, but_save, but_back;
    BufferedWriter bw;
    BufferedReader  brsch,brcomp;

    Conducted_Campus_Form()
    {
        setSize(1100, 850);
        setLayout(null);
        setVisible(true);
        setBackground(Color.PINK);
        lb_title = new Label("Conducted Campus Drive Data Entry Form");
        lb_campusid = new Label("Campus Drive ID No.");
        lb_date = new Label("Drive Conduct Date");
        lb_scid = new Label("Against Schedule ID No.");
        lb_compid = new Label("Company's Data");
        lb_type = new Label("Drive Type");
        lb_yrbr = new Label("Drive for-BatchYear & Branch");
        lb_cri = new Label("Applicable Criteria");
        lb_dsg = new Label("Offered Designation");
        lb_pkg = new Label("Offered Package (in LPA)");
        lb_norounds = new Label("No. of Rounds Counducted");
        lb_nostuds = new Label("No. of Students Placed");
        lb_appstud = new Label("No. of Students Appeared");
        lb_info = new Label("Any Special Information");
        tf_campusid = new TextField();
        tf_date = new TextField();
        tf_scid = new TextField();
        tf_compid = new TextField();
        tf_type = new TextField();
        tf_yrbr1 = new TextField();
        tf_yrbr2 = new TextField();
        tf_cri = new TextField();
        tf_dsg = new TextField();
        tf_pkg = new TextField();
        tf_sname = new TextField();
        tf_fname = new TextField();
        tf_norounds = new TextField();
        tf_nostuds = new TextField();
        tf_appstud = new TextField();
        tf_info = new TextField();
        but_validate = new Button("Validate");
        but_add = new Button("Add Drive Data");
        but_save = new Button("Save Drive Data");
        but_back = new Button("Back to Main Menu");
        but_add.addActionListener(this);
        but_save.addActionListener(this);
        but_back.addActionListener(this);
        but_validate.addActionListener(this);

        Font f1, f2, f3;
        f1 = new Font("arial black", Font.PLAIN, 36);
        f2 = new Font("arial", Font.BOLD, 28);
        f3 = new Font("arial", Font.BOLD, 24);
        lb_title.setFont(f1);
        lb_campusid.setFont(f2);
        lb_date.setFont(f2);
        lb_scid.setFont(f2);
        lb_compid.setFont(f2);
        lb_type.setFont(f2);
        lb_yrbr.setFont(f2);
        lb_cri.setFont(f2);
        lb_dsg.setFont(f2);
        lb_pkg.setFont(f2);
        lb_norounds.setFont(f2);
        lb_nostuds.setFont(f2);
        lb_info.setFont(f2);
        tf_campusid.setFont(f3);
        tf_date.setFont(f3);
        tf_scid.setFont(f3);
        tf_sname.setFont(f3);
        tf_fname.setFont(f3);
        tf_compid.setFont(f3);
        tf_type.setFont(f3);
        tf_yrbr1.setFont(f3);
        tf_yrbr2.setFont(f3);
        tf_cri.setFont(f3);
        tf_dsg.setFont(f3);
        tf_pkg.setFont(f3);
        tf_norounds.setFont(f3);
        tf_nostuds.setFont(f3);
        tf_info.setFont(f3);
        but_add.setFont(f2);
        but_back.setFont(f2);
        but_save.setFont(f2);
        but_validate.setFont(f2);
        lb_appstud.setFont(f2);
        tf_appstud.setFont(f3);
        
        add(lb_title);
        add(lb_campusid);
        add(lb_date);
        add(lb_scid);
        add(lb_compid);
        add(lb_type);
        add(lb_yrbr);
        add(lb_cri);
        add(lb_dsg);
        add(lb_pkg);
        add(lb_norounds);
        add(lb_nostuds);
        add(lb_info);
        add(tf_campusid);
        add(tf_date);
        add(tf_scid);
        add(tf_compid);
        add(tf_type);
        add(tf_yrbr1);
        add(tf_yrbr2);
        add(tf_cri);
        add(tf_dsg);
        add(tf_pkg);
        add(tf_norounds);
        add(tf_nostuds);
        add(tf_info);
        add(tf_sname);
        add(tf_fname);
        add(but_add);
        add(but_back);
        add(but_save);
        add(but_validate);
        add(lb_appstud);
        add(tf_appstud);
        
        lb_title.setBounds(200, 100, 700, 40);
        lb_campusid.setBounds(100, 200, 400, 30);
        tf_campusid.setBounds(525, 200, 100, 30);
        lb_date.setBounds(100, 250, 400, 30);
        tf_date.setBounds(525, 250, 150, 30);
        lb_scid.setBounds(100, 300, 400, 30);
        tf_scid.setBounds(525, 300, 150, 30);
        but_validate.setBounds(700, 300, 150, 30);
        lb_compid.setBounds(100, 350, 400, 30);
        tf_compid.setBounds(525, 350, 100, 30);
        tf_sname.setBounds(650, 350, 100, 30);
        tf_fname.setBounds(775, 350, 200, 30);
        lb_type.setBounds(100, 400, 400, 30);
        tf_type.setBounds(525, 400, 150, 30);
        lb_yrbr.setBounds(100, 450, 400, 30);
        tf_yrbr1.setBounds(525, 450, 150, 30);
        tf_yrbr2.setBounds(725, 450, 150, 30);
        lb_cri.setBounds(100, 500, 400, 30);
        tf_cri.setBounds(525, 500, 200, 30);
        lb_dsg.setBounds(100, 550, 400, 30);
        tf_dsg.setBounds(525, 550, 150, 30);
        lb_pkg.setBounds(725, 550, 225, 30);
        tf_pkg.setBounds(975, 550, 100, 30);
        lb_norounds.setBounds(100, 600, 400, 30);
        tf_norounds.setBounds(525, 600, 100, 30);
        lb_appstud.setBounds(100, 650, 400, 30);
        tf_appstud.setBounds(525, 650, 75, 30);
        lb_nostuds.setBounds(625, 650, 300, 30);
        tf_nostuds.setBounds(950, 650, 75, 30);
        lb_info.setBounds(100, 700, 400, 30);
        tf_info.setBounds(525, 700, 300, 30);
        but_add.setBounds(100, 775,250, 30);
        but_save.setBounds(400, 775, 275, 30);
        but_back.setBounds(700, 775, 250, 30);
       /*  tf_campusid, tf_date, tf_scid, tf_compid, tf_type, tf_yrbr1, tf_yrbr2,  tf_cri, tf_dsg, tf_pkg, tf_norounds, tf_nostuds,tf_appstud, tf_info, tf_sname, tf_fname;*/

        
        tf_campusid.addKeyListener
        (
            new KeyAdapter()
            {
                public void keyTyped(KeyEvent ke)
                {
                    if(tf_campusid.getText().length() >= 6)
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

        tf_scid.addKeyListener
        (
            new KeyAdapter()
            {
                public void keyTyped(KeyEvent ke)
                {
                    if(tf_scid.getText().length() >= 6)
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
        tf_cri.addKeyListener
        (
            new KeyAdapter()
            {
                public void keyTyped(KeyEvent ke)
                {
                    if(tf_cri.getText().length() >= 25)
                    {
                        ke.consume();    
                    }
                }
            }
        );
        tf_dsg.addKeyListener
        (
            new KeyAdapter()
            {
                public void keyTyped(KeyEvent ke)
                {
                    if(tf_dsg.getText().length() >= 20)
                    {
                        ke.consume();    
                    }
                }
            }
        );
        tf_pkg.addKeyListener
        (
            new KeyAdapter()
            {
                public void keyTyped(KeyEvent ke)
                {
                    if(tf_pkg.getText().length() >= 6)
                    {
                        ke.consume();    
                    }
                    if(ke.getKeyChar() >= '0' && ke.getKeyChar() <= '9')
                        return;
                    else if(ke.getKeyChar() == '.')
                        return;
                    else 
                        ke.consume();
                }
            }
        );
         
        tf_norounds.addKeyListener
        (
            new KeyAdapter()
            {
                public void keyTyped(KeyEvent ke)
                {
                    if(tf_norounds.getText().length() >= 2)
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
        tf_nostuds.addKeyListener
        (
            new KeyAdapter()
            {
                public void keyTyped(KeyEvent ke)
                {
                    if(tf_norounds.getText().length() >= 3)
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
        tf_appstud.addKeyListener
        (
            new KeyAdapter()
            {
                public void keyTyped(KeyEvent ke)
                {
                    if(tf_norounds.getText().length() >= 3)
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
        tf_info.addKeyListener
        (
            new KeyAdapter()
            {
                public void keyTyped(KeyEvent ke)
                {
                    if(tf_dsg.getText().length() >= 30)
                    {
                        ke.consume();    
                    }
                }
            }
        );
        tf_campusid.setEditable(false);
         tf_date.setEditable(false); 
         tf_scid.setEditable(false); 
         tf_compid.setEditable(false); 
         tf_type.setEditable(false); 
         tf_yrbr1.setEditable(false);
          tf_yrbr2.setEditable(false);  
          tf_cri.setEditable(false);
          tf_dsg.setEditable(false);
           tf_pkg.setEditable(false);
           tf_norounds.setEditable(false); 
           tf_nostuds.setEditable(false);
           tf_appstud.setEditable(false);
            tf_info.setEditable(false);
        tf_sname.setEditable(false);  
        tf_fname.setEditable(false);
        but_validate.setEnabled(false);
        but_save.setEnabled(false);

       try{
        bw=new BufferedWriter(new FileWriter("Conducted_Drives.txt",true));

       }
       catch(IOException e1)
       {

       }
        
    }
    public void actionPerformed(ActionEvent ae)
   {
        if(ae.getSource()==but_add)
        {
           tf_campusid.setEditable(true);
           tf_date.setEditable(true); 
           tf_scid.setEditable(true); 
           tf_cri.setEditable(true);
           tf_dsg.setEditable(true);
           tf_pkg.setEditable(true);
           tf_norounds.setEditable(true); 
           tf_nostuds.setEditable(true);
           tf_appstud.setEditable(true);
           tf_info.setEditable(true);
           tf_sname.setEditable(true);  
           tf_fname.setEditable(true);
           but_validate.setEnabled(true);
           but_save.setEnabled(true);
           but_add.setEnabled(false);
           tf_campusid.requestFocus();
        }
        else if(ae.getSource()==but_save)
        {
            if(tf_campusid.getText().length() == 0)
            {
                tf_campusid.requestFocus();
                JOptionPane.showMessageDialog(this, "Campus ID No. should not be Empty, Please Enter Campus No..");
            }
            else if(tf_date.getText().length() == 0)
            {
                tf_date.requestFocus();
                JOptionPane.showMessageDialog(this, "Campus Drive Date should not be Empty, Please Enter Campus Drive Date.");
            }
            else if(tf_scid.getText().length() == 0)
            {
                tf_scid.requestFocus();
                JOptionPane.showMessageDialog(this, "Schedule Id should not be Empty, Please Enter Schedule Id.");
            }
            else if(tf_compid.getText().length() == 0)
            {
                JOptionPane.showMessageDialog(this, "Company ID  should not be Empty, Please Enter Company ID.");
            }
            else if(tf_type.getText().length() == 0)
            {
                JOptionPane.showMessageDialog(this, "Drive Type  should not be Empty, Please Enter Drive Type.");
            }
            else if(tf_cri.getText().length() == 0)
            {
                tf_cri.requestFocus();
                JOptionPane.showMessageDialog(this, "Applicable Criteria should not be Empty, Please Enter Applicable Criteria.");
            }
            else if(tf_dsg.getText().length() == 0)
            {
                tf_dsg.requestFocus();
                JOptionPane.showMessageDialog(this, "Designation should not be Empty, Please Enter Designation.");
            }
            else if(tf_pkg.getText().length() == 0)
            {
                tf_pkg.requestFocus();
                JOptionPane.showMessageDialog(this, "Package should not be Empty, Please Enter Package");
            }
            else if(tf_norounds.getText().length() == 0)
            {
                tf_norounds.requestFocus();
                JOptionPane.showMessageDialog(this, "No of Rounds should not be Empty, Please Enter No of Rounds ");
            }
            else if(tf_nostuds.getText().length() == 0)
            {
                tf_nostuds.requestFocus();
                JOptionPane.showMessageDialog(this, "No of Students should not be Empty, Please Enter No of Students");
            }
            else if(tf_appstud.getText().length() == 0)
            {
                tf_appstud.requestFocus();
                JOptionPane.showMessageDialog(this, "Appeared Students should not be Empty, Please Enter Appeared Students");
            }
            else
            {
                String cid = tf_campusid.getText();
                String cdate = tf_date.getText();
                String sid = tf_scid.getText();
                String compid = tf_compid.getText();
                String drtype = tf_type.getText();
                String crit = tf_cri.getText();
                String desig = tf_dsg.getText();
                String pack = tf_pkg.getText();
                String rounds = tf_norounds.getText();
                String appear= tf_appstud.getText();
                String placed = tf_nostuds.getText();
                String special = tf_info.getText();
                if(special.length()==0)
                {
                    special="-";
                }
                
                try
                {
                    bw.write(cid + "$" + cdate + "$" + sid + "$" + compid + "$" + drtype + "$" + crit + "$" + desig+ "$" + pack+ "$" + rounds+ "$" + appear+ "$" + placed+ "$" + special);
                    bw.newLine();
                    JOptionPane.showMessageDialog(this, "Conuduted Campus Drive Data is Added successfully.");
                }
                catch(IOException ioe3)
                {

                }
                tf_campusid.setText("");
                tf_date.setText("");
                tf_scid.setText("");
                tf_cri.setText("");
                tf_dsg.setText("");
                tf_pkg.setText("");
                tf_norounds.setText("");
                tf_nostuds.setText("");
                tf_appstud.setText("");
                tf_info.setText("");
                tf_sname.setText("");
                tf_fname.setText("");
                tf_yrbr1.setText("");
                tf_yrbr2.setText("");
                tf_type.setText("");
                tf_compid.setText("");
                tf_campusid.setEditable(false);
                tf_date.setEditable(false); 
                tf_scid.setEditable(false); 
                tf_cri.setEditable(false);
                tf_dsg.setEditable(false);
                tf_pkg.setEditable(false);
                tf_norounds.setEditable(false); 
                tf_nostuds.setEditable(false);
                tf_appstud.setEditable(false);
                tf_info.setEditable(false);
                tf_sname.setEditable(false);  
                tf_fname.setEditable(false);
                but_save.setEnabled(false);
                but_validate.setEnabled(false);
                but_add.setEnabled(true);
               
            }   
        }
        else if(ae.getSource()==but_back)
        {
            try{
                bw.close();

            }
            catch(IOException e2)
            {

            }
            dispose();
        
        }
        else if(ae.getSource()==but_validate)
        {
            if(tf_scid.getText().length()==0)
            {
                tf_scid.requestFocus();
                JOptionPane.showMessageDialog(this,"Schedule No. is not entered,so it cannot be validated,pls enter");
            }
            else{
                 schedule_validate();
            }
           
        }
   
    } 
    void schedule_validate()
    {
       String sch,comp;
       String schdata[]=null,compdata[]=null;
       int chk=0;
       try{
        brsch=new BufferedReader(new FileReader("Drive_Schedule.txt"));

       while((sch=brsch.readLine())!=null)
       {
          schdata=sch.split("\\$");
          if(Integer.parseInt(schdata[0])==Integer.parseInt(tf_scid.getText()))
          {
            chk=1;
            break;
          }
       } 
        brsch.close();
         tf_compid.setEditable(true); 
         tf_sname.setEditable(true);  
         tf_fname.setEditable(true);
         tf_type.setEditable(true); 
         tf_yrbr1.setEditable(true);
         tf_yrbr2.setEditable(true); 
        
        
       if(chk==1)
       {
          tf_compid.setText(schdata[2]);
          brcomp=new BufferedReader(new FileReader("JobCompanies.txt"));
          while((comp=brcomp.readLine())!= null)
          {
            compdata=comp.split("\\$");
            if(Integer.parseInt(compdata[0])==Integer.parseInt(tf_compid.getText()))
               break;
          
          }
          brcomp.close();
          tf_sname.setText(compdata[1]);
          tf_fname.setText(compdata[2]);
          tf_type.setText(schdata[3]);
          tf_yrbr1.setText(schdata[4]);
          tf_yrbr2.setText(schdata[5]);
          
       }
       else{
        tf_compid.setText("xx");
        tf_sname.setText("xx");
        tf_fname.setText("xx");
        tf_type.setText("xx");
        tf_yrbr1.setText("xx");
        tf_yrbr2.setText("xx");
        JOptionPane.showMessageDialog(this,"Entered schedule Id No. is invalid,pls enter the correct No. and then validate");
        
       }
       tf_compid.setEditable(false); 
       tf_sname.setEditable(false);  
       tf_fname.setEditable(false);
       tf_type.setEditable(false); 
       tf_yrbr1.setEditable(false);
       tf_yrbr2.setEditable(false);  
    }
       catch(IOException e3)
       {

       }
       

    }
       public static void main(String args[])
    {
        Conducted_Campus_Form obj_dsf = new Conducted_Campus_Form();
        obj_dsf.addWindowListener(
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