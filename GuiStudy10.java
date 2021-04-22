package guistudy;

import javax.swing.*;
import java.awt.*;

public class GuiStudy10 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dimension dim = new Dimension(400,100);
		
		JFrame frame = new JFrame("Jimin's House");
		frame.setLocation(200, 400);
		frame.setPreferredSize(dim);

		JButton button = new JButton("Test");
		button.setBackground(Color.CYAN);
		
		frame.add(button);
		frame.pack();
		frame.setVisible(true);
		
	}

}
