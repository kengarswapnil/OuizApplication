
package javaapplication2;
import javax.swing.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;
public class Login extends JFrame implements ActionListener{
    
      JButton rules,Back;
        JTextField tfname;
       
   public  Login(){
       
     
       getContentPane().setBackground(Color.WHITE);
       setLayout(null);
       ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/Login.jpeg"));
       JLabel image =new JLabel(i1);
       image.setBounds(0,0,400,400);
       add(image);
       
       JLabel  heading = new JLabel("Simple Minds");
       heading.setBounds(550,60,300,45);
       heading.setFont(new Font("viner Hand ITC",Font.BOLD ,40));
       heading.setForeground(new Color(30,144,254));
       add(heading);
       
       JLabel  name = new JLabel("Enter Your Name");
        name.setBounds(600,150,300,45);
       name.setFont(new Font("Mongolian Baiti",Font.BOLD ,18));
       name.setForeground(new Color(30,144,254));
       add(name);
       
       
        tfname=new JTextField();
       tfname.setBounds(535,200,300,25);
        tfname.setFont(new Font("Times New Roman",Font.BOLD,20));
        add(tfname);
        
        
       rules=new JButton("Rules");
      rules.setBounds(535,270,120,25);
      rules.setBackground(new Color(30,144,254));
      rules.setForeground(Color.WHITE);
      rules.addActionListener(this);
              add(rules);
        
              
       Back=new JButton("Back");
      Back.setBounds(735,270,120,25);
      Back.setBackground(new Color(30,144,254));
      Back.setForeground(Color.WHITE);
      Back.addActionListener(this);
              add(Back);
        
        
        
        setSize(1000,400);
        setLocation(150,150);
        setVisible(true);
    }
   
   public void actionPerformed(ActionEvent ae)
   {
      
       if(ae.getSource()== rules ){
           String name=tfname.getText();
           setVisible(false);
           new Rules(name);
       
       }else if(ae.getSource()==Back){
           setVisible(false);
       
       
       }   
   }
       
    public static void main(String[] args)
    {
       new Login();
    }
}
