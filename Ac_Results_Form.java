//Application - 7
//Students Academic Results Form
import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class Ac_Results_Form extends Frame implements ActionListener
{
    Label lb_title, lb_prn, lb_s1, lb_s2, lb_s3, lb_s4, lb_s5, lb_s6, lb_back, lb_studname;
    TextField tf_prn, tf_s1, tf_s2, tf_s3, tf_s4, tf_s5, tf_s6, tf_back, tf_studname;
    Button but_new, but_save, but_back, but_validate;
    BufferedWriter bw = null;
    BufferedReader br = null;
    Ac_Results_Form()
    {
        setSize(1000, 800);
        setVisible(true);
        setLayout(null);
        setTitle("Application - 7");
        setBackground(Color.PINK);
        lb_title = new Label("Registered Students Academic Results Data Retrieval Form");
        lb_prn = new Label("Student PRN");
        lb_s1 = new Label("Sem-1 marks (in %)");
        lb_s2 = new Label("Sem-2 marks (in %)");
        lb_s3 = new Label("Sem-3 marks (in %)");
        lb_s4 = new Label("Sem-4 marks (in %)");
        lb_s5 = new Label("Sem-5 marks (in %)");
        lb_s6 = new Label("Sem-6 marks (in %)");
        lb_back = new Label("No. of Active Backlogs");
        lb_studname = new Label("Student Name");
        tf_prn = new TextField();
        tf_s1 = new TextField();
        tf_s2 = new TextField();
        tf_s3 = new TextField();
        tf_s4 = new TextField();
        tf_s5 = new TextField();
        tf_s6 = new TextField();
        tf_back = new TextField();
        tf_studname = new TextField();
        but_new = new Button("Add New Record");
        but_save = new Button("Save Record");
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
        lb_s1.setFont(f2);
        tf_s1.setFont(f3);
        lb_s2.setFont(f2);
        tf_s2.setFont(f3);
        lb_s3.setFont(f2);
        tf_s3.setFont(f3);
        lb_s4.setFont(f2);
        tf_s4.setFont(f3);
        lb_s5.setFont(f2);
        tf_s5.setFont(f3);
        lb_s6.setFont(f2);
        tf_s6.setFont(f3);
        lb_studname.setFont(f2);
        tf_studname.setFont(f3);
        lb_back.setFont(f2);
        tf_back.setFont(f3);
        but_new.setFont(f2);
        but_save.setFont(f2);
        but_back.setFont(f2);
        but_validate.setFont(f3);

        add(lb_title);
        add(lb_prn);
        add(tf_prn);
        add(lb_s1);
        add(tf_s1);
        add(lb_s2);
        add(tf_s2);
        add(lb_s3);
        add(tf_s3);
        add(lb_s4);
        add(tf_s4);
        add(lb_s5);
        add(tf_s5);
        add(lb_s6);
        add(tf_s6);
        add(lb_studname);
        add(tf_studname);
        add(lb_back);
        add(tf_back);
        add(but_new);
        add(but_save);
        add(but_back);
        add(but_validate);


        lb_title.setBounds(40, 100, 925, 40);
        lb_prn.setBounds(200, 200, 200, 30);
        tf_prn.setBounds(525, 200, 200, 30);
        but_validate.setBounds(750, 200, 170, 30);
        lb_studname.setBounds(200, 250, 200, 30);
        tf_studname.setBounds(525, 250, 400, 30);
        lb_s1.setBounds(200, 300, 275, 30);
        tf_s1.setBounds(525, 300, 200, 30);
        lb_s2.setBounds(200, 350, 275, 30);
        tf_s2.setBounds(525, 350, 200, 30);
        lb_s3.setBounds(200, 400, 275, 30);
        tf_s3.setBounds(525, 400, 200, 30);
        lb_s4.setBounds(200, 450, 275, 30);
        tf_s4.setBounds(525, 450, 200, 30);
        lb_s5.setBounds(200, 500, 275, 30);
        tf_s5.setBounds(525, 500, 200, 30);
        lb_s6.setBounds(200, 550, 275, 30);
        tf_s6.setBounds(525, 550, 200, 30);
        lb_back.setBounds(200, 600, 300, 30);
        tf_back.setBounds(525, 600, 200, 30);
        but_new.setBounds(100, 650, 250, 30);
        but_save.setBounds(400, 650, 250, 30);
        but_back.setBounds(700, 650, 250, 30);
        
        tf_prn.addKeyListener(
            new KeyAdapter()
            {
                public void keyTyped(KeyEvent ke)
                {
                    if(tf_prn.getText().length() >= 7)
                        ke.consume();
                }
            }
        );
        tf_s1.addKeyListener(
            new KeyAdapter()
            {
                public void keyTyped(KeyEvent ke)
                {
                    if(tf_s1.getText().length() >= 6)
                        ke.consume();
                    if(ke.getKeyChar() >= '0' && ke.getKeyChar() <= '9')
                        return;
                    else if(ke.getKeyChar() == '.')
                        return;
                    else
                        ke.consume();
                }
            }
        );
        tf_s2.addKeyListener(
            new KeyAdapter()
            {
                public void keyTyped(KeyEvent ke)
                {
                    if(tf_s2.getText().length() >= 6)
                        ke.consume();
                    if(ke.getKeyChar() >= '0' && ke.getKeyChar() <= '9')
                        return;
                    else if(ke.getKeyChar() == '.')
                        return;
                    else
                        ke.consume();
                }
            }
        );
        tf_s3.addKeyListener(
            new KeyAdapter()
            {
                public void keyTyped(KeyEvent ke)
                {
                    if(tf_s3.getText().length() >= 6)
                        ke.consume();
                    if(ke.getKeyChar() >= '0' && ke.getKeyChar() <= '9')
                        return;
                    else if(ke.getKeyChar() == '.')
                        return;
                    else
                        ke.consume();
                }
            }
        );
        tf_s4.addKeyListener(
            new KeyAdapter()
            {
                public void keyTyped(KeyEvent ke)
                {
                    if(tf_s4.getText().length() >= 6)
                        ke.consume();
                    if(ke.getKeyChar() >= '0' && ke.getKeyChar() <= '9')
                        return;
                    else if(ke.getKeyChar() == '.')
                        return;
                    else
                        ke.consume();
                }
            }
        );
        tf_s5.addKeyListener(
            new KeyAdapter()
            {
                public void keyTyped(KeyEvent ke)
                {
                    if(tf_s5.getText().length() >= 6)
                        ke.consume();
                    if(ke.getKeyChar() >= '0' && ke.getKeyChar() <= '9')
                        return;
                    else if(ke.getKeyChar() == '.')
                        return;
                    else
                        ke.consume();
                }
            }
        );
        tf_s6.addKeyListener(
            new KeyAdapter()
            {
                public void keyTyped(KeyEvent ke)
                {
                    if(tf_s6.getText().length() >= 6)
                        ke.consume();
                    if(ke.getKeyChar() >= '0' && ke.getKeyChar() <= '9')
                        return;
                    else if(ke.getKeyChar() == '.')
                        return;
                    else
                        ke.consume();
                }
            }
        );
        tf_back.addKeyListener(
            new KeyAdapter()
            {
                public void keyTyped(KeyEvent ke)
                {
                    if(tf_back.getText().length() >= 1)
                        ke.consume();
                    if(ke.getKeyChar() >= '0' && ke.getKeyChar() <= '9')
                        return;
                    else
                        ke.consume();
                }
            }
        );
        tf_prn.setEditable(false) ;
        tf_s1.setEditable(false) ;
        tf_s2.setEditable(false) ;
        tf_s3.setEditable(false) ;
        tf_s4.setEditable(false) ;
        tf_s5.setEditable(false) ;
        tf_s6.setEditable(false) ;
        tf_back.setEditable(false);
        but_save.setEnabled(false);
        tf_studname.setEditable(false);

        try{
            bw = new BufferedWriter(new FileWriter("AcResults.txt", true));
        }
        catch(IOException ioe1)
        {

        }
    }
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource() == but_new)
        {
            tf_prn.setEditable(true) ;
            tf_s1.setEditable(true) ;
            tf_s2.setEditable(true) ;
            tf_s3.setEditable(true) ;
            tf_s4.setEditable(true) ;
            tf_s5.setEditable(true) ;
            tf_s6.setEditable(true) ;
            tf_back.setEditable(true);
            but_save.setEnabled(true);
            but_new.setEnabled(false);
        }
        else if(ae.getSource() == but_save)
        {
            if(tf_prn.getText().length() == 0)
            {
                tf_prn.requestFocus();
                JOptionPane.showMessageDialog(this, "PRN is left empty, please Enter PRN.");
            }
            else if(tf_studname.getText().equals("xx") || tf_studname.getText().length() == 0)
            {
                JOptionPane.showMessageDialog(this,"Input PRN is INVALID, so record will not be Saved.");
            }
            else if(tf_s1.getText().length() == 0)
            {
                tf_s1.requestFocus();
                JOptionPane.showMessageDialog(this, "Sem-1 Marks is left empty, please Enter Sem-1 Marks.");
            }
            else if(tf_s2.getText().length() == 0)
            {
                tf_s2.requestFocus();
                JOptionPane.showMessageDialog(this, "Sem-2 Marks is left empty, please Enter Sem-2 Marks.");
            }
            else if(tf_s3.getText().length() == 0)
            {
                tf_s3.requestFocus();
                JOptionPane.showMessageDialog(this, "Sem-3 Marks is left empty, please Enter Sem-3 Marks.");
            }
            else if(tf_s4.getText().length() == 0)
            {
                tf_s4.requestFocus();
                JOptionPane.showMessageDialog(this, "Sem-4 Marks is left empty, please Enter Sem-4 Marks.");
            }
            /* 
            else if(tf_back.getText().length() == 0)
            {
                tf_back.requestFocus();
                JOptionPane.showMessageDialog(this, "No. of Backlogs is left empty, please Enter No. of Backlogs.");
            }
            */
            else
            {
                String prn = tf_prn.getText();
                String s1 = tf_s1.getText();
                String s2 = tf_s2.getText();
                String s3 = tf_s3.getText();
                String s4 = tf_s4.getText();
                String s5 = tf_s5.getText();
                String s6 = tf_s6.getText();
                String backlog = tf_back.getText();
                if(s5.length() == 0)
                    s5 = "-";
                if(s6.length() == 0)
                    s6 = "-";
                if(backlog.length() == 0)
                    backlog = "0";
                try{
                
                        bw.write(prn + "$" + s1 + "$" + s2 + "$" + s3 + "$" + s4 + "$" + s5 + "$" + s6 + "$" + backlog);
                        bw.newLine();
                        JOptionPane.showMessageDialog(this, "Academic Result of Student Saved Successfully.");
                        tf_prn.setText("");
                        tf_s1.setText("");
                        tf_s2.setText("");
                        tf_s3.setText("");
                        tf_s4.setText("");
                        tf_s5.setText("");
                        tf_s6.setText("");
                        tf_back.setText("");
                        tf_prn.setEditable(false) ;
                        tf_s1.setEditable(false) ;
                        tf_s2.setEditable(false) ;
                        tf_s3.setEditable(false) ;
                        tf_s4.setEditable(false) ;
                        tf_s5.setEditable(false) ;
                        tf_s6.setEditable(false) ;
                        tf_back.setEditable(false);
                        but_save.setEnabled(false);
                        but_new.setEnabled(true);
                }
                catch(IOException ioe3)
                {
                    
                }
            }
        }
        else if(ae.getSource() == but_back)
        {
            try{
                //br.close();
                bw.close();
            }
            catch(IOException ioe2)
            {

            }
            dispose();
        }
        else if(ae.getSource() == but_validate)
        {
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
            catch(IOException ioe4)
            {

            }
            if(chk == 0)
                sname = "xx";
            return(sname);
        }

    public static void main(String args[])
    {
        Ac_Results_Form arf_obj = new Ac_Results_Form();
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