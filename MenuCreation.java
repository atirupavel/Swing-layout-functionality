package swing;
import javax.swing.*;

import java.util.*;
import java.sql.*;
import java.awt.event.*;
public class MenuCreation implements ActionListener{
JFrame f;JComboBox cb1,cb2,cb3,cb4,cb5;JTextField t1,t2,t3,t4,t5,t6,t7;JButton b1;JTable jt;String data[][];
String col[]={"code","name","group","portion","price","type","status"};ArrayList<MenuCreation> arr=new ArrayList();
String aa,bb,cc,dd,ee,ff,gg;String tt1,tt2,tt3,tt4,tt5;String ccb1,ccb2,ccb4,ccb5,ccb3;JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11;JScrollPane js;	
MenuCreation(String a,String b,String c,String d,String e,String f,String g){
	 aa=a;
	 bb=b;
	 cc=c;
	 dd=d;
	 ee=e;
	 ff=f;
	 gg=g;
}

MenuCreation(){
	f=new JFrame("creation page");  
           b1=new JButton("add");
           b1.addActionListener(this);
          l1=new JLabel("service type");
           l2=new JLabel("menu group");
           l3=new JLabel("category");
           l4=new JLabel("code");
           l5=new JLabel("name");
           l6=new JLabel("portion");
           l7=new JLabel("customer type");
           l8=new JLabel("status");
           l9=new JLabel("price");
           l10=new JLabel("UDM");
           l11=new JLabel("nutrition value");
           l1.setBounds(50,10,100,50); 
           l2.setBounds(260,10,100,50);
           l3.setBounds(500,10,100,50);
           l4.setBounds(700,10,100,50);
           l5.setBounds(285,160,100,50);
           l6.setBounds(490,160,100,50);
           l7.setBounds(65,300,100,50);
           l8.setBounds(285,300,100,50);
           l9.setBounds(495,300,100,50);
           l11.setBounds(55,160,100,50);    
       l10.setBounds(680,160,100,50);
String category[]={"accompaniment","supply"};
String ctype[]={"customer1","Customer2"};
String status[]={"active","inactive"};
String stype[]={"breakfast","lunch","dinner"};
String group[]={"food","drinks"};
cb1=new JComboBox(stype);
cb2=new JComboBox(group);
cb3=new JComboBox(category);
cb4=new JComboBox(ctype);
cb5=new JComboBox(status);
t1=new JTextField();
t2=new JTextField();
t3=new JTextField();
t4=new JTextField();
t6=new JTextField();
t7=new JTextField();
t5=new JTextField();
b1.setBounds(680,350,100,50); cb1.setBounds(55,50,100,50);
cb2.setBounds(260,50,100,50); cb3.setBounds(480,50,100,50);t1.setBounds(680,50,100,50);
t2.setBounds(260,200,100,50);t3.setBounds(480,200,100,50);cb4.setBounds(55,350,100,50);
t4.setBounds(480,350,100,50);t6.setBounds(55,200,100,50);t7.setBounds(680,200,100,50);
cb5.setBounds(260,350,100,50);
f.add(l1);f.add(l2);f.add(l3);f.add(l4);f.add(l5);
f.add(l6);f.add(l7);f.add(l8);f.add(l9);
try{Class.forName("com.mysql.jdbc.Driver");
Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/data","root","root");
Statement stm=conn.createStatement();
String sql="select code,name,groups,portion,price,type,status from menu";
ResultSet rs=stm.executeQuery(sql);
String a,b,c,d,e,f,g,h;
while (rs.next())
{
 a= rs.getString("code");
 b= rs.getString("name");
 c= rs.getString("groups");
 d= rs.getString("portion");
 e= rs.getString("price");
 f= rs.getString("type");
 g= rs.getString("status");
 show(a,b,c,d,e,f,g);
}}catch(Exception e){}
String data[][]=new String[arr.size()][7];
for(int i=0;i<arr.size();i++){MenuCreation m= arr.get(i);
	data[i][0]=m.aa;
	data[i][1]=m.bb;
	data[i][2]=m.cc;
	data[i][3]=m.dd;
	data[i][4]=m.ee;
	data[i][5]=m.ff;
	data[i][6]=m.gg;
}
jt=new JTable(data,col);
jt.setBounds(500,500,100,700);
js=new JScrollPane(jt);js.setBounds(0,500,800,700);
f.add(js);f.add(t1);f.add(t2);f.add(t3);f.add(cb1);f.add(cb2);f.add(cb3);
f.add(cb4);f.add(cb5);f.add(b1);f.add(t4);f.add(t7);f.add(t6);
f.setSize(850,850);
f.setLayout(null);
f.setVisible(true);f.add(l11);f.add(l10);
//f.setBackGround(.White);
}
public static void main(String args[]){
new MenuCreation();
}
public void actionPerformed(ActionEvent e){

	if(e.getSource()==b1){
		tt1=this.t1.getText();tt3=this.t3.getText();
tt5=t5.getText();		tt2=this.t2.getText();tt4=this.t4.getText();
	ccb1=(String)this.cb1.getItemAt(this.cb1.getSelectedIndex());	
	ccb2=(String)this.cb2.getItemAt(this.cb2.getSelectedIndex());
	ccb3=(String)this.cb3.getItemAt(this.cb3.getSelectedIndex());
	ccb4=(String)this.cb4.getItemAt(this.cb4.getSelectedIndex());
	ccb5=(String)this.cb5.getItemAt(this.cb5.getSelectedIndex());}
	//JOptionPane.showMessageDialog(f,tt4 );
	try{Class.forName("com.mysql.jdbc.Driver");
	Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/data","root","root");
	Statement stm=conn.createStatement();
	
	String sql="insert into menu values ("+"\""+tt1+"\","+"\""+tt2+"\","+"\""+ccb2+"\","+"\""+tt3+"\","+"\""+tt4+"\","+"\""+ccb4+"\","+"\""+ccb5+"\""+");";

	stm.executeUpdate(sql);
	}
	catch(Exception ee){System.out.print("erroer in addititon");}

}
public void show(String a,String b, String c,String d,String e,String f,String g ){
	arr.add(new MenuCreation(a,b,c,d,e,f,g));
	}
}
