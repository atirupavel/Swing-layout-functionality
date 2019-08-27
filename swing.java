package swing;
import javax.swing.*;  
import java.sql.*;
  import java.awt.event.*;  
public class swing extends JFrame implements ActionListener{  
    JTextField tf,tf1; JButton b;  String sql;
    swing(){  
        tf=new JTextField();  
       tf1=new JTextField(); 
       tf.setBounds(50,50,100,50);
       tf1.setBounds(50,100,100,50);
          b=new JButton("save");  
        b.setBounds(50,150,95,30);  
        b.addActionListener(this);    
        add(tf1);add(b);add(tf);    
        setSize(400,400);  
        setLayout(null); 
        setVisible(true);  
        setDefaultCloseOperation(EXIT_ON_CLOSE);  
            }  
    public void actionPerformed(ActionEvent e) {  
          try{ Class.forName("com.mysql.jdbc.Driver");  
    Connection con=DriverManager.getConnection(  
   	 "jdbc:mysql://localhost:3306/data","root","root");  
    Statement stmt=con.createStatement(); 
    try{  sql = "insert into registration values("+tf.getText()+","+"\""+tf1.getText()+"\""+")"; 
    }catch(NullPointerException n)
    {System.out.print("null pointer");}
    stmt.executeUpdate(sql);    	  
    }catch(Exception ex){
    	ex.printStackTrace();}}
    public static void main(String[] args) {  
        new swing();  } }  