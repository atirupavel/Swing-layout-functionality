package swing;
import java.io.*;
import java.sql.*;
import javax.swing.*;
import java.sql.DriverManager;
import java.awt.event.*;
import java.util.*;
public class Jtable implements ActionListener {
	String name,last, roll;
	Jtable(String a,String c,String b){
	name=a;
	last=b;
	roll=c;
}	 JFrame jf=new JFrame();
JTextField tx=new JTextField();
JButton b1=new JButton("retrieve");
JButton b2=new JButton("add");



String col[]= {"name","roll","last_name"};
ArrayList<Jtable> a=new ArrayList<>();
Jtable(){
	try{Class.forName("com.mysql.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/data","root","root");  
Statement stmt=con.createStatement();
ResultSet rs=stmt.executeQuery("Select name,roll,last from persons");
while (rs.next())
	 {
	String d= rs.getString("name");
	String b= rs.getString("roll");
	 String c= rs.getString("last");
	 a.add(new Jtable(d,c,b));
	 }
int n=a.size();
String data[][]=new String[n][3];
for(int i=0;i<n;i++){Jtable t=(Jtable)a.get(i);
data[i][0]=t.name;
data[i][1]=t.roll;
data[i][2]=t.last;}
JTable t=new JTable(data,col);
t.setBounds(30,50,80,90);
JScrollPane js=new JScrollPane(t);
js.setBounds(30,50,80,90);
jf.add(js);
jf.setVisible(true);
jf.setSize(500,300);}
catch(Exception e){} 
}
Jtable(ArrayList arr){
		a=arr;
		int n=a.size();
String data[][]=new String[n][3];
for(int i=0;i<n;i++){Jtable t=(Jtable)a.get(i);
	data[i][0]=t.name;
	data[i][1]=t.roll;
	data[i][2]=t.last;}
JTable t=new JTable(data,col);
t.setBounds(30,50,80,90);
JScrollPane js=new JScrollPane(t);
jf.add(js);
jf.setVisible(true);
jf.setSize(500,300);}
	public static void main(String args[]) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
Jtable j=new Jtable(); 
		int n=Integer.valueOf(br.readLine());
	ArrayList <Jtable> arr=new ArrayList();
	
	for(int i=0;i<n;i++){
String  a=br.readLine();	
String b=br.readLine();
String c=br.readLine();
arr.add(new Jtable(a,b,c));}
new Jtable(arr);

	}  
	public void actionPerformed(ActionEvent e){
		if(e.getSource()==b1){
			
		}
		if(e.getSource()==b2){
			
		}
	}}
