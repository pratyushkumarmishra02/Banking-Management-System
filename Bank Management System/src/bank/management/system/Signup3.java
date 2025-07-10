
package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class Signup3 extends JFrame implements ActionListener{
    
    JRadioButton r1,r2,r3,r4;
    JCheckBox c1,c2,c3,c4,c5,c6,c7;
    JButton submit,cancle;
    String formno;
    Signup3(String formno)
    {
        this.formno=formno;
        setLayout(null);
        
        setSize(850,720);
        setVisible(true);
        setLocation(350,200);
        getContentPane().setBackground(Color.WHITE);
        
        JLabel l1=new JLabel("Account Details");
        l1.setFont(new Font("Raleway",Font.BOLD,22));
        l1.setBounds(280,40,400,40);
        add(l1);
        
        JLabel page=new JLabel("3");
        page.setFont(new Font("Raleway",Font.BOLD,22));
        page.setBounds(400,600,600,25);
        add(page);
        
        JLabel type=new JLabel("Account Type");
        type.setFont(new Font("Raleway",Font.BOLD,22));
        type.setBounds(100,140,300,30);
        add(type);
        
        r1=new JRadioButton("Saving Account");
        r1.setFont(new Font("Raleway",Font.BOLD,16));
        r1.setBounds(100,180,200,20);
        r1.setBackground(Color.WHITE);
        add(r1);
        
        r2=new JRadioButton("Fixed Deposit Account");
        r2.setFont(new Font("Raleway",Font.BOLD,16));
        r2.setBounds(400,180,200,20);
        r2.setBackground(Color.WHITE);
        add(r2);
        
        r3=new JRadioButton("Current Account");
        r3.setFont(new Font("Raleway",Font.BOLD,16));
        r3.setBounds(100,220,200,20);
        r3.setBackground(Color.WHITE);
        add(r3);
        
        r4=new JRadioButton("Recurring Deposit Account");
        r4.setFont(new Font("Raleway",Font.BOLD,16));
        r4.setBounds(400,220,400,20);
        r4.setBackground(Color.WHITE);
        add(r4);
        
        ButtonGroup t=new ButtonGroup();
        t.add(r1);
        t.add(r2);
        t.add(r3);
        t.add(r4);
        
        JLabel card=new JLabel("Card Number:");
        card.setFont(new Font("Raleway",Font.BOLD,22));
        card.setBounds(100,250,300,30);
        add(card);
        
        JLabel number=new JLabel("XXXX-XXXX-XXXX-4037");
        number.setFont(new Font("Raleway",Font.BOLD,22));
        number.setBounds(300,250,300,30);
        add(number);
        
        JLabel carddetail=new JLabel("Your 16 Digits Card Number");
        carddetail.setFont(new Font("Raleway",Font.BOLD,12));
        carddetail.setBounds(100,280,300,22);
        add(carddetail);
        
        JLabel pin=new JLabel("PIN:");
        pin.setFont(new Font("Raleway",Font.BOLD,22));
        pin.setBounds(100,320,300,30);
        add(pin);
        
        JLabel pindetail=new JLabel("Your 4 Digits PIN Number");
        pindetail.setFont(new Font("Raleway",Font.BOLD,12));
        pindetail.setBounds(100,350,300,22);
        add(pindetail);
        
        JLabel pnumber=new JLabel("XXXX");
        pnumber.setFont(new Font("Raleway",Font.BOLD,22));
        pnumber.setBounds(300,320,300,30);
        add(pnumber);
        
        JLabel services=new JLabel("Services Required:");
        services.setFont(new Font("Raleway",Font.BOLD,22));
        services.setBounds(100,370,300,30);
        add(services);
        
        c1=new JCheckBox("ATM Card:");
        c1.setBackground(Color.WHITE);
        c1.setFont(new Font("Raleway",Font.BOLD,22));
        c1.setBounds(100,410,200,30);
        add(c1);
        
        c2=new JCheckBox("Internet Banking:");
        c2.setBackground(Color.WHITE);
        c2.setFont(new Font("Raleway",Font.BOLD,22));
        c2.setBounds(300,410,300,30);
        add(c2);
        
        c3=new JCheckBox("Mobile Banking:");
        c3.setBackground(Color.WHITE);
        c3.setFont(new Font("Raleway",Font.BOLD,22));
        c3.setBounds(100,440,200,30);
        add(c3);
        
        c4=new JCheckBox("EMAIL & SMS Alerts:");
        c4.setBackground(Color.WHITE);
        c4.setFont(new Font("Raleway",Font.BOLD,22));
        c4.setBounds(300,440,300,30);
        add(c4);
        
        c5=new JCheckBox("Cheqe Book:");
        c5.setBackground(Color.WHITE);
        c5.setFont(new Font("Raleway",Font.BOLD,22));
        c5.setBounds(100,470,200,30);
        add(c5);
        
        c6=new JCheckBox("E-Statement:");
        c6.setBackground(Color.WHITE);
        c6.setFont(new Font("Raleway",Font.BOLD,22));
        c6.setBounds(300,470,300,30);
        add(c6);
        
        c7=new JCheckBox("I hereby declare that the above entered details are correct to the best of my knowladge:");
        c7.setBackground(Color.WHITE);
        c7.setFont(new Font("Raleway",Font.BOLD,16));
        c7.setBounds(100,510,800,20);
        add(c7);
        
        submit=new JButton("SUBMIT");
        submit.setBackground(Color.BLACK);
        submit.setForeground(Color.WHITE);
        submit.setBounds(200,550,150,30);
        submit.setFont(new Font("Raleway",Font.BOLD,22));
        submit.addActionListener(this);
        add(submit);
        
        cancle=new JButton("CANCLE");
        cancle.setBackground(Color.BLACK);
        cancle.setForeground(Color.WHITE);
        cancle.setBounds(450,550,150,30);
        cancle.setFont(new Font("Raleway",Font.BOLD,22));
        cancle.addActionListener(this);
        add(cancle);
            
    }
    
    public  void actionPerformed(ActionEvent ae)
    {
        
        if(ae.getSource()==submit)
        {
            String accountType=null;
            if(r1.isSelected())
            {
                accountType="Saving Account";
            }else if(r2.isSelected()){
                accountType="Fixed Deposit Account";
            }else if(r3.isSelected()){
                accountType="Current Account";
            }else if(r4.isSelected()){
                accountType="Recurring Deposit Account";
            }
            Random rand=new Random();
            String cardnumber=""+ Math.abs((rand.nextLong()%90000000L)+ 6709062000000000L);
            String pinnumber=""+Math.abs((rand.nextLong()%9000L)+1000L);
            
            String facility="";
            if(c1.isSelected())
            {
                facility=facility+" ATM Card";
            }else if(c2.isSelected())
            {
                facility=facility+" Internet Banking";
            }else if(c3.isSelected())
            {
                facility=facility+" Mobile Banking";
            }else if(c4.isSelected())
            {
                facility=facility+" EMAIL & SMS Alerts";
            }else if(c5.isSelected())
            {
                facility=facility+" Cheqe Book";
            }else if(c6.isSelected())
            {
                facility=facility+" E-Statement";
            }
            
            try{
                if(accountType.equals("")){
                    JOptionPane.showMessageDialog(null,"Account Type Required");
                }
                 
                    else{
                     Conn c=new Conn();
                     String q1="insert into signup3 values('"+formno+"','"+accountType+"','"+cardnumber+"','"+pinnumber+"','"+facility+"')";
                     String q2="insert into login values('"+formno+"','"+cardnumber+"','"+pinnumber+"')";
                     c.s.executeUpdate(q1);
                     c.s.executeUpdate(q2);
                     
                     JOptionPane.showMessageDialog(null,"Card Number:"+cardnumber+"\n PIN number:"+pinnumber);
                     setVisible(false);
                     new Transaction(pinnumber).setVisible(true);
                }
                
            } catch(Exception e)
            {
                System.out.println(e);
            }
            
        }else if(ae.getSource()==cancle)
        {
            setVisible(false);
            new Login().setVisible(true);
        }
    }
    
    
    public static void main(String[] args) 
       {
          new Signup3("");
       }
    
}
