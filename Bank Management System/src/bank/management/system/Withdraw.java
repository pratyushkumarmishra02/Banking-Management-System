package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;


public class Withdraw extends JFrame implements ActionListener{
    
    JTextField withdraw;
    JButton w,b;
    String pinnumber;
    
    Withdraw(String pinnumber){
        
        this.pinnumber=pinnumber;
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2=i1.getImage().getScaledInstance(900, 900,Image.SCALE_DEFAULT );
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(0,0,900,900);
        add(image);
        
        
        JLabel text=new JLabel("Enter amount you want to withdraw");
        text.setBounds(210,300,700,35);
        text.setForeground(Color.WHITE);
        text.setFont(new Font("Raleway",Font.BOLD,16));
        image.add(text);
        
        
        withdraw=new JTextField();
        withdraw.setFont(new Font("Raleway",Font.BOLD,15));
        withdraw.setBounds(185,370,300,35);
        image.add(withdraw);
        
        
        w=new JButton("Withdraw");
        w.setBounds(355,485,150,30);
        w.setFont(new Font("Raleway",Font.BOLD,15));
        w.addActionListener(this);
        image.add(w);
        
        b=new JButton("Back");
        b.setBounds(355,520,150,30);
        b.setFont(new Font("Raleway",Font.BOLD,15));
        b.addActionListener(this);
        image.add(b);
        
        
        setSize(900,900);
        setLocation(350,0);
        //getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        //setUndecorated(true);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==w)
        {
            String number= withdraw.getText();
            Date date=new Date();
            if (number.equals("")){
                JOptionPane.showMessageDialog(null,"please enter your amount to withdraw");
            }else{
                try{
                Conn c=new Conn();
                String q="insert into bank values('"+pinnumber+"','"+date+"','Withdraw','"+number+"')";
                c.s.executeUpdate(q);
                JOptionPane.showMessageDialog(null,"Rs "+number+" withdrawl successfully");
                setVisible(false);
                new Transaction(pinnumber).setVisible(true);
                }catch(Exception e)
                {
                    System.out.println(e);
                }
            }
        }else if(ae.getSource()==b){
            setVisible(false);
            new Transaction(pinnumber).setVisible(true);
        }
    } 
    
    public static void main(String args[]){
        new Withdraw("");
    }
}
