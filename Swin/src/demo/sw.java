package demo;
import java.awt.event.*;    
import java.awt.*;    
import javax.swing.*; 
import java.awt.event.*;
public class sw {
	public class ColorChooserExample extends JFrame implements ActionListener {    
		JButton b;    
		Container c;    
		ColorChooserExample(){    
		    c=getContentPane();    
		    c.setLayout(new FlowLayout());         
		    b=new JButton("color");    
		    b.addActionListener(this);         
		    c.add(b);    
	}    
	public void actionPerformed(ActionEvent e) {    
		Color initialcolor=Color.RED;    
		Color color=JColorChooser.showDialog(this,"Select a color",initialcolor);    
		c.setBackground(color);    
	}
	};
	public static void main(String[] args){
		JFrame f=new JFrame("Button Example");  
	    final JTextField tf=new JTextField();  
	    tf.setBounds(50,50, 150,20);  
	    JButton b=new JButton("Click Here");  
	    b.setBounds(50,100,95,30);  
	    b.addActionListener(new ActionListener(){  
	    public void actionPerformed(ActionEvent e){  
	            tf.setText("Hello Swing!");  
	        }  
	    });  
	    f.add(b);f.add(tf);  
	    f.setSize(400,400);  
	    f.setLayout(null);  
	    f.setVisible(true);   
	}
}
