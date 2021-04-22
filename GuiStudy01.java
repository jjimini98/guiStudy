package guistudy;

import javax.swing.*;
import java.awt.*;

public class Guistudy01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dimension dim = new Dimension(500,300);
		JFrame frame = new JFrame("Jimin's House");
		JLabel label = new JLabel("Welcome to Jimin's Program!"); 
		frame.setLocation(1000,500); //JFrame의 위치 지정  
		frame.setPreferredSize(dim);
		frame.add(label);
		frame.pack();
		frame.setVisible(true); //False로 하면 디스틀레이 되지 않음
		
		
		
		
		
	}

}
