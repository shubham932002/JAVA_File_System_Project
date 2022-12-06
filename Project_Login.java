// Project Application NO - 1
// Login Form

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Project_Login extends Frame implements ActionListener
{
    Label lb1, lb2, lb3, lb4, lb5, lb_usnm, lb_pwd;
    TextField tf_usnm, tf_pwd;
    Button but_log, but_cancel;
    Project_Login()
    {
        setSize(1000, 700);
        setVisible(true);
        setLayout(null);
        setBackground(Color.PINK);
        lb1 = new Label("A S/W Project");
        lb2 = new Label("Students Campus Placement Information System");
        lb3 = new Label("Developed for TnP Section of");
        lb4 = new Label("PCCOER, Ravet, Pune");
        lb5 = new Label("User's Authentication Form (Login Form)");
        lb_usnm = new Label("Username/ID : ");
        lb_pwd = new Label("Password      : ");
        tf_usnm = new TextField();
        tf_pwd = new TextField();
        but_log = new Button("Login");
        but_cancel = new Button("Cancel");
        but_log.addActionListener(this);
        but_cancel.addActionListener(this);

        Font f1, f2, f3;
        f1 = new Font("arial black", Font.PLAIN, 36);
        f2 = new Font("arial", Font.BOLD, 32);
        f3 = new Font("times new roman", Font.BOLD, 22);
        lb1.setFont(f3);
        lb2.setFont(f2);
        lb3.setFont(f3);
        lb4.setFont(f2);
        lb5.setFont(f1);
        lb_usnm.setFont(f3);
        lb_pwd.setFont(f3);
        tf_usnm.setFont(f3);
        tf_pwd.setFont(f3);
        but_log.setFont(f3);
        but_cancel.setFont(f3);

        add(lb1);
        add(lb2);
        add(lb3);
        add(lb4);
        add(lb5);
        add(lb_usnm);
        add(lb_pwd);
        add(tf_usnm);
        add(tf_pwd);
        add(but_log);
        add(but_cancel);

        lb1.setBounds(425, 50, 200, 25);
        lb2.setBounds(125, 100, 800, 40);
        lb3.setBounds(350, 150, 500, 25);
        lb4.setBounds(350, 200, 500, 30);
        lb5.setBounds(175, 275, 800, 40);
        lb_usnm.setBounds(300, 375, 175, 30);
        tf_usnm.setBounds(475, 375, 250, 30);
        lb_pwd.setBounds(300, 425, 175, 30);
        tf_pwd.setBounds(475, 425, 250, 30);
        but_log.setBounds(350, 490, 150, 30);
        but_cancel.setBounds(525, 490, 150, 30);

        tf_pwd.setEchoChar('*');
    }
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource() == but_log)
        {
            if(tf_usnm.getText().length() == 0 || tf_pwd.getText().length() == 0)
            {
                tf_usnm.requestFocus();
                JOptionPane.showMessageDialog(this, "You did not enter Username or Password. Please Enter.");
            }
            else
            {
                if((tf_usnm.getText().equals("Ram") || tf_usnm.getText().equals("Sham") || tf_usnm.getText().equals("Tom")) && (tf_pwd.getText().equals("SAI")))
                {
                    dispose();
                    new Project_Modules();
                }
                else
                {
                    JOptionPane.showMessageDialog(this, "You entered Wrong Username or Password.");
                }
            }
        }
        else if(ae.getSource() == but_cancel)
        {
            dispose();
        }
    }
    public static void main(String args[])
    {
        Project_Login obj = new Project_Login();
        obj.addWindowListener
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
