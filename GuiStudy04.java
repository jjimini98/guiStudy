package guistudy;

import javax.swing.*;
import java.awt.*;

public class GuiStudy04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dimension dim = new Dimension(400,100);
		
		JFrame frame = new JFrame("Jimin's House");
		frame.setLocation(200,400);
		frame.setPreferredSize(dim);
		
		JLabel label = new JLabel();
		label.setText("Jimin 지민");
		label.setOpaque(true);
		
		Font font = new Font("나눔바른펜", Font.BOLD,50);
		label.setFont(font);
		
		Color color = new Color(0x0000FF);
		Color color2 = new Color(255,0,0);
		label.setForeground(color);
		label.setBackground(color2);
		
		frame.add(label);
		frame.pack();
		frame.setVisible(true);
	
	}

}
