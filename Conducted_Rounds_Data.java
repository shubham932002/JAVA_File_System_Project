
import java.awt.*;
import java.awt.event.*;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.*;
public class Conducted_Rounds_Data extends Frame implements ActionListener
{
   Label lb_title,lb_driveid,lb_date,lb_roundno,lb_roundtitle,lb_skills,lb_qualified,lb_prn, lb_comp;
   TextField tf_driveid,tf_date,tf_roundno,tf_roundtitle,tf_skills,tf_qualified,tf_prn, tf_compid, tf_shortname, tf_fullname;
   Button but_add,but_save,but_back,but_validate;
   BufferedWriter bw=null;
   BufferedReader brdrive=null, brcomp = null;
   Conducted_Rounds_Data()
   {
    setSize(1050,800);
    setVisible(true);
    setLayout(null);
    setBackground(Color.pink);
    lb_title=new Label("Campus Drivewise Conducted Rounds Data Entry Form");
    lb_driveid=new Label("Against Campus Drive Id No.");
    lb_date=new Label("Drive Conduct Date");
    lb_roundno=new Label("Round Number");
    lb_roundtitle=new Label("Round Title");
    lb_skills=new Label("Tested Skills");
    lb_qualified=new Label("No of Students Qualified");
    lb_prn=new Label("Qualified Students PRN");
    lb_comp = new Label("Company's ID, Name");
 
    
    tf_driveid=new TextField();
    tf_date=new TextField();
    tf_roundno=new TextField();
    tf_roundtitle=new TextField();
    tf_skills=new TextField();
    tf_qualified=new TextField();
    tf_prn=new TextField();
    tf_compid=new TextField();
    tf_shortname=new TextField();
    tf_fullname=new TextField();
    
    but_add=new Button("Add Rounds Data");
    but_save=new Button("Save Rounds Data");
    but_back=new Button("Back to Menu");
    but_validate=new Button("Validate Drive");

    but_add.addActionListener(this);
    but_save.addActionListener(this);
    but_back.addActionListener(this);
    but_validate.addActionListener(this);
 

    Font f1,f2,f3;
    f1=new Font("arial black",Font.PLAIN,34);
    f2=new Font("arial",Font.BOLD,30);
    f3 = new Font("arial", Font.BOLD, 26);
    lb_title.setFont(f1);
    lb_prn.setFont(f2);
    lb_driveid.setFont(f2);
    lb_date.setFont(f2);
    lb_roundno.setFont(f2);
    lb_roundtitle.setFont(f2);
    lb_skills.setFont(f2);
    lb_qualified.setFont(f2);
    lb_prn.setFont(f2);
    lb_comp.setFont(f2);
    tf_driveid.setFont(f3);
    tf_date.setFont(f3);
    tf_roundno.setFont(f3);
    tf_roundtitle.setFont(f3);
    tf_skills .setFont(f3);
    tf_qualified.setFont(f3);
    tf_prn.setFont(f3);
    tf_compid.setFont(f3);
    tf_shortname.setFont(f3);
    tf_fullname.setFont(f3);
    but_add.setFont(f2);
    but_save.setFont(f2);
    but_back.setFont(f2);
    but_validate.setFont(f2);

    add(lb_title);
    add(lb_prn);
    add(lb_driveid);
    add(lb_date);
    add(lb_roundno);
    add(lb_roundtitle);
    add(lb_skills);
    add(lb_qualified);
    add(lb_prn);
    add(tf_driveid);
    add(tf_date);
    add(tf_roundno);
    add(tf_roundtitle);
    add(tf_skills);
    add(tf_qualified);
    add(tf_prn);
    add(lb_comp);
    add(tf_compid);
    add(tf_shortname);
    add(tf_fullname);
    add(but_add);
    add(but_save);
    add(but_back);
    add(but_validate);

    lb_title.setBounds(125,50,900,40);
    lb_driveid.setBounds(50,125,450,35);
    tf_driveid.setBounds(550,125,100,35);
    but_validate.setBounds(720,125,250,35);
    lb_date.setBounds(50,200,450,35);
    tf_date.setBounds(550,200,300,35);
    lb_comp.setBounds(50,275, 325, 35);
    tf_compid.setBounds(550, 275, 50, 35);
    tf_shortname.setBounds(625, 275, 100, 35);
    tf_fullname.setBounds(750, 275, 275, 35);
    lb_roundno.setBounds(50,350,450,35);
    tf_roundno.setBounds(550,350,300,35);
    lb_roundtitle.setBounds(50,425,450,35);
    tf_roundtitle.setBounds(550,425,300,35);
    lb_skills.setBounds(50,500,450,35);
    tf_skills.setBounds(550,500,300,35);
    lb_qualified.setBounds(50,575,450,35);
    tf_qualified.setBounds(550,575,300,35);
    lb_prn.setBounds(50,650,450,35);
    tf_prn.setBounds(550,650,300,35);
    but_add.setBounds(50,725,275,35);
    but_save.setBounds(350,725,325,35);
    but_back.setBounds(700,725,275,35);

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

        tf_roundno.addKeyListener
        (
            new KeyAdapter()
            {
                public void keyTyped(KeyEvent ke)
                {
                    if(tf_roundno.getText().length() >= 2)
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

        tf_roundtitle.addKeyListener
        (
            new KeyAdapter()
            {
                public void keyTyped(KeyEvent ke)
                {
                    if(tf_roundtitle.getText().length() >= 25)
                    {
                        ke.consume();    
                    }
                }
            }
        );

        tf_skills.addKeyListener
        (
            new KeyAdapter()
            {
                public void keyTyped(KeyEvent ke)
                {
                    if(tf_skills.getText().length() >= 30)
                    {
                        ke.consume();    
                    }
                }
            }
        );

        tf_qualified.addKeyListener
        (
            new KeyAdapter()
            {
                public void keyTyped(KeyEvent ke)
                {
                    if(tf_qualified.getText().length() >= 4)
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
        tf_date.setEditable(false);
        tf_roundno.setEditable(false);
        tf_roundtitle.setEditable(false);
        tf_skills.setEditable(false);
        tf_qualified.setEditable(false);
        tf_prn.setEditable(false);
        tf_compid.setEditable(false);
        tf_shortname.setEditable(false);
        tf_fullname.setEditable(false);
        but_validate.setEnabled(false);
        but_save.setEnabled(false);
            
        try{
            bw = new BufferedWriter(new FileWriter("Rounds.txt", true));
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
        tf_roundno.setEditable(true);
        tf_roundtitle.setEditable(true);
        tf_skills.setEditable(true);
        tf_qualified.setEditable(true);
        tf_prn.setEditable(true);
        but_validate.setEnabled(true);
        but_save.setEnabled(true);
        but_add.setEnabled(false);
        tf_driveid.requestFocus();
    }
    else if(ae.getSource()==but_save)
    {
        if(tf_driveid.getText().length() == 0)
        {
            tf_driveid.requestFocus();
            JOptionPane.showMessageDialog(this, "Campus Drive ID No. should not be left empty. Please Enter Campus Drive ID No.");
        }
        else if(tf_roundno.getText().length() == 0)
        {
            tf_roundno.requestFocus();
            JOptionPane.showMessageDialog(this, "Drive Round No. should not be left empty. Please Enter Drive Round No.");
        }
        else if(tf_roundtitle.getText().length() == 0)
        {
            tf_roundtitle.requestFocus();
            JOptionPane.showMessageDialog(this, "Drive Round Title. should not be left empty. Please Enter Drive Round Title.");
        }
        else if(tf_skills.getText().length() == 0)
        {
            tf_skills.requestFocus();
            JOptionPane.showMessageDialog(this, "Skills Tested should not be left empty. Please Enter Tested Skills.");
        }
        else if(tf_qualified.getText().length() == 0)
        {
            tf_qualified.requestFocus();
            JOptionPane.showMessageDialog(this, "No. of Students Qualified should not be left empty. Please Enter No. of Students Qualified.");
        }
        else if(tf_prn.getText().length() == 0)
        {
            tf_prn.requestFocus();
            JOptionPane.showMessageDialog(this, "Student PRN should not be left empty. Please Enter Students PRN.");
        }
        else 
        {
            String idno = tf_driveid.getText();
            String compid = tf_compid.getText();
            String rno = tf_roundno.getText(); 
            String rtitle = tf_roundtitle.getText();
            String skills = tf_skills.getText();
            String qs = tf_qualified.getText();
            String prn = tf_prn.getText();
            try{
                bw.write(idno + "$" + compid + "$" + rno + "$" + rtitle + "$" + skills + "$" + qs + "$" + prn);
                bw.newLine();
                JOptionPane.showMessageDialog(this, "Rounds Data is Added Successfully.");
            }
            catch(IOException ioe4)
            {

            }
            tf_date.setEditable(true);
            tf_shortname.setEditable(true);
            tf_fullname.setEditable(true);
            tf_compid.setEditable(true);
            tf_driveid.setText("");
            tf_roundno.setText("");
            tf_roundtitle.setText("");
            tf_skills.setText("");
            tf_qualified.setText("");
            tf_prn.setText("");
            tf_date.setText("");
            tf_compid.setText("");
            tf_shortname.setText("");
            tf_fullname.setText("");
            
            
            tf_date.setEditable(false);
            tf_shortname.setEditable(false);
            tf_fullname.setEditable(false);
            tf_compid.setEditable(false);   
            tf_driveid.setEditable(false);
            tf_roundno.setEditable(false);
            tf_roundtitle.setEditable(false);
            tf_skills.setEditable(false);
            tf_qualified.setEditable(false);
            tf_prn.setEditable(false);
            but_validate.setEnabled(false);
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

        }
        dispose();
        
    }
    else if(ae.getSource()==but_validate)
    {
        if(tf_driveid.getText().length() == 0)
        {
            tf_driveid.requestFocus();
            JOptionPane.showMessageDialog(this, "Campus Drive ID No. should not be left empty. Please Enter Campus Drive ID No.");
        }
        else 
        {
            rounds_validate();
        }
    }
    
}
  void rounds_validate()
  {
        String drive , comp;
        String drivedata[] = null, compdata[] = null;
        int chk = 0;
        try
        {
            brdrive = new BufferedReader(new FileReader("Conducted_Drives.txt"));
            while((drive = brdrive.readLine()) != null)
            {
                drivedata = drive.split("\\$");
                if(Integer.parseInt(drivedata[0])== Integer.parseInt(tf_driveid.getText()))
                {
                    chk = 1;
                    break;
                }
            }
            brdrive.close();
            tf_date.setEditable(true);
            tf_compid.setEditable(true);
            tf_shortname.setEditable(true);
            tf_fullname.setEditable(true);  
            if(chk == 1)
            {
                   tf_date.setText(drivedata[1]);
                   tf_compid.setText(drivedata[3]);
                   brcomp = new BufferedReader(new FileReader("JobCompanies.txt"));
                   while((comp = brcomp.readLine()) != null)
                   {
                        compdata = comp.split("\\$");
                        if(Integer.parseInt(compdata[0]) == Integer.parseInt(tf_compid.getText()))
                        {
                            break;
                        }
                   }
                   brcomp.close();
                   tf_shortname.setText(compdata[1]);
                   tf_fullname.setText(compdata[2]);
            }
            else
            {
                tf_date.setText("xx");
                tf_compid.setText("xx");
                tf_shortname.setText("xx");
                tf_fullname.setText("xx");
                tf_driveid.requestFocus();
                JOptionPane.showMessageDialog(this, "Invalid Drive ID No., Please check and enter Correct Drive ID.");
            }
            tf_date.setEditable(false);
            tf_compid.setEditable(false);
            tf_shortname.setEditable(false);
            tf_fullname.setEditable(false);
        }
        catch(IOException ioe2)
        {

        }
  }
  
     
   public static void main(String args[])
   {
 Conducted_Rounds_Data obj=new Conducted_Rounds_Data();
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