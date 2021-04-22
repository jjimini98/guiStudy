package guistudy;

//툴팁 : 해당 UI에 마우스를 가져다 대면 도움말을 보여주는 메소드 

import javax.swing.*;
import java.awt.*;

public class GuiStudy12 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dimension dim = new Dimension(400,100);
		
		JFrame frame = new JFrame("Jimin's House");
		frame.setLocation(200,400);
		frame.setPreferredSize(dim);
		
		JButton button = new JButton("Test");
		button.setToolTipText("이것은 테스트 버튼입니다요");
		
		frame.add(button);
		frame.pack();
		frame.setVisible(true);		
		}

}
