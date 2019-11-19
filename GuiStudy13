package guistudy;
//클릭 이벤트 처리 

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GuiStudy13 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dimension dim = new Dimension(400,400);
		
		JFrame frame = new JFrame("꺄");
		frame.setLocation(200,400);
		frame.setPreferredSize(dim);
		
		GridLayout layout = new GridLayout(1,2);
		frame.setLayout(layout);
		
		JLabel label = new JLabel("0");
		frame.add(label);
		
		JButton button = new JButton("Click Counter");
		button.setHorizontalAlignment(SwingConstants.CENTER);
		button.setVerticalAlignment(SwingConstants.CENTER);
		frame.add(button);
		
		ActionListener listener = new ActionListener() { 			
			@Override 
			public void actionPerformed(ActionEvent e) {
				label.setText(String.valueOf(Integer.valueOf(label.getText())+1));
				
			}
		};
		button.addActionListener(listener);
		
		frame.add(button);
		frame.pack();
		frame.setVisible(true); 
	}
}
