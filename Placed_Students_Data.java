
import java.awt.*;
import java.awt.event.*;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.*;
public class Placed_Students_Data extends Frame implements ActionListener
{
   Label lb_title, lb_driveid, lb_date, lb_compid, lb_studprn, lb_studname;
   TextField tf_driveid, tf_date, tf_compid, tf_shortname, tf_fullname, tf_studprn, tf_studname;
   Button but_add, but_save, but_back, but_validate_drive, but_validate_stud;
   BufferedWriter bw = null;
   BufferedReader brdrive = null, brcomp = null, brstud = null;
   Placed_Students_Data()
   {
    setSize(1100,600);
    setVisible(true);
    setLayout(null);
    setBackground(Color.pink);
    lb_title = new Label("Campus Drivewise Placed Students Data Entry Form");
    lb_driveid = new Label("Against Campus Drive Id No.");
    lb_date = new Label("Drive Conduct Date");
    lb_compid = new Label("Company's ID, Name");
    lb_studprn = new Label("Student PRN");
    lb_studname = new Label("Student Name");
 
    
    tf_driveid = new TextField();
    tf_date = new TextField();
    tf_compid = new TextField();
    tf_shortname = new TextField();
    tf_fullname = new TextField();
    tf_studprn = new TextField();
    tf_studname = new TextField();
    
    but_add = new Button("Add Rounds Data");
    but_save = new Button("Save Rounds Data");
    but_back = new Button("Back to Menu");
    but_validate_drive = new Button("Validate Drive");
    but_validate_stud = new Button("Validate Student");

    but_add.addActionListener(this);
    but_save.addActionListener(this);
    but_back.addActionListener(this);
    but_validate_drive.addActionListener(this);
    but_validate_stud.addActionListener(this);
 

    Font f1,f2,f3;
    f1=new Font("arial black",Font.PLAIN,38);
    f2=new Font("arial",Font.BOLD,28);
    f3 = new Font("arial", Font.BOLD, 24);
    lb_title.setFont(f1);
    lb_driveid.setFont(f2);
    lb_date .setFont(f2);
    lb_compid.setFont(f2); 
    lb_studprn.setFont(f2);
    lb_studname.setFont(f2);
    tf_driveid.setFont(f3);
    tf_date.setFont(f3);
    tf_compid.setFont(f3);
    tf_shortname.setFont(f3);
    tf_fullname.setFont(f3);
    tf_studprn.setFont(f3);
    tf_studname.setFont(f3);
    but_add.setFont(f2);
    but_save.setFont(f2);
    but_back.setFont(f2);
    but_validate_drive.setFont(f2);
    but_validate_stud.setFont(f2);

    

    add(lb_title);
    add(lb_driveid);
    add(lb_date );
    add(lb_compid );
    add(lb_studprn);
    add(lb_studname);
    add(tf_driveid);
    add(tf_date);
    add(tf_compid);
    add(tf_shortname);
    add(tf_fullname);
    add(tf_studprn);
    add(tf_studname);
    add(but_add);
    add(but_save);
    add(but_back);
    add(but_validate_drive);
    add(but_validate_stud);


    
    lb_title.setBounds(125, 50, 925, 40);
    lb_driveid.setBounds(100, 150, 400, 30);
    tf_driveid.setBounds(525, 150, 100, 30);
    but_validate_drive.setBounds(675, 150, 200, 30);
    lb_date .setBounds(100, 200, 400, 30);
    tf_date.setBounds(525, 200, 100, 30);
    lb_compid .setBounds(100, 250, 400, 30);
    tf_compid.setBounds(525, 250, 100, 30);
    tf_shortname.setBounds(650, 250, 100, 30);
    tf_fullname.setBounds(775, 250, 275, 30);
    lb_studprn.setBounds(100, 300, 400, 30);
    tf_studprn.setBounds(525, 300, 150, 30);
    but_validate_stud.setBounds(700, 300, 250, 30);
    lb_studname.setBounds(100, 350, 400, 30);
    tf_studname.setBounds(525, 350, 350, 30);
    but_add.setBounds(100, 450, 275, 30);
    but_save.setBounds(400, 450, 275, 30);
    but_back.setBounds(700, 450, 275, 30);
    
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

        tf_studprn.addKeyListener
        (
            new KeyAdapter()
            {
                public void keyTyped(KeyEvent ke)
                {
                    if(tf_driveid.getText().length() >= 7)
                    {
                        ke.consume();    
                    }
                    if(ke.getKeyChar() >= '0' && ke.getKeyChar() <= '9')
                        return;
                    else if(ke.getKeyChar() >= 'A' && ke.getKeyChar() <= 'Z')
                        return;
                    else if(ke.getKeyChar() >= 'a' && ke.getKeyChar() <= 'z')
                        return;
                    else 
                        ke.consume();
                }
            }
        );

        tf_driveid.setEditable(false);
        tf_date.setEditable(false); 
        tf_compid.setEditable(false);
        tf_shortname.setEditable(false);
        tf_fullname.setEditable(false); 
        tf_studprn.setEditable(false); 
        tf_studname.setEditable(false);
        but_save.setEnabled(false);
        but_validate_drive.setEnabled(false);
        but_validate_stud.setEnabled(false);
            
        try{
            bw = new BufferedWriter(new FileWriter("Placed_Students.txt", true));
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
        tf_studprn.setEditable(true); 
        but_add.setEnabled(false);
        but_save.setEnabled(true);
        but_validate_drive.setEnabled(true);
        but_validate_stud.setEnabled(true);
    }
    else if(ae.getSource()==but_save)
    {
        if(tf_driveid.getText().length() == 0)
        {
            tf_driveid.requestFocus();
            JOptionPane.showMessageDialog(this, "Campus Drive ID No. should not be left empty. Please Enter Campus Drive ID No.");
        }
        
        else if(tf_studprn.getText().length() == 0)
        {
            tf_studprn.requestFocus();
            JOptionPane.showMessageDialog(this, "Student PRN should not be left empty. Please Enter Students PRN.");
        }
        else if(tf_compid.getText().length() == 0 || tf_compid.getText().equals("xx") || tf_studname.getText().length() == 0 || tf_studname.getText().equals("xx"))
        {
            JOptionPane.showMessageDialog(this, "Incorrect Input Data, please check.");
        }
        else 
        {
            String idno = tf_driveid.getText();
            String compid = tf_compid.getText();
            String prn = tf_studprn.getText();
            try{
                bw.write(idno + "$" + compid + "$" + prn);
                bw.newLine();
                JOptionPane.showMessageDialog(this, "Placed Student's Data is Added Successfully.");
            }
            catch(IOException ioe4)
            {

            }
            tf_date.setEditable(true);
            tf_compid.setEditable(true);
            tf_shortname.setEditable(true);
            tf_fullname.setEditable(true);
            tf_studname.setEditable(true);
            tf_driveid.setText("");
            tf_studprn.setText("");
            tf_date.setText("");
            tf_compid.setText("");
            tf_shortname.setText("");
            tf_fullname.setText("");
            tf_studprn.setText("");
            tf_studname.setText("");
            
            
            tf_driveid.setEditable(false);
            tf_date.setEditable(false);
            tf_shortname.setEditable(false);
            tf_fullname.setEditable(false);
            tf_compid.setEditable(false);   
            tf_studprn.setEditable(false);
            tf_studname.setEditable(false);
            but_validate_drive.setEnabled(false);
            but_validate_stud.setEnabled(false);
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
    else if(ae.getSource()==but_validate_drive)
    {
        if(tf_driveid.getText().length() == 0)
        {
            tf_driveid.requestFocus();
            JOptionPane.showMessageDialog(this, "Campus Drive ID No. should not be left empty. Please Enter Campus Drive ID No.");
        }
        else 
        {
            Drive_Validate();
        }
    }

    else if(ae.getSource()==but_validate_stud)
    {
        if(tf_studprn.getText().length() == 0)
        {
            tf_driveid.requestFocus();
            JOptionPane.showMessageDialog(this, "Student PRN should not be left empty. Please Student PRN.");
        }
        else 
        {
            Student_Validate();
        }
    }
    
}
  void Drive_Validate()
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

  void Student_Validate()
  {
        String stud;
        String studdata[]= null;
        int chk = 0;
        try
        {
            brstud = new BufferedReader(new FileReader("Registration.txt"));
            while((stud = brstud.readLine()) != null)
            {
                studdata = stud.split("\\$");
                if(tf_studprn.getText().equals(studdata[0]))
                {
                    chk = 1;
                    break;
                }
            }
            brstud.close();
            if(chk == 1)
            {
                tf_studname.setEditable(true);
                tf_studname.setText(studdata[1]);
                tf_studname.setEditable(false);
            }
            else
            {
                tf_studname.setEditable(true);
                tf_studname.setText("xx");
                tf_studname.setEditable(false);
                JOptionPane.showMessageDialog(this, "Invalid Student PRN, Please check and enter Correct Drive ID.");
            }
        }
        catch(IOException ioe2)
        {

        }
  }
  
     
   public static void main(String args[])
   {
 Placed_Students_Data obj=new Placed_Students_Data();
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