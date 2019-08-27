package swing;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class grid  {
	JButton b;JOptionPane pane=new JOptionPane();JButton b1,b2,b3,b4,b5;
	grid(){
JFrame jf=new JFrame();
jf.setLayout(new GridLayout());
GridBagConstraints c = new GridBagConstraints();
c.fill = GridBagConstraints.HORIZONTAL;

  b1 = new JButton("Button 1");
c.weightx = 0;
c.gridx = 0;
c.gridy = 0;
pane.add(b1, c);

 b2 = new JButton("Button 2");
c.gridx = 1;
c.gridy = 0;
pane.add(b2, c);

b3 = new JButton("Button 3");
c.gridx = 2;
c.gridy = 0;
pane.add(b3, c);

b4 = new JButton("Long-Named Button 4");
c.ipady = 40;      //make this component tall
c.weightx = 0.0;
c.gridwidth = 3;
c.gridx = 2;
c.gridy = 1;
pane.add(b4, c);

b5 = new JButton("5");
c.ipady = 1;       //reset to default
c.weighty = 1.0;   //request any extra vertical space
c.anchor = GridBagConstraints.PAGE_END; //bottom of space
c.insets = new Insets(10,0,0,0);  //top padding
c.gridx = 1;       //aligned with button 2
c.gridwidth = 2;   //2 columns wide
c.gridy = 2;       //third row
pane.add(b5, c);
jf.add(pane);
pane.setSize(1000,200);
jf.setVisible(true);
jf.setSize(500,500);
	}
public static void main(String args[]){
	new grid();
}}
