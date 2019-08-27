package swing;
import java.io.*;
import java.sql.*;

import javax.swing.*;

import java.sql.DriverManager;
import java.awt.event.*;
import java.util.*;
public class DbOperation  implements ActionListener{
	Connection con;
	String name,last, roll;
	DbOperation(String a,String c,String b){
	name=a;
	last=b;
	roll=c;
}JFrame jf;JTextField t1,t2,t3;JButton b1,b2;JLabel l1,l2;
	DbOperation(){	  
		jf=new JFrame();
 t1=new JTextField();
t1.setBounds(50,50,150,20);    
jf.add(t1);
l1=new JLabel();
l1.setBounds(360,10,150,20);  
jf.add(l1);
l2=new JLabel();
l2.setBounds(360,50,150,20);
jf.add(l2);
 t3=new JTextField();
t3.setBounds(50,150,150,20);  
jf.add(t3);
 t2=new JTextField();
t2.setBounds(50,100,150,20);  
jf.add(t2);
 b1=new JButton("retrieve");
b2=new JButton("add");
b1.setBounds(50,200,60,30);
b2.setBounds(50,270,60,30);
b1.addActionListener(this);
b2.addActionListener(this);
jf.add(b1);
jf.add(b2);
jf.setSize(500,500);
jf.setLayout(null);
jf.setVisible(true);}  
public static void main(String args[]){
	new DbOperation();
}
public void actionPerformed(ActionEvent e){
	if(e.getSource()==b1){
	String a=t2.getText();
getDetail(a);}
	if(e.getSource()==b2){	String a=t1.getText();
	String b=t2.getText();
String c	=t3.getText();
	addDetail(a,b,c);	}
}
public void getDetail(String b){
	try{Class.forName("com.mysql.jdbc.Driver");
	 con=DriverManager.getConnection("jdbc:mysql://localhost:3306/data","root","root");  
	Statement stm=con.createStatement();
ResultSet rs=stm.executeQuery("Select name,last from person where roll="+b);
	while (rs.next())
	 {
l1.setText(rs.getString("name"));
	 l2.setText(rs.getString("last"));
	
	 }	
	
}catch(Exception e){
	
}}
public void addDetail(String a,String b,String c){
	try{Class.forName("com.mysql.jdbc.Driver");
con=DriverManager.getConnection("jdbc:mysql://localhost:3306/data","root","root");  
Statement stm=con.createStatement();
String	sql = "insert into person values("+"\""+a+"\""+","+"\""+b+"\""+","+"\""+c+"\")";
	stm.executeUpdate(sql);}catch(Exception e){}}}