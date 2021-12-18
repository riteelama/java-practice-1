package demoClass;
import javax.swing.*;
import java.awt.event.*;
public class swingExample02 implements ActionListener {
	JTextField tf1, tf2;
	swingExample02(){
		JFrame f  = new JFrame();
		tf1 = new JTextField();
		tf1.setBounds(50,50,150,20);
		tf2 = new JTextField();
		tf2.setBounds(50,100,150,20);
		tf2.setEditable(false);
		JButton b = new JButton("Calculate Square");
		b.setBounds(50,150,150,20);
		b.addActionListener(this);
		f.add(tf1);
		f.add(b);
		f.add(tf2);
		f.setSize(300,300);
		f.setLayout(null);
		f.setVisible(true);
		}
	public void actionPerformed(ActionEvent e) {
		int a = Integer.parseInt(tf1.getText());
		int res = a*a;
		tf2.setText(res + "");  
	}
	public static void main(String [] args)
	{
		new swingExample02();
	}
}
