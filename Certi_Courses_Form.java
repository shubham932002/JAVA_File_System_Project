//Application - 8
//Students Certified Courses Form
import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class Certi_Courses_Form extends Frame implements ActionListener
{
    Label lb_title, lb_prn, lb_srno, lb_crtitle, lb_crdur, lb_content, lb_result, lb_studname;
    TextField tf_prn, tf_srno, tf_crtitle, tf_crdur, tf_content, tf_result, tf_studname;
    Button but_new, but_save, but_back, but_validate;
    BufferedReader br=null;
    BufferedWriter bw=null;
    Certi_Courses_Form()
    {
        setSize(1000, 700);
        setVisible(true);
        setLayout(null);
        setTitle("Application - 8");
        setBackground(Color.PINK);
        lb_title = new Label("Registered Students Certified Courses Data Retrieval Form");
        lb_prn = new Label("Student PRN");
        lb_srno = new Label("Course Sr. No.");
        lb_crtitle = new Label("Course Title");
        lb_crdur = new Label("Course Duration");
        lb_content = new Label("Highlighted Key Content");
        lb_result = new Label("Result (in %)");
        lb_studname = new Label("Student Name");
        tf_prn = new TextField();
        tf_srno = new TextField();
        tf_crtitle = new TextField();
        tf_crdur = new TextField();
        tf_content = new TextField();
        tf_result = new TextField();
        tf_studname = new TextField();
        but_new = new Button("Add New Course");
        but_save = new Button("Save Course Data");
        but_back = new Button("Back to Menu");
        but_validate = new Button("Validate PRN");
        but_new.addActionListener(this);
        but_save.addActionListener(this);
        but_back.addActionListener(this);
        but_validate.addActionListener(this);

        Font f1, f2, f3;
        f1 = new Font("arial black", Font.PLAIN, 34);
        f2 = new Font("arial", Font.BOLD, 28);
        f3 = new Font("arial", Font.BOLD, 22);

        lb_title.setFont(f1);
        lb_prn.setFont(f2);
        tf_prn.setFont(f3);
        lb_srno.setFont(f2);
        tf_srno.setFont(f3);
        lb_crtitle.setFont(f2);
        tf_crtitle.setFont(f3);
        lb_crdur.setFont(f2);
        tf_crdur.setFont(f3);
        lb_content.setFont(f2);
        tf_content.setFont(f3);
        lb_result.setFont(f2);
        lb_studname.setFont(f2);
        tf_studname.setFont(f3);
        tf_result.setFont(f3);
        but_new.setFont(f2);
        but_save.setFont(f2);
        but_back.setFont(f2);
        but_validate.setFont(f3);

        add(lb_title);
        add(lb_prn);
        add(tf_prn);
        add(lb_srno);
        add(tf_srno);
        add(lb_crtitle);
        add(tf_crtitle);
        add(lb_crdur);
        add(tf_crdur);
        add(lb_content);
        add(tf_content);
        add(lb_result);
        add(tf_result);
        add(lb_studname);
        add(tf_studname);
        add(but_new);
        add(but_save);
        add(but_back);
        add(but_validate);


        lb_title.setBounds(40, 100, 925, 40);
        lb_prn.setBounds(200, 200, 200, 30);
        tf_prn.setBounds(550, 200, 200, 30);
        but_validate.setBounds(775, 200, 200, 30);
        lb_studname.setBounds(200, 250, 350, 30);
        tf_studname.setBounds(550, 250, 200, 30);
        lb_srno.setBounds(200, 300, 350, 30);
        tf_srno.setBounds(550, 300, 200, 30);
        lb_crtitle.setBounds(200, 350, 350, 30);
        tf_crtitle.setBounds(550, 350, 200, 30);
        lb_crdur.setBounds(200, 400, 350, 30);
        tf_crdur.setBounds(550, 400, 200, 30);
        lb_content.setBounds(200, 450, 350, 30);
        tf_content.setBounds(550, 450, 200, 30);
        lb_result.setBounds(200, 500, 350, 30);
        tf_result.setBounds(550, 500, 200, 30);
        but_new.setBounds(100, 600, 250, 30);
        but_save.setBounds(400, 600, 250, 30);
        but_back.setBounds(700, 600, 250, 30);

        tf_srno.addKeyListener(
            new KeyAdapter()
            {
                public void keyTyped(KeyEvent ke)
                {
                    if(tf_srno.getText().length() >= 2)
                        ke.consume();
                    if(ke.getKeyChar() >= '0' && ke.getKeyChar() <= '9')
                        return;
                }
            }
        );
        
        tf_crtitle.addKeyListener
        (
            new KeyAdapter()
            {
                public void keyTyped(KeyEvent ke)
                {
                    if(tf_crtitle.getText().length() >=25)   
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
                    else if(ke.getKeyChar() == ' ' || ke.getKeyChar() == '+')
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

        tf_crdur.addKeyListener
        (
            new KeyAdapter()
            {
                public void keyTyped(KeyEvent ke)
                {
                    if(tf_crdur.getText().length() >=15)   
                    {
                        ke.consume();
                    }
                }
            }
        );

        tf_content.addKeyListener
        (
            new KeyAdapter()
            {
                public void keyTyped(KeyEvent ke)
                {
                    if(tf_content.getText().length() >=40)   
                    {
                        ke.consume();
                    }
                }
            }
        );

        tf_result.addKeyListener
        (
            new KeyAdapter()
            {
                public void keyTyped(KeyEvent ke)
                {
                    if(tf_result.getText().length() >= 5)
                    {
                        ke.consume();    
                    }
                    if(ke.getKeyChar() >= '0' && ke.getKeyChar() <= '9' || ke.getKeyChar() == '.') 
                        return;
                    else 
                        ke.consume();
                }
            }
        );

        tf_prn.setEditable(false);
        but_validate.setEnabled(false);
        tf_studname.setEditable(false);
        tf_srno.setEditable(false);
        tf_crtitle.setEditable(false);
        tf_crdur.setEditable(false);
        tf_content.setEditable(false);
        tf_result.setEditable(false);
        but_save.setEnabled(false);

        try{
            bw = new BufferedWriter(new FileWriter("CertiCourses.txt", true));
        }
        catch(IOException ioe1)
        {
            
        }
    }
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource() == but_new)
        {
            tf_prn.setEditable(true);
            but_validate.setEnabled(true);
            tf_srno.setEditable(true);
            tf_crtitle.setEditable(true);
            tf_crdur.setEditable(true);
            tf_content.setEditable(true);
            tf_result.setEditable(true);
            but_save.setEnabled(true);
            but_new.setEnabled(false);
        }
        else if(ae.getSource() == but_save)
        {
            if(tf_prn.getText().length() == 0)
            {
                tf_prn.requestFocus();
                JOptionPane.showMessageDialog(this, "Student PRN is left empty, please Enter Student PRN.");
            }
            else if(tf_studname.getText().equals("xx") || tf_studname.getText().length() == 0)
            {
                JOptionPane.showMessageDialog(this,"Input PRN is INVALID, so record will not be Saved.");
            }
            else if(tf_srno.getText().length() == 0)
            {
                tf_srno.requestFocus();
                JOptionPane.showMessageDialog(this, "Serial No. of Course is left Empty.");
            }
            else if(tf_crtitle.getText().length() == 0)
            {
                tf_crtitle.requestFocus();
                JOptionPane.showMessageDialog(this, "Course Title is left empty. Please enter Course Title..");
            }
            else if(tf_crdur.getText().length() == 0)
            {
                tf_crdur.requestFocus();
                JOptionPane.showMessageDialog(this, "Course Duration is left empty. Please enter Course Duation.");
            }
            else if(tf_content.getText().length() == 0)
            {
                tf_content.requestFocus();
                JOptionPane.showMessageDialog(this, "Highlighted Key Content of Course cannot be left empty..");
            }
            else if(tf_result.getText().length() == 0)
            {
                tf_result.requestFocus();
                JOptionPane.showMessageDialog(this, "Course Result is left empty. PLease enter Course Result.");
            }
            else
            {
                String prn=tf_prn.getText();
                String srno=tf_srno.getText();
                String title=tf_crtitle.getText();
                String crduration=tf_crdur.getText();
                String content=tf_content.getText();
                String crresult=tf_result.getText();
                try{
                    bw.write(prn + "$" + srno + "$" + title + "$" + crduration + "$" + content + "$" + crresult);
                    bw.newLine();
                    JOptionPane.showMessageDialog(this, "Student's Certified Courses Record Added Successfully.");
                    tf_prn.setText("");
                    tf_studname.setText("");
                    tf_srno.setText("");
                    tf_crtitle.setText("");
                    tf_crdur.setText("");
                    tf_content.setText("");
                    tf_result.setText("");
                    tf_prn.setEditable(false);
                    but_validate.setEnabled(false);
                    tf_studname.setEditable(false);
                    tf_srno.setEditable(false);
                    tf_crtitle.setEditable(false);
                    tf_crdur.setEditable(false);
                    tf_content.setEditable(false);
                    tf_result.setEditable(false);
                    but_save.setEnabled(false);
                    but_back.setEnabled(true);
                    but_new.setEnabled(true);
                }
                catch(IOException ioe3){
                    {
                        
                    }
                    
                }
            }
        }
        else if(ae.getSource() == but_back)
        {
            try{
                bw.close();
            }
            catch(IOException ioe2)
            {
    
            }
            dispose();
        }
        else if(ae.getSource() == but_validate)
        {
            /*if(tf_prn.getText().length() == 0)
            {
                tf_prn.requestFocus();
                JOptionPane.showMessageDialog(this, "Student PRN is left empty, please enter Student PRN.");
            }
            else 
            {*/
                String rv = validateprn();
                if(rv.equals("xx"))
                {
                    tf_prn.requestFocus();
                    JOptionPane.showMessageDialog(this, "Input PRN is INVALID, please enter Correct PRN.");
                }
                else
                {
                    tf_studname.setEditable(true);
                    tf_studname.setText(rv);
                    tf_studname.setEditable(false);
                }
            //}
        }
    }
    String validateprn()
        {
        
            String stud;
            String sname = null;
            String s[];
            int chk = 0;
            try{
                br = new BufferedReader(new FileReader("Registration.txt"));
                while((stud = br.readLine()) != null)
                {
                    s = stud.split("\\$");
                    if(s[0].equals(tf_prn.getText()))
                    {
                        sname = s[1];
                        chk = 1;
                        break;
                    }
                }
                br.close();
            }
            catch(IOException ioe5)
            {

            }
            if(chk == 0)
                sname = "xx";
            return(sname);
        }
    public static void main(String args[])
    {
        Certi_Courses_Form arf_obj = new Certi_Courses_Form();
        arf_obj.addWindowListener(
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