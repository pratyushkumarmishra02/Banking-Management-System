package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;


public class Diposit extends JFrame implements ActionListener{
    
    JTextField deposit;
    JButton d,b;
    String pinnumber;
    
    Diposit(String pinnumber){
        
        this.pinnumber=pinnumber;
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2=i1.getImage().getScaledInstance(900, 900,Image.SCALE_DEFAULT );
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(0,0,900,900);
        add(image);
        
        
        JLabel text=new JLabel("Enter amount you want to diposit");
        text.setBounds(210,300,700,35);
        text.setForeground(Color.WHITE);
        text.setFont(new Font("Raleway",Font.BOLD,16));
        image.add(text);
        
        
        deposit=new JTextField();
        deposit.setFont(new Font("Raleway",Font.BOLD,15));
        deposit.setBounds(185,370,300,35);
        image.add(deposit);
        
        
        d=new JButton("Deposit");
        d.setBounds(355,485,150,30);
        d.setFont(new Font("Raleway",Font.BOLD,15));
        d.addActionListener(this);
        image.add(d);
        
        b=new JButton("Back");
        b.setBounds(355,520,150,30);
        d.setFont(new Font("Raleway",Font.BOLD,15));
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
        if(ae.getSource()==d)
        {
            String number= deposit.getText();
            Date date=new Date();
            if (number.equals("")){
                JOptionPane.showMessageDialog(null,"please enter your amount to deposit");
            }else{
                try{
                Conn c=new Conn();
                String q="insert into bank values('"+pinnumber+"','"+date+"','Deposit','"+number+"')";
                c.s.executeUpdate(q);
                JOptionPane.showMessageDialog(null,"Rs "+number+"deposited successfully");
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
        new Diposit("");
    }
}
