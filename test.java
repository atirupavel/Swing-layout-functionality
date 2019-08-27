package swing;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class test implements ActionListener,ItemListener{
JFrame jf=new JFrame();JButton b;
JRadioButton r;ButtonGroup bg;
test(){
JTextField tf=new JTextField();
tf.setBounds(40,40,59,89);
 b=new JButton("click");
b.setBounds(45,67,65,45);b.addActionListener(this);
JCheckBox c=new JCheckBox("check");c.addItemListener(this);
c.setBounds(34,100,54,43);
 r=new JRadioButton();
 bg=new ButtonGroup();
 r.setBounds(200,20,86,89);
jf.setVisible(true);
jf.setSize(400,400);
jf.setLayout(null);
jf.add(b);jf.add(c);jf.add(r);
JComboBox cb= new JComboBox();
cb.setBounds(34,45,56,45);
}
public static void main(String args[]){
new	test();
}
public void actionPerformed(ActionEvent e){
	if(e.getSource()==b){
if(r.isSelected()){JOptionPane.showMessageDialog(jf,"hello");}
	}
}
public void itemStateChanged(ItemEvent e){
	JOptionPane.showMessageDialog(jf,e.getStateChange()==1?"checked":"unchecked");
}}
