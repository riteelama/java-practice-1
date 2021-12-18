package demoClass;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.*;

import java.awt.*;


public class square {
	public static void main(String [] args) {
		JFrame f = new JFrame();
		JPanel p = new JPanel();
		final JTextField jf;
		JLabel l1 = new JLabel("Number");
		
		jf = new JTextField(30);
		JButton b = new JButton("Calculate Square");
		JLabel l2 = new JLabel("Result");
		final JTextField result = new JTextField(30);
		
		
		
		
		
		
		p.add(l1);
		p.add(jf);
		p.add(b);
		p.add(l2);
		p.add(result);
		
		b.addActionListener(new ActionListener()
				{
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
//					
//				
					int i = Integer.parseInt(jf.getText());
//				
					int r = i*i;
					result.setText(r + "");
					
				}
				});
			
			
		
		
		
		
		f.add(p);
		f.setSize(400,400);
		f.setLayout(new GridLayout());
		f.setVisible(true);
	}
	
	

}
