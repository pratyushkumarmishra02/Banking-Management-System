
package bank.management.system;

import java.sql.*;

public class Conn 
{
    Connection c;
    Statement s;
    Conn(){
        try{
            c=DriverManager.getConnection("jdbc:mysql:///bankmanagementsystem","root","pratyushmishra@02");
            s=c.createStatement();
        }catch (Exception e){
            System.out.println(e);
    }
}
}