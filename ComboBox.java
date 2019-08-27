package swing;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;    
public class ComboBox implements ActionListener{    
JFrame f;    JComboBox cb;
ComboBox(){    
    f=new JFrame("ComboBox Example");    
    String country[]={"India","Australia","U.S.A","England","Newzealand"};        
     cb=new JComboBox(country);    
    cb.setBounds(50, 5,66,20);    
    f.add(cb);        
    f.setLayout(null);    
    f.setSize(400,500);    
    f.setVisible(true);      
    cb.addActionListener(this);
}    
public static void main(String[] args) {    
    new ComboBox();         
}    
public void actionPerformed(ActionEvent e){
	JOptionPane.showMessageDialog(f,cb.getItemAt(cb.getSelectedIndex()));
}}   