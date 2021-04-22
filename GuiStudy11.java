package guistudy;

import javax.swing.*;
import java.awt.*;

public class GuiStudy11 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dimension dim = new Dimension(400,100);
		
		JFrame frame = new JFrame("Jimin's House");
		frame.setLocation(200,400);
		frame.setPreferredSize(dim);
		
		JButton button = new JButton("Test");
		button.setHorizontalAlignment(SwingConstants.LEFT); //수평으로 왼쪽정렬
		//HorizontalAlignment 는 가로(수평)정렬이라 BOTTOM 또는 TOP 변수가 들어갈 수 없음. 
		//마찬가지로 setVerticalAlignment 는 세로(수직)정렬이라 LEFT 또는 RIGHT 변수가 들어갈 수 없다. 
		button.setVerticalAlignment(SwingConstants.BOTTOM); //수직으로 맨 밑 정렬
		//SwingConstants는 정렬에 관련된 인터페이스이다. 정렬이 필요할 경우 호출하여 사용하면 됨.
		
		frame.add(button);
		frame.pack();
		frame.setVisible(true);
		
	}

}
