package guistudy;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class GuiStudy15 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dimension dim = new Dimension(400,300);
		
		JFrame frame = new JFrame("Jimin's Calculator");
		frame.setLocation(200, 400);
		frame.setPreferredSize(dim);
		
		JTextField textfield = new JTextField();
		JTextField textfield2 = new JTextField();
		//만약에 텍스트를 미리 지정하고 싶다면 setText() 메소드를 사용하면 된다. 
		textfield.setText("여기다가 무엇을 입력하냐면!");
		textfield.setEnabled(false);
		textfield2.setHorizontalAlignment(JTextField.RIGHT);
		
		JLabel label = new JLabel("입력");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setVerticalAlignment(SwingConstants.CENTER);
		
		JButton button = new JButton("OK");
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				label.setText(textfield.getText());
				label.setText(textfield2.getText());
			}
		});
		
		
		frame.add(textfield, BorderLayout.WEST); //프레임 안에서의 위치지정 
		frame.add(textfield2, BorderLayout.CENTER);
		frame.add(label, BorderLayout.NORTH);
		frame.add(button, BorderLayout.SOUTH);
		
		frame.pack();
		frame.setVisible(true);
		
	}

}
